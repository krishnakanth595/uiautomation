package tests;

import org.testng.annotations.Test;

import pages.AddtoCartPage;
import pages.BaseTest;
import pages.SearchandFindItemPage;

public class AddtoCartTest extends BaseTest {

	
	@Test
	public void cartTest() {
		
		launchUrl("http://tutorialsninja.com/demo/index.php?route=common/home");
		SearchandFindItemPage search=new SearchandFindItemPage(driver);
		AddtoCartPage add= new AddtoCartPage(driver);
		waitforPageLoad();
		search.searchItem();
		search.openItem();
		add.addToCart();
		
	}
	
}
