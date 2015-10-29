package tests;


import models.DefaultLetter;
import models.User;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.*;
import net.thucydides.core.pages.Pages;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.LetterSteps;
import utils.CommonUtils;

@RunWith(SerenityRunner.class)
//@Story(Application.GmailLetterCheck.LetterCheck.class)
//@WithTag("feature:Letter")
public class GmailLoginTest {

    @Managed
    public WebDriver webdriver;

    @ManagedPages
    public Pages pages;

    @Steps
    public LetterSteps loginSteps;

    public User user;
    public DefaultLetter letter;

    @Before
    public void myTest() throws Exception {
        letter = CommonUtils.createDefaultLetter();
        user = CommonUtils.createNewUser();
        loginSteps.openGmail();
    }

    @Test
    @Title("Login to Gmail")
    public void LoginTest() throws InterruptedException {
        loginSteps.login(user.getLogin(), user.getPassword(), user.getUserName());
    }

    @Test
    @Title("CheckingLetter")
    public void CheckingLetter() {
        loginSteps.login(user.getLogin(), user.getPassword(), user.getUserName());
        loginSteps.openLetter(letter.getSender());
        loginSteps.checkLetterContent(letter.getSender(), letter.getContent(), letter.getTitle());
    }


}
