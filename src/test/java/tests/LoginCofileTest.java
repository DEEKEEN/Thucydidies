package tests;

import net.thucydides.core.annotations.*;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import requirements.Application;
import steps.LoginSteps;
import utils.UserData;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Roman_Tretyak on 5/20/2015.
 */
@RunWith(ThucydidesRunner.class)
@Story(Application.CofileLogin.LoginCofileCheck.class)
@WithTag("feature:Login")
public class LoginCofileTest {

    @Managed
    public WebDriver webdriver;

    @ManagedPages
    public Pages pages;

    @Steps
    public LoginSteps loginSteps;

    @Before
    public void myTest()  throws Exception
    {

       System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
//        System.setProperty("webdriver.ie.driver","./src/test/resources/IEDriverServer.exe");
//        webdriver.manage().window().maximize();
//        //book.start_browser();
    }

    @Test
    @Title("Login without typing email")
    public void LoginWithoutEmailCredentials() throws InterruptedException {
        List<String> errors = new ArrayList<String>();
        errors.add("Enter your Email Id.");
        Thread.sleep(5000);
        loginSteps.login_to_cofile("", UserData.PASS);

        //loginSteps.checkLoginErrors(errors);
    }

    @Test
    @Title("Login with valid credentials")
    public void LoginWithValidCredentials() {
        loginSteps.login_to_cofile(UserData.USERNAME, UserData.PASS);
        //loginSteps.checkLoggedUser(UserData.NICKNAME);
    }

}
