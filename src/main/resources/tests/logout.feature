Feature: Log out

  Scenario: User log out
    Given open application
    When user open login form
    And user enter "123" username
    And user enter "123" password
    And user click on Login button
    And user clicks on Logout button
    Then Login button should appear
