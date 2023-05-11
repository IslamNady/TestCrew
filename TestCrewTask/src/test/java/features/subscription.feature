Feature: Validate the Subscription Packages

  @Regression
  Scenario: Validate the Subscription Packages – Type & Price and Currency for KSA
    Given user open the Home page
    When user clicks saudi country flag
    Then Correct Type Price and Currency are showed for saudi

  Scenario: Validate the Subscription Packages – Type & Price and Currency for Kuwait
    Given user open the Home page
    When user clicks kuwait country flag
    Then Correct Type Price and Currency are showed for kuwait

  Scenario: Validate the Subscription Packages – Type & Price and Currency for Bahrain
    Given user open the Home page
    When user clicks Bahrain country flag
    Then Correct Type Price and Currency are showed for Bahrain
