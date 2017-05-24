import org.junit.Test;

import static com.jayway.restassured.RestAssured.given;

/**
 * Created by pwhit on 5/11/2017.
 */
public class GarageRestTest extends FunctionalTest{
    @Test
    public void basicPingTest() {
        given().when().get("/garage").then().statusCode(200);
    }

}
