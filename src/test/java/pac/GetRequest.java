package pac;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import static com.jayway.restassured.RestAssured.*;
/**
 * Created by denys on 7/27/17.
 */
public class GetRequest {


    //@Test
    public void getreq(){
//https://www.facebook.com/d.baranov035?ref=bookmarks
        Response resp =
                given()
                        .param("ref", "bookmarks")
                        //.param("appid", "b1b15e88fa797225412429c1c50c122a1")
//URL
                .when()
                        .get("https://www.facebook.com/d.baranov035");
        System.out.println(resp.getStatusCode());
    }

    /**
     * Send parameters
     */
    //@Test
    public void getreq1(){
//http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b1b15e88fa797225412429c1c50c122a1
        Response resp =
//add some data
                given()
                        .param("q", "London")
                        .param("appid", "b1b15e88fa797225412429c1c50c122a1")
                .when()
                        .get("http://samples.openweathermap.org/data/2.5/weather");

        System.out.println(resp.getStatusCode());
    }

    /**
     * Check result
     */
    //@Test
    public void getreq2(){
        //Without Response class
        given()
                .param("q", "London")
                .param("appid", "b1b15e88fa797225412429c1c50c122a1")
        .when()
                .get("http://samples.openweathermap.org/data/2.5/weather")
//Checking
        .then()
                .assertThat().statusCode(200);
    }

    /**
     * Handle get request
     */
    //@Test
    public void getreq3(){
        Response resp =
                given()
                        .parameter("q", "London")
                        .parameter("appid", "35b88bf74e5739760148e06831f32a0e")
                        .when()
                        .get("http://api.openweathermap.org/data/2.5/weather");
//Convert response to String
        System.out.println(resp.asString());
    }

    //@Test
    public void getreq4(){
        Response resp =
                given().header("Authorization", "Token 1686dd1f-dcaa-4339-a741-d53c0c14121b:4c7c332aa746633d5e0498eae3e3a345a7a2ba21" )
                       // auth().oauth("email", "test1@test.ua", "password", "12345678")
                //.parameters("email", "test1@test.ua", "password", "12345678")
                //.auth()
                //.preemptive()
                .when()
                .get("http://bkstg_api_dev.aws.bkstg.com/api/accounts/me");

        System.out.println(resp.asString());
    }
//JSONPath https://www.youtube.com/watch?v=tdN5XFM40FE&list=PLmfZ8pjwM0vTVzGG5v0CrWxJaeHPP1KvH&index=13

    //Get parameter result
    //@Test
    public void getreq5(){
        String s =
                given()
                        .parameter("q", "London")
                        .parameter("appid", "35b88bf74e5739760148e06831f32a0e")
                        .when()
                        .get("http://api.openweathermap.org/data/2.5/weather")
                .then()
                //is result JSON?
                .contentType(ContentType.JSON)
                //extract some data
                .extract()
                .path("weather[0].description");
        System.out.println(s);
    }

    //Real test case
    //@Test
    public void getreq6(){
        Response resp =
                given()
                        .parameter("q", "London")
                        .parameter("appid", "35b88bf74e5739760148e06831f32a0e")
                        .when()
                        .get("http://api.openweathermap.org/data/2.5/weather");

        String actulaWeather = resp.
                then()
                .contentType(ContentType.JSON)
                .extract()
                .path("weather[0].description");


        System.out.println(actulaWeather);
    }

    //@Test
    public void getreq7(){
        Response resp = given()
                .param("id","2172797")
                .param("appid","35b88bf74e5739760148e06831f32a0e")
                .when()
                .get("http://api.openweathermap.org/data/2.5/weather");

        String byId = resp.then().extract().path("weather[0].description");

        String lon = String.valueOf(resp.then().contentType(ContentType.JSON).extract().path("coord.lon"));
        String lat = String.valueOf(resp.then().contentType(ContentType.JSON).extract().path("coord.lat"));

        Response resp2 = given()
                .param("lon", lon)
                .param("lat", lat)
                .param("appid","35b88bf74e5739760148e06831f32a0e")
                .when()
                .get("http://api.openweathermap.org/data/2.5/weather");
        String byCoord = resp2.then().extract().path("weather[0].description");

        System.out.println(byId);
        System.out.println(byCoord);

        Assert.assertTrue(byId.equals(byCoord));
    }
}
