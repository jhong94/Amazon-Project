package Automation.pages;

import Automation.utils.TestBase;
import Automation.utils.TestUtil;
import org.openqa.selenium.By;

public class SearchFilterPage extends TestBase {
    TestUtil ut = new TestUtil();
    String baseURL = "https://www.amazon.com/";

    By searchInput = By.id("twotabsearchtextbox");
    By searchBtn = By.id("nav-search-submit-button");
    By sortBy = By.id("a-autoid-0-announce");
    By filterBy = By.id("s-result-sort-select_1");
    By actualText = By.xpath("//div[@class ='a-section a-spacing-small a-spacing-top-small']");


    public void goToAmazon(){
        ut.navigateTo(baseURL);
    }

    public void searchToothPks(){
        ut.enterText(searchInput, "toothpicks");
        ut.clickElement(searchBtn);
    }

    public void filterBy(){
        ut.clickElement(sortBy);
        ut.clickElement(filterBy);
    }

    public void verifyPage(){
        String expectedText = "1-48 of over 10,000 results for \"toothpicks\"";
        ut.validateText(actualText, expectedText);
    }
}
