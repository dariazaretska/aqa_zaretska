package hillel.rest;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UserTest {

    private static RequestSpecification requestSpecification;
    private final String relativeUrl = "/api/users";

    @BeforeTest
    public static void init() {
        requestSpecification = new RequestSpecBuilder()
                .setBaseUri("https://reqres.in")
                .setContentType(ContentType.JSON)
                .addFilter(new RequestLoggingFilter())
                .addFilter(new ResponseLoggingFilter())
                .build();
    }

    @Test
    public void createUser() {
        User user1 = RestAssured.given()
                .spec(requestSpecification)
                .when()
                .body(User
                        .builder().
                        name("morpheus")
                        .job("leader")
                        .build())
                .post(relativeUrl)
                .then()
                .statusCode(201)
                .extract()
                .as(User.class);
        Assert.assertEquals(user1.getName(),"morpheus");
        Assert.assertEquals(user1.getJob(),"leader");

    }

}
