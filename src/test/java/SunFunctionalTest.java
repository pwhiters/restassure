import com.jayway.restassured.RestAssured;
import org.junit.BeforeClass;
import org.junit.Test;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.hasSize;

/**
 * Created by pwhit on 5/11/2017.
 */
public class SunFunctionalTest {

    @BeforeClass
    public static void setup() {
        String port = System.getProperty("server.port");
        if (port == null) {
            RestAssured.port = Integer.valueOf(80);
        }
        else{
            RestAssured.port = Integer.valueOf(port);
        }


        String basePath = System.getProperty("server.base");
        if(basePath==null){
            basePath = "/v2/aggcommon";
        }
        RestAssured.basePath = basePath;

        String baseHost = System.getProperty("server.host");
        if(baseHost==null){
            baseHost = "http://api.weather.com";
        }
        RestAssured.baseURI = baseHost;

        System.out.println("Leaving FunctionalTest");

    }


/*

    @Test
    public void V3LinksTest() {
        given().when().get("/v3-links?geocode=39.58,-74.46&format=json&par=samsung_widget&language=en-US&apiKey=<apiKey>").then().statusCode(200);
    }

    @Test
    public void V3LinksWebTest() {
        given().when().get("/v3-links?geocode=39.58,-74.46&format=json&par=samsung_widget&language=en-US&apiKey=<apiKey>").then().body(containsString("today"));
    }

    @Test
    public void V3LinksWebLinksTest() {
        given().when().get("/v3-links?geocode=39.58,-74.46&format=json&par=samsung_widget&language=en-US&apiKey=<apiKey>").then()
                .body("v3-links.web",containsString("42b1e21690710ad0137e6df654bc2f4f71b6ad9c32ed1ac18fc595cb26bcd3bb"))
                .body("v3-links.webForecastHourly",containsString("42b1e21690710ad0137e6df654bc2f4f71b6ad9c32ed1ac18fc595cb26bcd3bb"))
                .body("v3-links.webForecastDaily10", containsString("42b1e21690710ad0137e6df654bc2f4f71b6ad9c32ed1ac18fc595cb26bcd3bb")).statusCode(200);

    }
*/
    @Test
    public void topCitiesStatusCodeTest() {
        given().when().get("/v2-topcities-150?format=json&par=samsung_widget&units=e&language=en-US&apiKey=<apiKey>").then().statusCode(200);

    }


    @Test
    public void topCitiesPlaceIdCountTest() {
        given().when().get("/v2-topcities-150?format=json&par=samsung_widget&units=e&language=en-US&apiKey=<apiKey>").then().assertThat().body
                ("v2-topcities-150.topCitiesResponse.placeId[0..149]", hasSize(150));
                //("v2-topcities-150.topCitiesResponse", hasItems("placeId","50ca754fba280a0560bda3606d44ec0f3d32d1d3cccd8e50db1d2ec4d5751726"));

    }

    @Test
    public void topCitiesPlaceIdTest() {
        given().when().get("/v2-topcities-150?format=json&par=samsung_widget&units=e&language=en-US&apiKey=<apiKey>").then().assertThat().body
                ("v2-topcities-150.topCitiesResponse.placeId", hasItems("50ca754fba280a0560bda3606d44ec0f3d32d1d3cccd8e50db1d2ec4d5751726"));
        //("v2-topcities-150.topCitiesResponse", hasItems("placeId","50ca754fba280a0560bda3606d44ec0f3d32d1d3cccd8e50db1d2ec4d5751726"));

    }

    @Test
    public void topCitiesCityTest() {
        given().when().get("/v2-topcities-150?format=json&par=samsung_widget&units=e&language=en-US&apiKey=<apiKey>").then().assertThat().body
                ("v2-topcities-150.topCitiesResponse.city", hasItems("Amsterdam"));
        //("v2-topcities-150.topCitiesResponse", hasItems("placeId","50ca754fba280a0560bda3606d44ec0f3d32d1d3cccd8e50db1d2ec4d5751726"));

    }


/*********************************************************************
 @Test
 public void topCitiesPlaceIdTest() {
 given().when().get("/v2-topcities-150?format=json&par=samsung_widget&units=e&language=en-US&apiKey=<apiKey>").then().assertThat().
 body("v2-topcities-150.topCitiesResponse.[1].placeId",containsString("50ca754fba280a0560bda3606d44ec0f3d32d1d3cccd8e50db1d2ec4d5751726"))
 .body("v2-topcities-150.topCitiesResponse.[2]placeId",containsString("50ca754fba280a0560bda3606d44ec0f3d32d1d3cccd8e50db1d2ec4d5751726"))
 .body("v2-topcities-150.topCitiesResponse.[3]placeId", containsString("50ca754fba280a0560bda3606d44ec0f3d32d1d3cccd8e50db1d2ec4d5751726")).statusCode(200);

 }
 ******************************************************************************/

}
