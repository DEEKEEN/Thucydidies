package pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Roman_Tretyak on 5/21/2015.
 */
public class UserProfilePage extends PageObject {

    @FindBy(id = "changeProfileLink")
    WebElement btnChangePassword;

    @FindBy(xpath= "//div[@id='userDetail']//strong")
    private List<WebElement> listUserDetails;

    @FindBy(xpath = " //div[@id='userProfileTabs']//a")
    private List<WebElement> listUserProfileTabs;

    @FindBy(xpath = "//div[@id='userDetail']//a")
    private List<WebElement> listUserDetailsLinks;

    @FindBy(id = "editProfileLink")
    WebElement btnEditProfile;

    public UserProfilePage(WebDriver webDriver) {
        super(webDriver);
        getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public UserProfilePage clickEditProfile(){
        btnEditProfile.click();
        return this;
    }

    public boolean validateProfilePage(){
        return btnEditProfile.isDisplayed();
    }

    public UserProfilePage clickChangePassword(){
        btnChangePassword.click();
        return this;
    }

    public ArrayList getDetailsFildsNames()
    {
        ArrayList names = new ArrayList();

        for (int i = 0; i < listUserDetails.size(); i++)
        {
            names.add(listUserDetails.get(i).getText());
        }

        return names;
    }

    public ArrayList getUserProfileLinks()
    {
        ArrayList names = new ArrayList();

        for (int i = 0; i < listUserDetailsLinks.size(); i++)
        {
            names.add(listUserDetailsLinks.get(i).getText());
        }

        return names;
    }

    public ArrayList getUserProfileTabs()
    {
        ArrayList names = new ArrayList();

        for (int i = 0; i < listUserProfileTabs.size(); i++)
        {
            names.add(listUserProfileTabs.get(i).getText());
        }

        return names;
    }
}
