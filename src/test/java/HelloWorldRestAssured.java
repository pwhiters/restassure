import org.junit.Test;

import static com.jayway.restassured.RestAssured.given;

/**
 * Created by pwhit on 5/11/2017.
 */
public class HelloWorldRestAssured {

       @Test
        public void makeSureThatGoogleIsUp() {
            given().when().get("http://www.google.com").then().statusCode(200);
        }

        @Test
        public void makeSureHOBSIsUp() { given().when().get("http://api.weather.com/v2/aggcommon/v3-links?geocode=39.58,-74.46&format=json&par=samsung_widget&language=en-US&apiKey=45720848946ac3b87c8eeca0686a11ad").then().statusCode(200);}


}
