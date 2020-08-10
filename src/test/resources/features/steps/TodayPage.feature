@todayPage
Feature: Verify temperature of today

  Background:
      Given I am on home page

  @today
  Scenario:  Verify lowest temperature for today
    When I click on today button on the home page
    Then I verify lowest and highest temperature for today

