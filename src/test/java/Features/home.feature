@Home
  Feature: Home

    @button-addCart
    Scenario: User can add cart product
      Given user is on login page
      And user input username with "standard_user"
      And user input password with "secret_sauce"
      And user click login button
      When user click add to cart button
      Then user add product to cart

    @button-removeCart
    Scenario: user can remove product
      Given user is on login page
      And user input username with "standard_user"
      And user input password with "secret_sauce"
      And user click login button
      And user click add to cart button
      When user click remove button
      Then user can remove product in cart

