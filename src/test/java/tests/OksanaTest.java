package tests;

import net.thucydides.core.annotations.*;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import requirements.Application;
import steps.LoginSteps;
import utils.CommonUtils;
import utils.UserData;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by Roman_Tretyak on 5/20/2015.
 */
@RunWith(ThucydidesRunner.class)
@Story(Application.CofileLogin.LoginCofileCheck.class)
@WithTag("feature:Login")
public class OksanaTest {

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
    public void OksanaMethod1() throws InterruptedException {
        assertThat("Errors are not valid", false);
        //loginSteps.checkLoginErrors(errors);
    }

    @Test
    @Title("Login with valid credentials")
    public void OksanaMethod2() {
        loginSteps.login_to_cofile(UserData.USERNAME, UserData.PASS);
        assertThat("Errors are not valid", true);
        //loginSteps.checkLoggedUser(UserData.NICKNAME);
    }

}
