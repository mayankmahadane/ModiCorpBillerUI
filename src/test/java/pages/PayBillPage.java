package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.BaseClass;
import utils.CommonUtils;

public class PayBillPage extends BaseClass {
    public PayBillPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "")
    private WebElement utilityDropdown;

    @FindBy(xpath = "")
    private WebElement vendorDropdown;

    @FindBy(xpath = "")
    private WebElement customerIDTextField;

    @FindBy(xpath = "")
    private WebElement makePaymentButton;

    @FindBy(xpath = "")
    private WebElement getUnpaidBillButton;

    public void selectUtility(String option){
        Select utility = new Select(utilityDropdown);
        utility.selectByVisibleText(option);
    }

    public void selectVendor(String option){
        Select vendor = new Select(vendorDropdown);
        vendor.selectByVisibleText(option);
    }

    public void enterCustID(String custID){
        CommonUtils.setText(customerIDTextField, custID);
    }

    public void clickGetUnpaidBillButton(){
        CommonUtils.clickButton(getUnpaidBillButton);
    }

    public void clickMakePaymentButton(){
        CommonUtils.clickButton(makePaymentButton);
    }
}
