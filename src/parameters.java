import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

public class parameters {
	
	WebDriver driver = new ChromeDriver();
	
	SoftAssert myAssertion = new SoftAssert();
	@BeforeTest
	public void mySetup () {
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		
		driver.get("https://www.google.com/");
		
		
		
	}
	
	@AfterTest
public void theEnd () {
		


	}

}
