package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;



public class AddtoCartPage  {

	private WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"button-cart\"]")
	private WebElement addbtn;
	@FindBy(xpath = "//*[@id=\"product-product\"]/div[1]")
	private WebElement successtext;
	
	public AddtoCartPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void addToCart() {
		
		addbtn.click();
		String msg=successtext.getText();
		Assert.assertTrue(msg.contains("Success:"));
		System.out.println("Item added to cart successfully");
	}
	
}
