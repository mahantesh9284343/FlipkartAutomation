package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class PgHomePage extends TestBase {
	
	@FindBy(className ="_2doB4z")
	WebElement loginclosetab;
	
	@FindBy(name="q")
	WebElement searchBox;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement searchButton;
	
	
	public PgHomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void closelogintab() {
		loginclosetab.click();
	}
	
	public void SetSearchBox(String product) {
		searchBox.sendKeys(product);
	}
	
	public void SetSearchButton() {
		searchButton.click();
	}
	
}
