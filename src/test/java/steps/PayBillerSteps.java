package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PayBillerSteps {
    @Given("Verify that User is a registered User")
    public void verifyUserIsRegistered(){

    }

    @When("Retrieve billers for (.*) from the system")
    public void retrieveAllBillers(String Utility){

    }

    @And("Choose a (.*) from shown list")
    public void retrieveAllVendors(String Vendor){

    }

    @And("Enter (.*) for chosen vendor")
    public void enterCustID(){

    }

    @And("User retrieves current unpaid bill")
    public void retrieveCurrentUnpaidBill(){

    }

    @Then("User pays the bill amount from wallet")
    public void payBillAmountFromWallet(){

    }

    @And("Verify that transfer of funds from the customer wallet to the biller account is done successfully")
    public void verifyBillPaymentIsSuccessful(){

    }

    @And("Verify that wallet balance is updated after bill payment")
    public void verifyWalletBalanceIsUpdated(){

    }

    @Then("Verify that the paid bill is not displayed again as unpaid")
    public void verifyPaidBillNotShownAsUnpaid(){

    }

    @And("Verify that system shows error message for insufficient fund")
    public void verifyInsufficientFundErrorMessage(){

    }
}