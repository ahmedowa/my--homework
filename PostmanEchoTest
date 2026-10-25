package org.example;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTest {

    @Test
    void verifyGetMethodWithParams() {
        given()
                .param("key1", "value1")
                .param("key2", "value2")
        .when()
                .get("https://postman-echo.com")
        .then()
                .log().body()
                .statusCode(200)
                .body("args.key1", equalTo("value1"))
                .body("args.key2", equalTo("value2"));
    }

    @Test
    void verifyPostWithPlainBody() {
        given()
                .body("custom payload text")
        .when()
                .post("https://postman-echo.com")
        .then()
                .log().body()
                .statusCode(200)
                .body("data", equalTo("custom payload text"));
    }

    @Test
    void verifyPostWithUrlEncodedForm() {
        given()
                .contentType("application/x-www-form-urlencoded; charset=utf-8")
                .formParam("paramA", "resultA")
                .formParam("paramB", "resultB")
        .when()
                .post("https://postman-echo.com")
        .then()
                .log().body()
                .statusCode(200)
                .body("form.paramA", equalTo("resultA"))
                .body("form.paramB", equalTo("resultB"));
    }

    @Test
    void verifyPutDataModification() {
        given()
                .body("modified content")
        .when()
                .put("https://postman-echo.com")
        .then()
                .log().body()
                .statusCode(200)
                .body("data", equalTo("modified content"));
    }

    @Test
    void verifyPatchPartialUpdate() {
        given()
                .body("delta changes")
        .when()
                .patch("https://postman-echo.com")
        .then()
                .log().body()
                .statusCode(200)
                .body("data", equalTo("delta changes"));
    }

    @Test
    void verifyDeleteOperation() {
        given()
                .body("remove this item")
        .when()
                .delete("https://postman-echo.com")
        .then()
                .log().body()
                .statusCode(200)
                .body("data", equalTo("remove this item"));
    }
}
