@Login
  Feature: Login

    @Login-valid-account
    Scenario: Login using valid username and password
      Given user is on login page
      And user input username with "standard_user"
      And user input password with "secret_sauce"
      When user click login button

    @login-invalid-account1
    Scenario: Login using invalid username and password
      Given user is on login page
      And user input username with "unawakened"
      And user input password with "08972824308"
      When user click login button
      Then user able to see error message "Epic sad face : wrong username and password"

    @login-invalid-account2
    Scenario: Login using invalid username and password
      Given user is on login page
      And user input username with ""
      And user input password with ""
      When user click login button
      Then user able to see error message "Epic sad face : wrong username and password"