Feature: Flipcart Application Login

  @SampleTest

  Scenario Outline:

    Given I launch flipcart login url
    When I input <UserName> id and <password>
    Then I am able to successfully land home page

    Examples:
    |UserName   |password  |
    |6364444460 |Sridhar905|
