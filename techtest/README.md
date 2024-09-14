
# Kairós technical test


## Description

## Components

### H2 database
Database created in local memory, loaded with data in execution time. This database is deleted when the application ends and gets re-created each time with the contents of techtest\src\main\resources\static\data.sql

## How to

In order to check manually the database, access http://localhost:8080/h2-console. Using the password 'password' (as set in the application.properties) allows access

![alt text](image.png)

## Tests