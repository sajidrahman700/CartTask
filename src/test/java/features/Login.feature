Feature: Login
  Background:
    Given User should be on login page


  Scenario: User Should be able to login With valid credentials
    When User enter email on the Email Field
    And User enter password on the password Field
    And User click on the login button
    Then User should navigate to home page

  Scenario Outline: User Should not be able to login With invalid credentials
    When User enter <email> on the Email Field
    And User enter <password> on the password Field
    And User click on the login button
    Then User should still on the login page

    Examples: 
      | email            | password  |
      | "thank@gmail.com"| "12"      |
      | "th@gmail.com"   | "12345678"|
      | "tha@gmail.com"  | "12"      |
      | ""               | "12345678"|
      | "thank@gmail.com"| ""        |
      | ""               | ""        |
      
