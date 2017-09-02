package api_testing2;

import ComplexResponse2.Avatar;
import ComplexResponse2.MyProfile;
import ComplexResponse2.Source;
import com.jayway.restassured.config.RestAssuredConfig;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.internal.mapper.ObjectMapperType;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;
import framework.Configuration;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pac.MyPractice;

import javax.mail.FetchProfile;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static com.jayway.restassured.RestAssured.*;

/**
 * Created by denys on 8/11/17.
 */
public class ComplexResponse {

    String token;

    public void login(){
        Response resp =
                given()
                        .body("{\"email\":\"test1@test.ua\", \"password\":\"12345678\"}")
                        .contentType(ContentType.JSON)
                        .when()
                        .post("http://bkstg_api_dev.aws.bkstg.com/api/auth/login");

        token = "Token " + resp.then().contentType(ContentType.JSON).extract().path("token");
    }

    @Test
    public void test1() {
        login();
        Response resp = given().header("Authorization", token).when()
                .get("http://bkstg_api_dev.aws.bkstg.com/api/accounts/me");
        //resp.then().log().all();
        MyProfile mp = resp.as(MyProfile.class, ObjectMapperType.GSON);

        SoftAssert sa = new SoftAssert();

        //Check time
        Assert.assertTrue(resp.getTimeIn(TimeUnit.SECONDS)<3);

        //Class 'Source'
        List<Source> sources = mp.getAvatar().getSources();
        for (Source i: sources){
            System.out.println(i.toString());
            sa.assertEquals(i.getType(), "s3");
        }
        sa.assertAll();

    /**
        Assert.assertEquals(mp.getBio(), null);
        Assert.assertFalse(!mp.getIsBanned());
        Avatar av = new Avatar();
        av.getAuthor();
     */

    }
}
