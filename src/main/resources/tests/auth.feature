Feature: Log in

  Scenario: User log in
    Given open application
    When user open login form
    And user enter "123" username
    And user enter "123" password
    And user click on Login button
    Then salutation should appear
