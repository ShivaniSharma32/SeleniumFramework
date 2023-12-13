package Practice2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pjct1Test {
	
	@Test
	
	public void p1Test()
	{
		WebDriverManager.chromedriver().setup();	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	}

}
