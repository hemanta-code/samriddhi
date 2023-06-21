package commonLibs.implementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ElementControl {
	
	
	WebDriver driver;
	
	// constructor
	public ElementControl(WebDriver rdriver) {
		driver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	// method for element click
	public void clickElement(WebElement element) {
		element.click();
	}
	
	// method for clear text
	public void clear(WebElement element) {
		element.clear();
	}
	
	// method to sent text
	public void setText(WebElement element, String text) {
		element.sendKeys(text);
	}
	
	// method to check if element is enabled or not
	public boolean isEnabled(WebElement element) {
		return element.isEnabled();
	}
	
	// method to check if element is displayed
	public boolean isDisplayed(WebElement element) {
		return element.isDisplayed();
	}
	
	
	// method to accept alert
	public void acceptAlert() {
		driver.switchTo().alert().accept();
	}
	
	// method to get text from alert
	public String getTextFromAlert() {
		return driver.switchTo().alert().getText();
	}
	
	// method to select through visible text
	public void selectViaVisibleText(WebElement element, String text) {
		Select dropdown = new Select(element);
		dropdown.selectByVisibleText(text);
	}

}
