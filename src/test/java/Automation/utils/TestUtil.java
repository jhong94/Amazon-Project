package Automation.utils;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class TestUtil extends TestBase{

    public void navigateTo(String url) {
        driver.navigate().to(url);
    }

    public void jsClick(By element, String name){
        WebElement localElement = driver.findElement(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        localElement.click();
    }

    public WebElement waitForElement(By element) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public void clickElement(By element) {
        WebElement localElement = waitForElement(element);
        localElement.click();
    }

    public void dropDown(By element, String text) {
//        WebElement dropDown = driver.findElement(element);
        Select objSelect = new Select(driver.findElement(element));
        objSelect.selectByVisibleText(text);
//        objSelect.selectByIndex(num);
    }

    public void enterText(By element, String text) {
        WebElement localElement = waitForElement(element);
        localElement.sendKeys(text);
    }

    public void getText(By element){
        WebElement localElement = waitForElement(element);
        System.out.println(localElement.getText());
    }

    public void screenShot() throws IOException {
        Date currentDate = new Date();
        String screenshotFileName = currentDate.toString().replace(" ", "-").replace(":", "-");
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File(".//screenshot//" + screenshotFileName + ".png"));
    }

    public void validateText(By element, String getText){
        WebElement localElement = waitForElement(element);
        String actualText = localElement.getText();
        Assert.assertEquals(actualText.toLowerCase(), getText.toLowerCase());
    }
}
