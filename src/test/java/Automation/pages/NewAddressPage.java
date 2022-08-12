package Automation.pages;

import Automation.utils.TestBase;
import Automation.utils.TestUtil;
import org.openqa.selenium.By;

public class NewAddressPage extends TestBase {
    TestUtil ut = new TestUtil();
    String baseURL = "https://www.amazon.com/";

    By acctInfo = By.id("nav-link-accountList");
    By emailInfo = By.id("ap_email");
    By Cont = By.xpath("//input[@class='a-button-input']");
    By pwInfo = By.xpath("//input[@type='password']");
    By signIn = By.id("signInSubmit");

    By urAddy = By.xpath("//div[@class='ya-card-row']/div/div/div/ul/li/span/a[1]");

    By addAddyBtn = By.id("ya-myab-plus-address-icon");
    By addNo = By.xpath("//input[@id='address-ui-widgets-enterAddressPhoneNumber']");
    By addyLine = By.xpath("//input[@id='address-ui-widgets-enterAddressLine1']");
    By cityLine = By.xpath("//input[@id='address-ui-widgets-enterAddressCity']");
    By stateDrp = By.xpath("//span[@id='address-ui-widgets-enterAddressStateOrRegion']");
    By selState = By.xpath("//a[@id='address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId_0']");
    By zipCode = By.xpath("//input[@id='address-ui-widgets-enterAddressPostalCode']");
    By clickSubmit = By.xpath("//input[@class='a-button-input']");
    By actualText = By.xpath("//h4[@class='a-alert-heading']");

    By selNegState = By.xpath("//a[@id='address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId_12']");
    By fakeActual = By.xpath("//h4[@class='a-alert-heading']");

    public void goToAmazon(){
        ut.navigateTo(baseURL);
        ut.clickElement(acctInfo);
        ut.enterText(emailInfo, "archaic.undated-05@icloud.com");
        ut.clickElement(Cont);
        ut.enterText(pwInfo, "Whatever99!");
        ut.clickElement(signIn);
    }

    public void clickAdd(){
        ut.clickElement(acctInfo);
        ut.clickElement(urAddy);
    }

    public void addressInfo(){
        ut.clickElement(addAddyBtn);
        ut.enterText(addNo, "2563151826");
        ut.enterText(addyLine, "23 Ironaton Rd");
        ut.enterText(cityLine, "Talladega");
        ut.clickElement(stateDrp);
        ut.clickElement(selState);
        ut.enterText(zipCode, "35160");
        ut.clickElement(clickSubmit);
    }

    public void verifyPage(){
        String expectedText = "Address saved";
        ut.validateText(actualText, expectedText);
    }

    public void fakeAddress(){
        ut.clickElement(addAddyBtn);
        ut.enterText(addNo, "123456789");
        ut.enterText(addyLine, "8607 Cross St.");
        ut.enterText(cityLine, "Loganville");
        ut.clickElement(stateDrp);
        ut.clickElement(selNegState);
        ut.enterText(zipCode, "30052");
        ut.clickElement(clickSubmit);
    }

    public void fakeVerify(){
        String expFakeText = "Review your address";
        ut.validateText(fakeActual, expFakeText);
    }
}
