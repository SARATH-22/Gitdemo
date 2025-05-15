package MavenTestcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Test1 {

	@Test
	public void testn()
	{
		//pre-requisite
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		
		// create the web driver
		 WebDriver driver=new ChromeDriver();
		//WebDriver driver=new EdgeDriver();
		
		
		//To open the url
		driver.get("https://www.naukri.com/");
		
		
		//To get the title of the page
		String title= driver.getTitle();	
		System.out.println(title);
		
		//To get the page source code
		String page=driver.getPageSource();
		System.out.println(page);
		
		//To get the current URL
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		//close the browser
		driver.quit();
		
	}

}
