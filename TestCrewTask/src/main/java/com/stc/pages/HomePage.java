package com.stc.pages;

import com.stc.base.Base;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Base {
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "signin")
    WebElement signInBtn;
    @FindBy(id = "country-btn")
    WebElement countryBtn;

    @FindBy(xpath = "//b[text()='Choose Your Plan']")
    WebElement homePageLbl;
    @FindBy(id = "sa-contry-flag")
    WebElement saudiCountryFlag;
    @FindBy(id = "name-lite")
    WebElement saudiPackageLiteLbl;
    @FindBy(xpath = "//div[@id='currency-lite']//b")
    WebElement saudiPackageLitePrice;
    @FindBy(xpath = "//div[@id='currency-lite']//i")
    WebElement SaudiPackageLiteCurrency;

    @FindBy(id = "kw-contry-flag")
    WebElement kuwaitCountryFlag;
    @FindBy(id="name-classic")
    WebElement kuwaitPackageClassicLbl;
    @FindBy(xpath = "//div[@id='currency-classic']//b")
    WebElement kuwaitPackageClassicPrice;
    @FindBy(xpath = "//div[@id='currency-classic']//i")
    WebElement kuwaitPackageClassicCurrency;
    @FindBy(id = "bh-contry-flag")
    WebElement bahrainCountryFlag;
    @FindBy(id="name-premium")
    WebElement bahrainPackagePremiumLbl;
    @FindBy(xpath = "//div[@id='currency-premium']//b")
    WebElement bahrainPackagePremiumPrice;
    @FindBy(xpath = "//div[@id='currency-premium']//i")
    WebElement bahrainPackagePremiumCurrency;

    public void verifyHomePageIsOpened() {
        Assert.assertTrue(homePageLbl.isDisplayed());
    }

    public SignInPage clickSignInBtn() {
        signInBtn.click();
        return new SignInPage();
    }

    public void clickSaudiCountryBtn() {
        countryBtn.click();
        saudiCountryFlag.click();
    }

    public void verifySaudiPackageLiteType() {
        Assert.assertTrue(saudiPackageLiteLbl.getText().equalsIgnoreCase("Lite"));
    }

    public void verifySaudiPackageLitePrice() {
        Assert.assertTrue(saudiPackageLitePrice.getText().equals("15"));
    }

    public void verifySaudiPackageLiteCurrency() {
        Assert.assertTrue(SaudiPackageLiteCurrency.getText().contains("SAR"));
    }
    public void clickKuwaitCountryBtn(){
        countryBtn.click();
        kuwaitCountryFlag.click();
    }
    public void verifyKuwaitPackageClassicType() {
        Assert.assertTrue(kuwaitPackageClassicLbl.getText().equalsIgnoreCase("Classic"));
    }

    public void verifyKuwaitPackageClassicPrice() {
        Assert.assertTrue(kuwaitPackageClassicPrice.getText().equals("2.5"));
    }

    public void verifyKuwaitPackageClassicCurrency() {
        Assert.assertTrue(kuwaitPackageClassicCurrency.getText().contains("KWD"));
    }
    public void clickBahrainCountryBtn(){
        countryBtn.click();
        bahrainCountryFlag.click();
    }
    public void verifyBahrainPackagePremiumType() {
        Assert.assertTrue(bahrainPackagePremiumLbl.getText().equalsIgnoreCase("Premium"));
    }

    public void verifyBahrainPackagePremiumPrice() {
        Assert.assertTrue(bahrainPackagePremiumPrice.getText().equals("6"));
    }

    public void verifyBahrainPackagePremiumCurrency() {
        Assert.assertTrue(bahrainPackagePremiumCurrency.getText().contains("BHD"));
    }
}
