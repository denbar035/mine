package pac;

import ComplexArray.Avatar2;
import ComplexArray._Post2;
import ComplexObj.Avatar;
import ComplexObj.Post1;
import Posts_pram.Post_Class;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import org.testng.annotations.Test;
import com.jayway.restassured.*;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.Matchers.lessThan;


/**
 * Created by denys on 7/29/17.
 */
public class server {

    //https://www.youtube.com/watch?v=1jVJEfEBbNM&list=PLmfZ8pjwM0vTVzGG5v0CrWxJaeHPP1KvH&index=8
    //file-server --watch db.file
    //http://localhost:3000

    /**
     * Get
     */
    //@Test
    public void test1(){
        Response resp = when().get("http://localhost:3000/");
    }

    /**
     * Post
     */
    //@Test
    public void test2(){
        Response resp =
                given()
                        .body("  {\"id\": \"2\"," +
                                "\"title\": \"my\"," +
                                "\"author\":\"Denchik\"}")
                        .when()
                        .contentType(ContentType.JSON)
                        .post("http://localhost:3000/posts");

        System.out.println(resp.asString());
    }

    public String generateStringFromResource(String path) {
        try {
            return new String(Files.readAllBytes(Paths.get(path)));
        }
        catch (Exception e){return null;}
    }
    //@Test
    public void test3() {
        File file1 = new File("/Users/denys/Documents/repository/test/file.json");
        String s = generateStringFromResource("/Users/denys/Documents/repository/test/file.json");
        Response resp =
                given()
                        .body(s)
                        .when()
                        .contentType(ContentType.JSON)
                        .post("http://localhost:3000/posts");

        System.out.println(resp.asString());
    }

    /**
     * Put      /posts/3
     * Update data (all parameters should be sent)
     */
    //@Test
    public void test4(){
        Post_Class po = new Post_Class();
        //Need to send ALL nodes
        po.setAuthor("Anastasiia");
        po.setId("3");
        po.setTitle("Love");
        Response resp = given()
                .when()
                .contentType(ContentType.JSON)
                .body(po)
                .put("http://localhost:3000/posts/3");

        System.out.println(resp.asString());
        System.out.println(resp.getStatusCode());
    }

    /**
     * Patch      /posts/2
     * Update data (only one updated parameter should be sent)
     */
    //@Test
    public void test5(){
        Post_Class po = new Post_Class();
        //po.setId("2");
        //po.setAuthor("Den");
        //po.setTitle("Titlick");
        Response resp = given()
                .when()
                .body("{\"title\": \"Hi\"}")
                .contentType(ContentType.JSON)
                .patch("http://localhost:3000/posts/2");

        System.out.println(resp.asString());
        System.out.println(resp.getStatusCode());
    }

    /**
     * DELETE      /posts/2
     */
    //@Test
    public void test6(){
        Response resp = when().delete("http://localhost:3000/posts/4");
        System.out.println(resp.asString());
    }

    /**
     * Calculate time
     */
    //@Test
    public void test7(){
        //First version
        Response resp = when().get("http://localhost:3000/posts");
        Long i = resp.then().extract().time();
        System.out.println(resp.asString());
        System.out.println(i);
        //Second version
        given().when().get("http://localhost:3000/posts").then().time(lessThan(800L));
    }

    /**
     * PUT
     */
    @Test
    public void test8(){
        Response resp = given().when().get("http://localhost:3000/posts/1");
        System.out.println(resp.asString());

        Post1 po = new Post1();
        po.setid("1");
        po.setauthor("Nickola");
        po.settitle("Summer");

        Response resp2 = given().contentType(ContentType.JSON).body(po)
                .when().put("http://localhost:3000/posts/1");
        System.out.println(resp2.asString());
    }

    /**
     * Complex Post Object
     */
    @Test
    public void testq(){
        Avatar av = new Avatar();
        av.setauthor2("A");
        av.setcontent_type("img");
        av.setcreated("123");

        Post1 po = new Post1();
        po.setauthor("I");
        po.setid("2");
        po.settitle("Tit");
        po.setavatar(av);




        Response resp = given().when().
                contentType(ContentType.JSON).
                body(po).
                post("http://localhost:3000/posts");
        System.out.println(resp.asString());
    }

    /**
     * Complex Post Array
     */
    @Test
    public void testq2(){
        Avatar2 av2 = new Avatar2();
        av2.setcreated("333");
        av2.setcontent_type("type");
        av2.setauthor2("Rom");

        Avatar2 av = new Avatar2();
        av.setcreated("one");
        av.setcontent_type("png");
        av.setauthor2("Ol");

        _Post2 po = new _Post2();
        po.settitle("t");
        po.setid("1");
        po.setauthor("Somebody");
        po.setavatar(new Avatar2[]{av2, av});

        Response re = given().when().
                contentType(ContentType.JSON).
                body(po).
                post("http://localhost:3000/posts");

        System.out.println(re.asString());
    }


}
