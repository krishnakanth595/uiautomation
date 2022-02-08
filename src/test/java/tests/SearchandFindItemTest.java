package tests;



import org.testng.annotations.Test;

import pages.BaseTest;
import pages.SearchandFindItemPage;

public class SearchandFindItemTest extends BaseTest {
	
	@Test
	public void searchTest() {
		
		launchUrl("http://tutorialsninja.com/demo/index.php?route=common/home");
		SearchandFindItemPage sfp=new SearchandFindItemPage(driver);
		waitforPageLoad();
		sfp.searchItem();
		sfp.openItem();
		
	}
	
}
