package Automation.pages;

import Automation.utils.TestBase;
import Automation.utils.TestUtil;
import org.openqa.selenium.By;

public class SignInPage extends TestBase {
    TestUtil ut = new TestUtil();
    String baseURL = "https://www.amazon.com/";

    By signInAcct = By.id("nav-link-accountList");
    By emailInfo = By.id("ap_email");
    By Cont = By.xpath("//input[@class='a-button-input']");
    By pwInfo = By.xpath("//input[@type='password']");
    By signIn = By.id("signInSubmit");
    By actualText = By.xpath("//div[@class='nav-line-1-container']");
    By actualLine = By.xpath("//h4[@class='a-alert-heading']");

    public void goToAmazon(){
        ut.navigateTo(baseURL);
    }

    public void signInBtn(){
        ut.clickElement(signInAcct);
    }

    public void enterCreds(){
        ut.enterText(emailInfo, "archaic.undated-05@icloud.com");
        ut.clickElement(Cont);
        ut.enterText(pwInfo, "Whatever99!");
        ut.clickElement(signIn);
    }

    public void verifyPage(){
        String expectedText = "Hello, Levi";
        ut.validateText(actualText, expectedText);
    }

    public void wrngCreds(){
        ut.enterText(emailInfo, "jh@gmail.com");
        ut.clickElement(Cont);
        ut.enterText(pwInfo, "blahblah");
        ut.clickElement(signIn);
    }

    public void verifyWrngCreds(){
        String expectedText = "There was a problem";
        ut.validateText(actualLine, expectedText);
    }
}
