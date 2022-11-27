package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class PgCartPage extends TestBase {
	
	@FindBy(className="_3v1-ww")
	WebElement addtoCartBtn;

	public PgCartPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Add item to cart
	public void SetAddItemToCart() {
		addtoCartBtn.click();
	}
}
