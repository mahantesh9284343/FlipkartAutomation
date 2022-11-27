package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PgCartPage;
import pages.PgHomePage;
import pages.PgSearchPage;

public class SearchStepDef extends TestBase {
	
	PgHomePage pgHomePage;
	PgSearchPage pgSearchPage;
	PgCartPage pgCartPage;
	
	@Given("User open browser and navigate to url")
	public void user_open_browser_and_navigate_to_url() {
		initialize();
	}
	
	@When("User close login tab")
	public void user_close_login_tab() {
		pgHomePage = new PgHomePage();
		pgHomePage.closelogintab();
	}
	
	@When("User search for product as {string}")
	public void user_search_for_product_as(String product) {
		pgHomePage = new PgHomePage();
		pgHomePage.SetSearchBox(product);
		pgHomePage.SetSearchButton();
	}
	
	@Then("User validate search is successful for {string}")
	public void user_validate_search_is_successful_for(String productName) {
		pgSearchPage = new PgSearchPage();
		pgSearchPage.SetValidateSearch(productName);		
	}
	
	@Then("User select the Product")
	public void user_select_the_product() {
		pgSearchPage = new PgSearchPage();
		pgSearchPage.SetSelectProduct();
	}
	
	@Then("User add product to cart")
	public void user_add_product_to_cart() {
		pgCartPage = new PgCartPage();
		pgCartPage.SetAddItemToCart();
		
	}


}
