package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import pages.LandingPage;
import pages.fragments.SignInPopupFragment;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

/**
 * Created by Roman_Tretyak on 5/20/2015.
 */
public class LoginSteps extends ScenarioSteps {
//    protected static final Logger log = LogManager.getLogger(LoginSteps.class);
//    public LoginSteps(Pages pages) {
//        super(pages);
//    }
//
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
//
//    @Step
//    public void checkLoggedUser(String userName){
//        assertThat("User with name " + userName + " is not logged", signInPopup().getLoggedUserName(), containsString(userName));
//    }
//
//    @Step
//    public void checkLoginErrors(List<String> errors){
//        log.info("Hello");
//        assertThat("Errors are not valid", CommonUtils.compareTwoLists(errors, signInPopup().getSignInErrors()));
//    }
//
//    private LandingPage landingPage() {
//        return getPages().currentPageAt(LandingPage.class);
//    }
//
//    private SignInPopupFragment signInPopup(){
//        return getPages().currentPageAt(SignInPopupFragment.class);
//    }
}
