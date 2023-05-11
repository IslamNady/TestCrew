package steps;

import com.stc.base.Base;
import com.stc.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeSteps extends Base {
    HomePage homePage;
    @Given("user open the Home page")
    public void userOpenTheHomePage() {
        homePage = new HomePage();
        homePage.verifyHomePageIsOpened();
    }

    @When("user clicks saudi country flag")
    public void user_clicks_saudi_country_flag() {
        homePage.clickSaudiCountryBtn();
    }

    @Then("Correct Type Price and Currency are showed for saudi")
    public void correctTypePriceAndCurrencyAreShowedForSaudi() {
        homePage.verifySaudiPackageLiteType();
        homePage.verifySaudiPackageLitePrice();
        homePage.verifySaudiPackageLiteCurrency();
    }

    @When("user clicks kuwait country flag")
    public void userClicksKuwaitCountryFlag() {
        homePage.clickKuwaitCountryBtn();
    }

    @Then("Correct Type Price and Currency are showed for kuwait")
    public void correctTypePriceAndCurrencyAreShowedForKuwait() {
        homePage.verifyKuwaitPackageClassicType();
        homePage.verifyKuwaitPackageClassicPrice();
        homePage.verifyKuwaitPackageClassicCurrency();
    }

    @When("user clicks Bahrain country flag")
    public void userClicksBahrainCountryFlag() {
        homePage.clickBahrainCountryBtn();
    }

    @Then("Correct Type Price and Currency are showed for Bahrain")
    public void correctTypePriceAndCurrencyAreShowedForBahrain() {
        homePage.verifyBahrainPackagePremiumType();
        homePage.verifyBahrainPackagePremiumPrice();
        homePage.verifyBahrainPackagePremiumCurrency();
    }
}
