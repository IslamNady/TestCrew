package steps;

import com.stc.base.Base;
import com.stc.pages.HomePage;
import com.stc.pages.SignInPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignInSteps extends Base {
    SignInPage signInPage;
    HomePage homePage = new HomePage();
    @When("Clicks Sign In button")
    public void clicksSignInButton() {
        signInPage = homePage.clickSignInBtn();
        signInPage.verifySubscribeTextIsDisplayed();
    }
    @And("user fills {string} and {string} and click login")
    public void userFillsUsernameAndPasswordAndClickLogin(String email,String password) {
        signInPage.LoginWithInvalidCredentials(email,password);
    }
    @Then("error message should appear")
    public void error_message_should_appear() {
        signInPage.verifyErrorMsgAppeared();
    }
}
