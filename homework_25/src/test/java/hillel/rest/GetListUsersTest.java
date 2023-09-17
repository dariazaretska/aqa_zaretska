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
import static org.testng.Assert.assertTrue;

public class GetListUsersTest {

    private static RequestSpecification requestSpecification;
    private final String relativeUrl = "/api/users?page=2";

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
    public void restTest() {
        Response response = RestAssured.given()
                .spec(requestSpecification)
                .get(relativeUrl)
                .thenReturn();
                response.print();
    }

    @Test
    public void testTotalPages() {
        Response response = RestAssured.given()
                .spec(requestSpecification)
                .get(relativeUrl);

        int totalPages = response.jsonPath()
                .getInt("total_pages");
        assertEquals(totalPages, 2);
    }

    @Test
    public void testFirstUserName() {
        Response response = RestAssured.given()
                .spec(requestSpecification)
                .get(relativeUrl);

        String firstName = response.jsonPath()
                .getString("data[0].first_name");
        assertEquals(firstName, "Michael");
    }

    @Test
    public void testSupportText() {
        Response response = RestAssured.given()
                .spec(requestSpecification)
                .get(relativeUrl);

        String supportText = response.jsonPath()
                .getString("support.text");
        assertTrue(supportText.contains("To keep ReqRes free, contributions towards server costs are appreciated!"));
    }
}
