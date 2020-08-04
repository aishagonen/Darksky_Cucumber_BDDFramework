@today

Feature: Verify Temperature of Today Feature

  Background:
    Given I am on Darksky home page


  Scenario: Verify today's lowest and highest temperature
    When I click on today button field on home screen
    And I get lowest temperature, verify displayed temperature and enter value on home screen
    Then I get highest temperature, verify displayed temperature and enter value on home screen



