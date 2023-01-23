package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseClass;
import utils.CommonUtils;

public class RegistrationPage extends BaseClass {
    public RegistrationPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "")
    private WebElement emailID;

    @FindBy(xpath = "")
    private WebElement password;

    @FindBy(xpath = "")
    private WebElement confirmPassword;

    @FindBy(xpath = "")
    private WebElement registerButton;

    @FindBy(xpath = "")
    private WebElement rechargeWalletButton;

    public void enterEmailID(String value){
        CommonUtils.setText(emailID, value);
    }

    public void enterPassword(String value){
        CommonUtils.setText(password, value);
    }

    public void enterConfirmPassword(String value){
        CommonUtils.setText(confirmPassword, value);
    }

    public void clickRegisterButton(){
        CommonUtils.clickButton(registerButton);
    }

    public void clickRechargeWalletButton(){
        CommonUtils.clickButton(rechargeWalletButton);
    }
}