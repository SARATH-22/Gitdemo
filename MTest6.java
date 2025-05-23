package MavenTestcase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MTest6 {

	public static void main(String[] args) throws InterruptedException {
		//pre-requisite
		System.setProperty("webdriver.chrome.driver", "E:\\Cdriver\\chromedriver-win64\\chromedriver.exe");
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		
		// create the web driver
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new EdgeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		Thread.sleep(2000);
	
		List<WebElement> rows= driver.findElements(By.tagName("tr"));
		 
		 for(int i=0;i<rows.size();i++) {
			 
			List<WebElement> cols=driver.findElements(By.tagName("td"));
			 
			 for(int j=0; j<cols.size();j++) {
				 
				 System.out.println(cols.get(j).getText()+"");
				 
			 }
			 System.out.println("");
			 
			 
		 }
		driver.quit();

	}

}
