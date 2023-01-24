package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.PayBillPage;

public class LoginSteps {
    LoginPage loginPage;
    PayBillPage payBillPage;

    public LoginSteps(){
        loginPage = new LoginPage();
        payBillPage = new PayBillPage();
    }

    @Given("User is on Modi Corp User Login page")
    public void navigateToUserLoginPage() {

    }

    @When("User enters valid username, password and then click on Login button")
    public void doLogin(){
        loginPage.enterUsername("mmahadane@gmail.com");
        loginPage.enterPassword("P@ssw0rd123");
        loginPage.clickLoginButton();
    }

    @Then("Verify that user is successfully logged in and shown User Home screen")
    public void verifyUserHomePageShown(){
        loginPage.verifyLoggedInUsernameDisplayed();
    }

    @And("Verify that user is shown wallet balance on the top")
    public void verifyWalletBalanceShownOnScreen(){
        loginPage.verifyWalletBalanceShown();
    }

    @And("Verify that user is able to see options to pay the bill")
    public void verifyBillPayOptionsVisible(){
        payBillPage.selectUtility("Gas");
        payBillPage.selectVendor("HP");
        payBillPage.enterCustID("12345");
        payBillPage.clickGetUnpaidBillButton();
        payBillPage.clickMakePaymentButton();
    }
}
