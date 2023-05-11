Feature: Contact page features
  @Regression
  Scenario Outline: Login with invalid credentials
    Given user open the Home page
    When Clicks Sign In button
    And user fills "<username>" and "<password>" and click login
    Then error message should appear
    Examples:
    | username           | password |
    | test@test.com      | 123456   |



