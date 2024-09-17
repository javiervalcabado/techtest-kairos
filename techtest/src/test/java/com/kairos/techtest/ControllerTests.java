package com.kairos.techtest;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import com.kairos.techtest.model.dto.Price;


@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class ControllerTests {

    @LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

    @Test
	void contextLoads() {

	}

    @SuppressWarnings("null")
    @Test
    public void validationTests(){

        // 4 entries in the DB
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/count",
				String.class)).contains("4");

        ResponseEntity<Price> response = getRestTemplate("2020-06-14 10:00:00", "35455", "1");
        assertThat(response.getBody().getPriceList()).isEqualTo(1);
        assertThat(response.getBody().getPrice()).isEqualTo(35.5);

        response = getRestTemplate("2020-06-14 16:00:00", "35455", "1");
        assertThat(response.getBody().getPriceList()).isEqualTo(2);
        assertThat(response.getBody().getPrice()).isEqualTo(25.45);

        response = getRestTemplate("2020-06-14 21:00:00", "35455", "1");
        assertThat(response.getBody().getPriceList()).isEqualTo(1);
        assertThat(response.getBody().getPrice()).isEqualTo(35.5);

        response = getRestTemplate("2020-06-15 10:00:00", "35455", "1");
        assertThat(response.getBody().getPriceList()).isEqualTo(3);
        assertThat(response.getBody().getPrice()).isEqualTo(30.5);

        response = getRestTemplate("2020-06-16 21:00:00", "35455", "1");
        assertThat(response.getBody().getPriceList()).isEqualTo(4);
        assertThat(response.getBody().getPrice()).isEqualTo(38.95);

    }

    public ResponseEntity<Price> getRestTemplate(String date, String productID, String brandID) {
       
        return this.restTemplate.exchange("/get?date={date}&productID={productID}&brandID={brandID}", HttpMethod.GET, null, Price.class, date, productID, brandID);
    }
}
