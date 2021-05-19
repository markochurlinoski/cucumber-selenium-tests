Feature: Customer login

  Scenario: Successful login when user provides valid credentials
    Given I am on the customers login page
    When I provide valid login credentials
    And I Click on the login button
    Then I should be redirected to customer page
    And I should see the logout button
