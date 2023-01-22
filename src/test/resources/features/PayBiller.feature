Feature: Pay Biller - Pay your utility bills

  Background:
    Given Verify that User is a registered User

  @Positive
  Scenario Outline: Verify successful bill payment for different utilities

    When Retrieve billers for <Utility> from the system
      And Choose a <Vendor> from shown list
      And Enter <CustomerID> for chosen vendor
      And User retrieves current unpaid bill
    Then User pays the bill amount from wallet
      And Verify that transfer of funds from the customer wallet to the biller account is done successfully
      And Verify that wallet balance is updated after bill payment

    Examples:
      | Utility       | Vendor   | CustomerID |
      | PhonePostpaid | Reliance | 1475896    |
      | Electricity   | MPWZEB   | 78536456   |
      | Gas           | HP       | 1023905    |

    @Positive
    Scenario Outline: Verify that bill once paid is not visible again as unpaid

      When Retrieve billers for <Utility> from the system
        And Choose a <Vendor> from shown list
        And Enter <CustomerID> for chosen vendor
      Then Verify that the paid bill is not displayed again as unpaid

      Examples:
        | Utility       | Vendor   | CustomerID |
        | PhonePostpaid | Reliance | 1475896    |
        | Electricity   | MPWZEB   | 78536456   |
        | Gas           | HP       | 1023905    |

  @Negative
  Scenario: Verify error while bill payment if fund is not sufficient in Wallet

    When Retrieve billers for <Utility> from the system
      And Choose a <Vendor> from shown list
      And Enter <CustomerID> for chosen vendor
      And User retrieves current unpaid bill
    Then User pays the bill amount from wallet
      And Verify that system shows error message for insufficient fund