package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseClass;
import utils.CommonUtils;

public class LoginPage extends BaseClass {
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "")
    private WebElement usernameTextField;

    @FindBy(xpath = "")
    private WebElement passwordTextField;

    @FindBy(xpath = "")
    private WebElement loginButton;

    @FindBy(xpath = "")
    private WebElement walletBalance;

    @FindBy(xpath = "")
    private WebElement loggedInUsernameLabel;

    public void enterUsername(String value){
        CommonUtils.setText(usernameTextField, value);
    }

    public void enterPassword(String value){
        CommonUtils.setText(passwordTextField, value);
    }

    public void clickLoginButton(){
        CommonUtils.clickButton(loginButton);
    }

    public void verifyWalletBalanceShown(){
        CommonUtils.waitForElementToBeVisible(walletBalance);
    }

    public void verifyLoggedInUsernameDisplayed(){
        CommonUtils.waitForElementToBeVisible(loggedInUsernameLabel);
    }
}
