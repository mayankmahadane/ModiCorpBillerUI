Feature: Registration - Allow customers to "register" for bill payment

  Background:
        Given User should be on Modi Corp Register User page

  @Positive
  Scenario: Register new user with valid email id

    When User enters valid email id which is new and unique
      And User enters password
      And Submit the registration form
    Then Verify that user is registered successfully
      And Verify that wallet is created
      And User is shown option to transfer fund into wallet
      And User is able to transfer fund into their wallet successfully
      And Verify added fund is visible in wallet

  @Negative
  Scenario: Verify error while registration for already registered email id

    When User enters email id which is already registered
      And User enters password
      And Submit the registration form
    Then Verify that user is shown with error "Email ID already registered"

  @Negative
  Scenario: Verify error while registration for invalid email id

    When User enters Invalid email id
      And User enters password
      And Submit the registration form
    Then Verify that user is shown with error "Invalid Email ID"