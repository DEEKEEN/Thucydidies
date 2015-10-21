package tests;


import models.DefaultLetter;
import models.User;
import net.thucydides.core.annotations.*;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import requirements.Application;
import steps.LetterSteps;
import utils.CommonUtils;

import java.util.ArrayList;
import java.util.List;

@RunWith(ThucydidesRunner.class)
@Story(Application.GmailLetterCheck.LetterCheck.class)
@WithTag("feature:Letter")
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

        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
        letter = CommonUtils.createDefaultLetter();
        user = CommonUtils.createNewUser();
        loginSteps.openGmail();
    }

    @Test
    @Title("Login to Gmail")
    public void LoginTest() throws InterruptedException {
        //webdriver.get("http://gmail.com");
        loginSteps.login(user.getLogin(), user.getPassword(), user.getUserName());
    }

    @Test
    @Title("CheckingLetter")
    public void CheckingLetter() {
        //webdriver.get("http://gmail.com");
        loginSteps.login(user.getLogin(), user.getPassword(), user.getUserName());
        loginSteps.openLetter(letter.getSender());
        loginSteps.checkLetterContent(letter.getSender(), letter.getContent(), letter.getTitle());
    }


}
