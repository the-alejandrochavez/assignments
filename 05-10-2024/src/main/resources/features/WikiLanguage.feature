Feature: Wikipedia
  Background: User is in wikipedia home page
    Given the user is in the home page

  Scenario: User chooses the English Wikipedia
    When the user clicks on the English link
    Then the user should be redirected to the English Wikipedia

  Scenario: User chooses the Spanish Wikipedia
    When the user clicks on the Spanish link
    Then the user should be redirected to the Spanish Wikipedia

  Scenario: User chooses the Deutsch Wikipedia
    When the user clicks on the Deutsch link
    Then the user should be redirected to the Deutsch Wikipedia