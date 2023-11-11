# java-web-maven-spring-thyme-aragondb-simple

## Description
A POC for springboot web app with thymeleaf support
connecting to a database.

## Tech stack
- java
- hibernate
- maven
  - springboot
  - thymeleaf
  - aragon connector
- bootstrap
- jquery
- dataTable

## Docker stack
- arangodb/arangodb:3.9.2-noavx
- maven:3-openjdk-17

## To run
`sudo ./install.sh -u`

[Available](http://localhost)

## To stop
`sudo ./install.sh -d`

## For help
`sudo ./install.sh -h`

## Credit
[Aragondb spring example](https://github.com/eugenp/tutorials/blob/master/persistence-modules/spring-data-arangodb/pom.xml)