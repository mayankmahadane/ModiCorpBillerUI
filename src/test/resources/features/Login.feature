Feature: Verify Login functionality

  @Positive
  Scenario: Verify user is able to login into Modi Corp system with registered credentials

    Given User is on Modi Corp User Login page
    When User enters valid username, password and then click on Login button
    Then Verify that user is successfully logged in and shown User Home screen
      And Verify that user is shown wallet balance on the top
      And Verify that user is able to see options to pay the bill