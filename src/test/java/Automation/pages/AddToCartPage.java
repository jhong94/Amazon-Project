package Automation.pages;

import Automation.utils.TestBase;
import Automation.utils.TestUtil;
import org.openqa.selenium.By;

public class AddToCartPage extends TestBase {
    TestUtil ut = new TestUtil();
    String baseURL = "https://www.amazon.com/";

    //To log in
    By acctInfo = By.id("nav-link-accountList");
    By emailInfo = By.id("ap_email");
    By Cont = By.xpath("//input[@class='a-button-input']");
    By pwInfo = By.xpath("//input[@type='password']");
    By signIn = By.id("signInSubmit");

    //To use the search bar
    By searchBar = By.id("twotabsearchtextbox");
    By submitBtn = By.id("nav-search-submit-button");

    //Item one, water bottle
    By selBtl = By.xpath("//div[@data-component-type=\"s-search-result\"][7]//h2//a");
    By addToCartBtn = By.xpath("//span[@id='submit.add-to-cart']/span");

    //Item two, Office Chair
    By selChair = By.xpath("//div[@data-component-type=\"s-search-result\"][5]//h2//a");

    //Item three, Watch
    By selWatch = By.xpath("//div[@data-component-type=\"s-search-result\"][3]//h2//a");

    //Go back to front page each time after adding item to cart
    By frontPg = By.xpath("//a[@id='nav-logo-sprites']");

    By clickCart = By.xpath("//a[@class='nav-a nav-a-2 nav-progressive-attribute']");


    public void goToAmazon(){
        ut.navigateTo(baseURL);
        ut.clickElement(acctInfo);
        ut.enterText(emailInfo, "archaic.undated-05@icloud.com");
        ut.clickElement(Cont);
        ut.enterText(pwInfo, "Whatever99!");
        ut.clickElement(signIn);
    }

    public void addBtlToCart() {
        ut.enterText(searchBar, "water bottle");
        ut.clickElement(submitBtn);
        ut.clickElement(selBtl);
        ut.clickElement(addToCartBtn);
        ut.clickElement(frontPg);
    }

    public void addChairToCart() {
        ut.enterText(searchBar, "office chairs");
        ut.clickElement(submitBtn);
        ut.clickElement(selChair);
        ut.clickElement(addToCartBtn);
        ut.clickElement(frontPg);
    }

    public void addWatchToCart(){
        ut.enterText(searchBar, "watches");
        ut.clickElement(submitBtn);
        ut.clickElement(selWatch);
        ut.clickElement(addToCartBtn);
    }

}
