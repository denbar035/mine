package ComplexArray;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.given;

/**
 * Created by denys on 8/5/17.
 */
public class Test2 {


    @Test
    public void testq(){
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
