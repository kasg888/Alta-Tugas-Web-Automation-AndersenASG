@Buying
Feature: Buying
  As a user I want to buy something in website sauce demo

  Scenario: Buying something
    Given User already on website sauce demo
    When User input "standard_user" as userName and input "secret_sauce" as password
    Then User already on sales page
    When User choosing items on sales page
    Then User already on Your Cart page
    When User adjusting items in cart
    Then User already on checkout your information page
    When User input first name "Andersen" and last name "Sebastian" then the zip code "59567"
    Then User already on checkout overview page
    When User ready to checkout
    Then User finish checktout