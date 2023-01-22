package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

public class RegistrationSteps {

    @Given("User should be on Modi Corp Register User page")
    public void navigateToRegistrationPage(){

    }

    @When("User enters valid email id which is new and unique")
    public void enterValidEmail(){

    }

    @And("Submit the registration form")
    public void submitRegistrationForm(){

    }

    @Then("Verify that user is registered successfully")
    public void verifySuccessfulRegistration(){

    }

    @And("Verify that wallet is created")
    public void verifyWalletCreated(){

    }

    @When("User enters email id which is already registered")
    public void enterAlreadyRegisteredEmailID(){

    }

    @Then("Verify that user is shown with error \"Email ID already registered\"")
    public void verifyErrorMessageForRegisteredEmailID(){

    }

    @When("User enters Invalid email id")
    public void enterInvalidEmailID(){

    }

    @Then("Verify that user is shown with error \"Invalid Email ID\"")
    public void verifyErrorMessageForInvalidEmailID(){

    }

    @And("User is shown option to transfer fund into wallet")
    public void verifyOptionShownToAddFundInWallet(){

    }

    @And("User is able to transfer fund into their wallet successfully")
    public void verifySuccessfulFundTransfer(){

    }

    @And("Verify added fund is visible in wallet")
    public void verifyAddedFundVisibleInWallet(){

    }

    @And("User enters password")
    public void enterPasswordForRegistration(){

    }
}