package lexisNexis.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LexisNexisStepDefinitions {
	         WebDriver driver = new FirefoxDriver(); 
	         
	         
  @Given("I am on the LexisNexis homepage")
  public void i_am_on_the_LexisNexis_homepage() {
  System.setProperty("webdriver.gecko.driver", "C:\\Users\\oppab\\OneDrive\\Documents\\geckodriver.exe");
  driver.get("https://risk.lexisnexis.co.uk/");  
  }
  

  @Then("{string} should be present and clickable")
  public void element_should_be_present_and_clickable(String elementName) {
  Assert.assertTrue(isElementPresent(elementName), "Element '" + elementName + "' is not present");
  Assert.assertTrue(isElementClickable(elementName), "Element '" + elementName + "' is not clickable");
  }


  @When("I select {string} under Choose your Industry tab")
  public void i_select_under_choose_your_industry_tab(String industry) {
  driver.findElement(By.linkText(industry)).click();
  }
  private boolean isElementPresent(String elementName) {
  return driver.findElements(By.linkText(elementName)).size() > 0;
  }
  private boolean isElementClickable(String elementName) {
  return driver.findElement(By.linkText(elementName)).isEnabled();
		    }
		
	}


