package framework;

import com.jayway.restassured.RestAssured;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.specification.RequestSpecification;
import org.testng.annotations.*;
import static com.jayway.restassured.RestAssured.*;
//import io.restassured.RestAssured;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
//import static io.restassured.*;
import static com.jayway.restassured.RestAssured.*;
import com.jayway.restassured.*;


/**
 * Created by denys on 8/10/17.
 */
public class Configuration {

    @BeforeTest
    public void con(){
        //RestAssured.basePath = "/posts";
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 3000;
    }

    public RequestSpecification getReqSpec(){
        return RestAssured.given().contentType(ContentType.JSON);
    }
}
