import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class GoogleSearch extends parameters {


	@Test
	public void verifiy_the_search_results () {
		
	driver.findElement(By.name("q")).sendKeys("Messi"+Keys.ENTER);
	
	driver.findElement(By.xpath("//*[@id=\"Rzn5id\"]/div/a[2]")).click();
	
	String search_results =  driver.findElement(By.id("result-stats")).getText();
	
	
	String splitedText [] = search_results.split(" ");
	
	
	System.out.println(splitedText[1]);
	
	String theNumberOfTheSearchResults = splitedText[1];
	
	String theNumberOfTheSearchResultsUpdated = theNumberOfTheSearchResults.replace(",", "");
	
	int actualResultsNumber = Integer.parseInt(theNumberOfTheSearchResultsUpdated);
	
	int expectedNumber = 10 ;

	
	myAssertion.assertEquals(actualResultsNumber, expectedNumber, "wlh 3m n3ml test");
	
	myAssertion.assertAll();
	
	
			
	
		
	}
	
	
	
}
