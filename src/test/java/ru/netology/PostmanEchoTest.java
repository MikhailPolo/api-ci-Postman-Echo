package ru.netology;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

class PostmanEchoTest {
    @Test
    void shouldGetData() {
        given()
                .baseUri("https://postman-echo.com")
                .body("some data")
        .when()
                .post("/post")
        .then()
                .statusCode(200)
                .body("data", equalTo("14.01.2023"));
    }
}
