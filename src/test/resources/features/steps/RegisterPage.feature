@loginPage
Feature: Login page feature

  Background:
    Given I am on the Darksky login page

  @login
  Scenario:  Verify invalid login for users
    When I enter abc@gmail.com into email field on the login page
    And I enter password1 into password field on the login page
    And I click on login button
    Then I verify error message "password and username does not match"

