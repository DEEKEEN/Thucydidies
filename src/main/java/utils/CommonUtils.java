package utils;


import models.DefaultLetter;
import models.User;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Roman_Tretyak on 8/4/2015.
 */
public class CommonUtils {

    public static User createNewUser() {
        User user = new User();
        user.setLogin("testmail8601");
        user.setPassword("qqqqqqqqqqq");
        user.setUserName("testmail8601@gmail.com");
        return user;
    }

    public static DefaultLetter createDefaultLetter() {
        DefaultLetter letter = new DefaultLetter();
        letter.setTitle("Automation Test");
        letter.setSender("TRETYAK Roman");
        letter.setContent("Hello World");
        return letter;
    }

    public static String getProperty(String propertyName) {
        Properties prop = new Properties();
        InputStream input = null;
        try {
            input = new FileInputStream("conf.properties");
            prop.load(input);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(propertyName);
    }
}
