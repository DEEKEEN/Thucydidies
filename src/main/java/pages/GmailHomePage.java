package pages;

import net.thucydides.core.pages.PageObject;


import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.findby.How;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Roman_Tretyak on 8/4/2015.
 */
public class GmailHomePage  extends PageObject {
    @FindBy(how = net.thucydides.core.annotations.findby.How.XPATH, using = "//a[contains(@title, 'Google Account')]")
    private WebElement userName;

    @FindBy(how = How.XPATH, using = "//div[@class = 'yW']")
    private List<WebElement> letterList;

    @FindBy(how = How.XPATH, using = "//h2[@class = 'hP']")
    private WebElement letterTitle;

    @FindBy(how = How.XPATH, using = "//span[@class = 'gD']")
    private WebElement letterSender;

    @FindBy(how = How.XPATH, using = "//div[@class = 'a3s']/div[1]")
    private WebElement letterContent;

    public GmailHomePage(WebDriver webDriver) {
        super(webDriver);
        getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public String getUserName() {
        return userName.getText();
    }

    public GmailHomePage clickOnLetter(String sender) {
        for (WebElement letter : letterList) {
            if (letter.getText().equals(sender)) {
                letter.click();
                break;
            }
        }
        return this;
    }

    public String getLetterSender() {
        return letterSender.getText();
    }

    public String getLetterContent() {
        return letterContent.getText();
    }

    public String getLetterTitle() {
        return letterTitle.getText();
    }
}
