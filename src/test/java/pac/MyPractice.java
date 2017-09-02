package pac;

import Posts_pram.Post_Class;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.jayway.restassured.RestAssured.given;

/**
 * Created by denys on 7/29/17.
 */
public class MyPractice {

    //Get
    //@Test(dependsOnMethods = "getreq2")
    public void getreq1(){
        Response resp =
                given()
                        .header("Authorization", token )
                .when()
                        .get("http://bkstg_api_dev.aws.bkstg.com/api/accounts/me");
        System.out.println(token);
        System.out.println(resp.asString());
    }

    String token;

    //Login
    //@Test
    public void getreq2(){
        Response resp =
                given()
                        //.header("Content-Type", "application/file")
                        .body("{\"email\":\"test1@test.ua\", \"password\":\"12345678\"}")
                        .contentType(ContentType.JSON)
                        .when()
                        .post("http://bkstg_api_dev.aws.bkstg.com/api/auth/login");

        token = "Token " + resp.then().contentType(ContentType.JSON).extract().path("token");
        System.out.println(token);
    }

    server p = new server();
    Post_Class pc = new Post_Class();
    @Test
    public void signUp() {
        String s = "{ \"password\": \""+pc.psw+
                "\", \"device_id\":\""+pc.device_id+
                "\", \"full_name\":\""+pc.fullName+
                "\", \"device_type\":\""+pc.device_type+
                "\", \"email\":\""+pc.getEmail()+
                "\", \"username\":\""+pc.getUsername()+"\"}";
        Response resp = given().
                contentType(ContentType.JSON).
                body(s).
                when().
                post("http://bkstg_api_dev.aws.bkstg.com/api/auth/register");
        String te = resp.then().extract().path("token");
        String us = resp.then().extract().path("user_id");
        System.out.println(te);
        System.out.println(us);
        System.out.println(resp.asString());
    }
}
