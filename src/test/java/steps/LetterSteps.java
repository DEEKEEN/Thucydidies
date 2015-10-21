package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import pages.GmailHomePage;
import pages.GmailLoginPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;


/**
 * Created by rtret on 13.10.2015.
 */
public class LetterSteps extends ScenarioSteps {
    protected static final Logger log = LogManager.getLogger(LetterSteps.class);

    @Step
    public void login(String email, String password, String userName){
        gmailLoginPage().setEmail(email);
        gmailLoginPage().clickNextButton();
        gmailLoginPage().setPassword(password);
        gmailLoginPage().signIn();
        assertThat("User name from page " + gmailHomePage().getUserName() + " is different from model " + userName, gmailHomePage().getUserName().equals(userName));
    }

    @Step
    public void openLetter(String letterSender){
        gmailHomePage().clickOnLetter(letterSender);
    }

    @Step
    public void checkLetterContent(String letterSender, String letterContent, String letterTitle){
        assertThat("Letter content from page " + gmailHomePage().getLetterContent() + " is different from model " + letterContent, gmailHomePage().getLetterContent().equals(letterContent));
        assertThat("Letter sender from page " + gmailHomePage().getLetterSender() + " is different from model " + letterSender, gmailHomePage().getLetterSender().equals(letterSender));
        assertThat("Letter title from page " + gmailHomePage().getLetterTitle() + " is different from model " + letterTitle + letterSender, gmailHomePage().getLetterTitle().equals(letterTitle));
    }

//    @Step
//    public void login_to_cofile(String username, String password) {
//        System.out.println("Test will open browser");
//        log.info("Test will open browser");
//        landingPage().getDriver().get("http://www.google.com");
//        System.out.println(landingPage().getDriver().getTitle());
//        System.out.println("Test open browser");
//        log.info("Test open browser");
////        landingPage().signIn();
////        signInPopup().setPassword(password);
////        signInPopup().setTxtUserName(username);
////        signInPopup().clickSignIn();
//    }

    private GmailHomePage gmailHomePage() {return getPages().currentPageAt(GmailHomePage.class);
    }

    private GmailLoginPage gmailLoginPage() {return getPages().currentPageAt(GmailLoginPage.class);
    }

    @Step("Open Gmail Page Step")
    public void openGmail() {
        gmailLoginPage().open();
    }
}
