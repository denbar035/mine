package api_testing2;

//import io.restassured.RestAssured;
import api_testing2.EndPoint;
import com.jayway.restassured.config.RestAssuredConfig;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.specification.RequestSpecification;
import framework.Configuration;
import framework.Configuration2;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
//import static io.restassured.*;
import static com.jayway.restassured.RestAssured.*;
import com.jayway.restassured.*;

/**
 * Created by denys on 8/10/17.
 */
public class StartApiTesting {


    //@Test
    public void test1(){
        given().get("http://localhost:3000/posts").then().
               //check status
                statusCode(200).
                //Print response
                log().all();
    }

    //@Test(groups = "demo")
    public void test2(){

        given().
                get(EndPoint.getPosts).
                then().
                        statusCode(200).
                        log().all();

        /**
         <classes>
            <class name = "api_testing2.StartApiTesting"/>
            <class name = "framework.Configuration"/>
         </classes>
         */
    }

    //Request path:	http://samples.openweathermap.org/data/2.5/weather?appid=b1b15e88fa797225412429c1c50c122a1&q=London
    //Query params:	appid=b1b15e88fa797225412429c1c50c122a1, q=London
    //@Test(groups = "demo")
    public void test3(){

        RequestSpecification req = new Configuration2().getReqSpec();
        req.queryParam("appid", "b1b15e88fa797225412429c1c50c122a1").queryParam("q", "London")
        //Print log
                .log().all();
        given().spec(req).get().then().statusCode(200).log().all();

        /**
         <classes>
         <class name = "api_testing2.StartApiTesting"/>
         <class name = "framework.Configuration2"/>
         </classes>
         */
    }

    //Don't work
    //@Test(groups = "demo")
    public void test4(){
        RequestSpecification req = new Configuration().getReqSpec();
        //Don't work
        req.pathParam("id", 1).log().all();
        given().spec(req).
                get("/posts/1").then().statusCode(200).log().all();
    }

    //Don't work
    @Test(groups = "demo")
    public void test5(){
        RequestSpecification req = new Configuration().getReqSpec();
        req.formParams("id", 5).log().all();
        given().spec(req).
                post("/posts").
                then().log().all();
    }
}
