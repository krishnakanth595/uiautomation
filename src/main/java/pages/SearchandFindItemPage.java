package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SearchandFindItemPage {

	private WebDriver driver;
	
	@FindBy(xpath = "//input[@name='search']")
	private WebElement searchbox;
	@FindBy(xpath = "//div[@id='search']/span/button")
	private WebElement button;
	@FindBy(xpath = "//*[@id=\"content\"]/h1")
	private WebElement confirmSearch;
	@FindBy(xpath = "//a[text()='HTC Touch HD']")
	private WebElement item;
	
		public SearchandFindItemPage(WebDriver driver){
			
			this.driver=driver;
			PageFactory.initElements(driver, this);
			
		}
	
		public void searchItem() {
			
			searchbox.sendKeys("HTC Touch HD");
			button.click();
			Assert.assertEquals(confirmSearch.getText(), "Search - HTC Touch HD");
			System.out.println("Search Item Displayed Successfully");
		}
		
		public void openItem() {
			
			item.click();
			Assert.assertEquals(driver.getTitle(), "HTC Touch HD");
			System.out.println("Item Opened Successfully");
		}
}
