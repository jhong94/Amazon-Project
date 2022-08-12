package Automation.pages;

import Automation.utils.TestBase;
import Automation.utils.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class ProductSearchPage extends TestBase {
    TestUtil ut = new TestUtil();
    String baseURL = "https://www.amazon.com/";

    By chooseDept = By.id("searchDropdownBox");
    By searchInput = By.id("twotabsearchtextbox");
    By searchBtn = By.id("nav-search-submit-button");
    By actualText = By.xpath("//div//span[contains(text(), '1-24 of over 60,000 results for')]");
    By appleKeyboard = By.xpath("//span[contains(text(), 'Apple Magic Keyboard with Numeric Keypad (Wireless, Rechargable) (US English) - Silver')]");
    By actualTitle = By.xpath("//span[@class='a-size-large product-title-word-break']");

    public void goToAmazon(){
        ut.navigateTo(baseURL);
    }

    public void deptComp(){
//        String expectedTitle = "Apple Magic Keyboard with Numeric Keypad (Wireless, Rechargable) (US English) - Silver";

        ut.dropDown(chooseDept, "Computers");
        ut.enterText(searchInput, "keyboard");
        ut.clickElement(searchBtn);
    }

    public void verifyPage(){
        String expectedText = "1-24 of over 60,000 results for";
        ut.validateText(actualText, expectedText);
    }
}
