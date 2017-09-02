package framework;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeTest;

//import io.restassured.RestAssured;
//import static io.restassured.*;


/**
 * Created by denys on 8/10/17.
 */
public class Configuration2 {

    @BeforeTest
    public void con(){
        RestAssured.baseURI = "http://samples.openweathermap.org/data/2.5/weather";

    }
    public RequestSpecification getReqSpec(){
        return RestAssured.given().contentType(ContentType.JSON);
    }
}
