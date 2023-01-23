package utils;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class CommonUtils extends BaseClass{
	
	public static void waitForElementToBeVisible(WebElement element) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);
		
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void waitForElementToBeInvisible(WebElement element) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);
		
		wait.until(ExpectedConditions.invisibilityOf(element));
	}
	
	public static void waitForElementToBeClickable(WebElement element) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(ElementClickInterceptedException.class);
		
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static void scrollToElement(WebElement element) {
		Actions action = new Actions(driver);
		action.scrollToElement(element).perform();
	}

	public static void setText(WebElement element, String value) {
		waitForElementToBeVisible(element);
		element.sendKeys(value);
	}

	public static void clickButton(WebElement element) {
		waitForElementToBeClickable(element);
		element.click();
	}
}