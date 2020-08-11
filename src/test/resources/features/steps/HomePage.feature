@homePage
Feature: Home page feature

  Background:
    Given I am on the Darksky home page

  @time
  Scenario:  Verify timeline is displayed in correct format
    When I enter "Mason, OH" into search text field on home screen
    And I verify city’s time zone
    Then I verify timeline is displayed with two hours incremented






#      | city             |
#      | Mason, OH        |
#      | Istanbul, Turkey |


