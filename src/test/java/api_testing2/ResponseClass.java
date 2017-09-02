package api_testing2;

import Posts_pram.Post_Class;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;
import framework.Configuration2;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.hamcrest.Matchers.*;

import static com.jayway.restassured.RestAssured.given;

/**
 * Created by denys on 8/10/17.
 */
public class ResponseClass {

    //@Test
    public void test1(){

        //Get response
        Response response = given().get("http://localhost:3000/posts/1");

        //Inline validation
        // 1. Hard Assertion
        response.then()
                .body("title", equalTo("Summer"))
                .body("author", equalTo("Nickola"))
        //or
        // 2. Soft Assertion (set bugs in purpose)
                //.body("title", equalTo("BUG1"), "author", equalTo("BUG2"))
                .log().all();

        //Path Validation
        // 1. Hard Assertion
        Assert.assertEquals(response.path("title"), "Summer");
        Assert.assertEquals(response.path("author"), "Nickola");

        // 2. Soft Assertion (set bugs in purpose)
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(response.path("title"), "BUG3");
        softAssert.assertEquals(response.path("author"), "BUG4");
        softAssert.assertAll();
    }

    @Test
    public void test2() {
        Response response = given().get("http://localhost:3000/posts/1");

        Post_Class param = response.as(Post_Class.class);

        Assert.assertEquals(param.getId(), "1");
        Assert.assertEquals(param.getTitle(), "Summer");
        Assert.assertEquals(param.getAuthor(), "Nickola");
    }
}
