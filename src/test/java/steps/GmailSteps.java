package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import pages.GmailPage;

public class GmailSteps {
    GmailPage gmailPage;




    @Given("^I enter URL$")
    public void enterUrl() throws Throwable {
        gmailPage.enterHomeUrl();
    }

    @And("^I enter username \"([^\"]*)\"$")
    public void enterUsername(String userName) throws Throwable {
        gmailPage.enterUserNameValue(userName);
    }
    @And("^I enter password \"([^\"]*)\"$")
    public void enterPassword(String password) throws Throwable {
        gmailPage.enterPasswordValue(password);
    }
    @And("^I click on Next button$")
    public void clickSubmit() throws Throwable {
        gmailPage.clickNextButton();
    }

    @And("^I see the Inbox Page$")
    public void verifyInboxPage() throws Throwable {
        gmailPage.verifyLoginPage();
    }

    @And("^I see the Welcome Page$")
    public void verifyWelcomePage() throws Throwable {
        gmailPage.verifyWelcomePage();
    }



}


