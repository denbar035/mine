package Posts_pram;

import org.testng.annotations.Test;

import java.util.Random;

/**
 * Created by denys on 7/30/17.
 */
public class Post_Class {

    private String id;
    private String title;
    private String author;
    private String avatar;

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getAvatar(){
        return avatar;
    }

    public void setAvatar(String avatar){
        this.avatar = avatar;
    }



    public String psw= "12345678";
    public String device_id= "EF508F5A-93D3-4E15-843C-DDEF5E5C02A4";
    public String fullName= "A T";
    public String device_type= "ios";

    public String getEmail(){
        String s = "autobkst5+"+randomNumber()+"@gmail.com";
        return s;
    }
    public String getUsername(){
        String s = "usidiot"+randomNumber();
        return s;
    }

    public String randomNumber(){
        Random rand = new Random();
        int i = rand.nextInt(10000);
        String s = String.valueOf(i);
        return s;
    }
}
