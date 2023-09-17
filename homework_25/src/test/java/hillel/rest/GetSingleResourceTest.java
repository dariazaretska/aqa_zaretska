package hillel.rest;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class GetSingleResourceTest {

    private static RequestSpecification requestSpecification;
    private final String relativeUrl = "/api/unknown/2";

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
    public void testStatusCode() {
        Response response = RestAssured.given()
                .spec(requestSpecification)
                .get(relativeUrl);

        int statusCode = response.getStatusCode();
        assertEquals(statusCode, 200);
    }


    @Test
    public void testId() {
        Response response = RestAssured.given()
                .spec(requestSpecification)
                .get(relativeUrl);

        int id = response.jsonPath()
                .getInt("data.id");
        assertEquals(id, 2);
    }

    @Test
    public void testName() {
        Response response = RestAssured.given()
                .spec(requestSpecification)
                .get(relativeUrl);

        String name = response.jsonPath()
                .getString("data.name");
        assertEquals(name, "fuchsia rose");
    }
}
