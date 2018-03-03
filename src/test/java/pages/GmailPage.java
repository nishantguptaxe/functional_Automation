package pages;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class GmailPage extends PageObject{


    LoginPage loginPage;

    @FindBy(xpath = "//input[@type='email']")
    private WebElementFacade enterUserName;

    @FindBy(xpath = "//h1[contains(text(),'Welcome')]")
    private WebElementFacade verifyWelcomePage;


    @FindBy(xpath = "//div[@id='password']/div/div/div/input")
    private WebElementFacade enterPassword;

    @FindBy(xpath = "//span[text()='Next']")
    private WebElementFacade clickNextButton;

    @FindBy(xpath = "//a[contains(text(),'Inbox')]")
    private WebElementFacade verifyLogin;



    public void enterHomeUrl() {

        loginPage.open();
    }

    public void clickNextButton() {
        clickNextButton.click();
    }

    public void enterUserNameValue(String userName) {
        enterUserName.type(userName);

    }
    public void enterPasswordValue(String password) {

        enterPassword.waitUntilEnabled();
        enterPassword.click();
        enterPassword.clear();
        enterPassword.type(password);

    }
    public void verifyLoginPage() {
        verifyLogin.waitUntilPresent();

    }

    public void verifyWelcomePage() {
        verifyWelcomePage.waitUntilPresent();

    }

}
