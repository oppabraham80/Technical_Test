

package com.lexisnexis.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.openqa.selenium.TimeoutException;

public class RiskAutomationMain {
    private WebDriver driver;
    private WebDriverWait wait;

    // Locators
    private By financialServicesLink = By.linkText("Financial Services");
    private By insuranceLink = By.linkText("Insurance");
    private By lifeAndPensionsLink = By.linkText("Life and Pensions");
    private By corporationsAndNonProfitsLink = By.linkText("Corporations and Non-Profits");
    private By viewFinancialServicesHomeLink = By.xpath("//div[@class='section-title-wraper']/a[@class='description-learnmore']");

    public RiskAutomationMain(WebDriver driver) {
        this.driver = driver;
        // Create WebDriverWait object with specified timeout
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public boolean isFinancialServicesLinkClickable() {
        return isElementClickable(financialServicesLink);
    }

    public boolean isInsuranceLinkClickable() {
        return isElementClickable(insuranceLink);
    }

    public boolean isLifeAndPensionsLinkClickable() {
        return isElementClickable(lifeAndPensionsLink);
    }

    public boolean isCorporationsAndNonProfitsLinkClickable() {
        return isElementClickable(corporationsAndNonProfitsLink);
    }

    public boolean isViewFinancialServicesHomeLinkClickable() {
        return isElementClickable(viewFinancialServicesHomeLink);
    }

    private boolean isElementClickable(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
            return element != null && element.isEnabled();
        } catch (TimeoutException e) {
            return false; // Return false if element is not clickable within the timeout
        }
    }

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\oppab\\OneDrive\\Documents\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        RiskAutomationMain automation = new RiskAutomationMain(driver);

        System.out.println("Financial Services link is clickable: " + automation.isFinancialServicesLinkClickable());
        System.out.println("Insurance link is clickable: " + automation.isInsuranceLinkClickable());
        System.out.println("Life and Pensions link is clickable: " + automation.isLifeAndPensionsLinkClickable());
        System.out.println("Corporations and Non-Profits link is clickable: " + automation.isCorporationsAndNonProfitsLinkClickable());
        System.out.println("'View Financial Services Home' link is clickable: " + automation.isViewFinancialServicesHomeLinkClickable());

        driver.quit(); // Close the browser
    }
}

