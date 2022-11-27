package pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import base.TestBase;

public class PgSearchPage extends TestBase{

	@FindBy(className="_4rR01T")
	List<WebElement> selectProduct;
	
	@FindBy(xpath="//span[contains(text(),'results')]")
	WebElement searchResults;
	
	public PgSearchPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void SetValidateSearch(String productName) {		
		String headerData = searchResults.getText();
		//Assert.assertEquals(headerData,"Showing 1 – 24 of 82,606 results for \"Dell\"","Results count failed");
		if(headerData.contains(productName)){
			Assert.assertTrue(true);
		}else {
			Assert.assertFalse(true,"Product is not correctly displayed in the search results");
		}		
	}
	
	public void SetSelectProduct() {
		System.out.println("Searching for product :");
		List<WebElement> items = selectProduct;
//		List <WebElement> items = driver.findElements(By.xpath("//div[contains(@class, 'tall-aspect')]"));
		System.out.println("Total Products displaying : "+items.size());
		SoftAssert softAssert = new SoftAssert();
		for(int i=0;i<items.size();i++)
		{
			String title = items.get(i).getText();
			System.out.println("Title: "+title);
			softAssert.assertTrue(title.contains("DELL"),"Title does not contain Dell");
		}
		softAssert.assertAll();     //If anyone product title doesen't contain Dell softAssert will fail 
		items.get(0).click();
	}
}
