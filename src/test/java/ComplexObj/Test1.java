package ComplexObj;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import org.testng.annotations.Test;
import static com.jayway.restassured.RestAssured.*;

/**
 * Created by denys on 8/5/17.
 */
public class Test1 {


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


}
