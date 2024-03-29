package pages;

import static utilities.DriverSetup.getBrowser;

import java.time.Duration;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



import io.appium.java_client.AppiumBy;



public class BasePage {
	public WebElement getElement(By locator) {
		return getBrowser().findElement(locator);

	}

	public void clickOnElement(By locator) {
		 getElement(locator).click();
	}

	public void writeOnAElement(By locator, String text) {
		getElement(locator).sendKeys(text);
	}

	public void hoverOnElement(By locator) {
		Actions actions = new Actions(getBrowser());
		actions.clickAndHold(getElement(locator)).build().perform();
	}

	public void loadAWebPage(String url) {
		getBrowser().get(url);
	}

	public String getElementText(By locator) {
		return getElement(locator).getText();
	}
	 
	 public void scrollToAElement(By locator) {
		 JavascriptExecutor js = (JavascriptExecutor) getBrowser();
		 js.executeScript("arguments[0].scrollIntoView();", getElement(locator)); 
	 }
	 
	 public void selectDropdownByIndex(By locator, int number) {
		 Select select = new Select(getElement(locator));
		 getElement(locator).click();
		 select.selectByIndex(number);
	 }
	 
	 public String getSelectOptionText(By locator) {
		 Select select = new Select(getElement(locator));
		 return select.getFirstSelectedOption().getText();
		 
	 }
	 
	 public void selectDropdownByText(By locator, String text) {
		 Select select = new Select(getElement(locator));
		 getElement(locator).click();
		 select.selectByVisibleText(text);
	 }
	 
	 public void clearField(By locator) {
		 getElement(locator).clear();
	 }
	 
	 public void enterNumberOnAElement(By locator, int number) {
		 String text = String.valueOf(number);	
		 getElement(locator).sendKeys(text);
		}
	 
	 public String getAttributeValue(By locator, String a) {
			return getElement(locator).getAttribute(a);
		}
	 
	 public void waitForElementToBeClickable(By locator) {
		 WebDriverWait wait = new WebDriverWait(getBrowser(), Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	 
	 
	 public void waitForElementPresence(By locator) {
		 WebDriverWait wait = new WebDriverWait(getBrowser(), Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	 
	 public void waitForVisibilityOfElement(By locator) {
		 WebDriverWait wait = new WebDriverWait(getBrowser(), Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	 
	 
	 public String getElementURL(By locator) {
			return getAttributeValue(locator,"href");	
			
		}
	 
	 public List<WebElement> getListOfElement(By locator) {
		 return getBrowser().findElements(locator);
		}
	 
	 public void scrollToAElement(WebElement element) {
		 JavascriptExecutor js = (JavascriptExecutor) getBrowser();
		 js.executeScript("arguments[0].scrollIntoView();", element); 
	 }
	 
	 public void scrollInToViewAppium(String text) {
		 getBrowser().findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\""+text+"\"))"));
		 
	 }
	 
	 
	 public void scrollInHorizontalAppium(String text) {
		 getBrowser().findElement(AppiumBy.androidUIAutomator(
	                "new UiScrollable(new UiSelector().scrollable(true).instance(0)).setAsHorizontalList()" +
	                ".scrollIntoView(new UiSelector().text(\"" + text + "\"))"));
		 
	 }
	 
	 
	 public void scrollDownByXPath(String xpath) {
		 String scrollCommand = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().resourceIdMatches(\"" + xpath + "\").instance(0))";
		    getBrowser().findElement(AppiumBy.androidUIAutomator(scrollCommand));
		   
		}
	 
	 public void scrollAction(WebElement x) {
		 Actions actions = new Actions(getBrowser());
	     actions.scrollToElement(x);
	 }
	 
	 
	

}
