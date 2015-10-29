package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import pages.LandingPage;
import pages.UserProfilePage;
import pages.fragments.ChangePasswordPopupFragment;

import static org.hamcrest.MatcherAssert.assertThat;
import java.util.List;

/**
 * Created by Roman_Tretyak on 5/20/2015.
 */
public class UserProfileSteps extends ScenarioSteps {
//    protected static final Logger log = LogManager.getLogger(UserProfileSteps.class);
//
//    public UserProfileSteps(Pages pages) {
//        super(pages);
//    }
//
//    @Step
//    public void go_to_profile_page() {
//        landingPage().clickOnUserName();
//        assertThat("User profile page is not visible", userProfilePage().validateProfilePage());
//    }
//
//    @Step
//    public void changePassword(String currentPass, String newPass, String confirmPass) {
//        userProfilePage().clickChangePassword();
//        assertThat("Change Password popup is not visible", passwordPopupFragment().validateChangePasswordPopup());
//        passwordPopupFragment().changePassword(currentPass, newPass, confirmPass);
//        passwordPopupFragment().clickSave();
//    }
//
//    @Step
//    public void editProfile(){
//        log.info("Hello");
//        userProfilePage().clickEditProfile();
//    }
//
//    @Step
//    public void checkChangePassErrors(List<String> errors) {
//        log.info("Hello");
//        assertThat("Errors are not valid", CommonUtils.compareTwoLists(errors, passwordPopupFragment().getChangePassErrors()));
//    }
//
//    @Step
//    public void validateFollowingsUserProfileLinks(List<String> links) {
//        log.info("Hello");
//        assertThat("Links are not valid", CommonUtils.compareTwoLists(links, userProfilePage().getUserProfileLinks()));
//    }
//
//    @Step
//    public void validateFollowingsUserProfileTabs(List<String> tabs) {
//        log.info("Hello");
//        assertThat("Tabs are not valid", CommonUtils.compareTwoLists(tabs, userProfilePage().getUserProfileTabs()));
//    }
//
//    @Step
//    public void validateFollowingsUserProfileFields(List<String> fields) {
//        log.info("Hello");
//        assertThat("Fields are not valid", CommonUtils.compareTwoLists(fields, userProfilePage().getDetailsFildsNames()));
//    }
//
//    private UserProfilePage userProfilePage() {
//        return getPages().currentPageAt(UserProfilePage.class);
//    }
//
//    private LandingPage landingPage() {
//        return getPages().currentPageAt(LandingPage.class);
//    }
//
//    private ChangePasswordPopupFragment passwordPopupFragment() {
//        return getPages().currentPageAt(ChangePasswordPopupFragment.class);
//    }
}
