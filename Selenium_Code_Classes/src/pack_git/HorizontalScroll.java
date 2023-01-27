package pack_git;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HorizontalScroll {

	public static void main(String[] args) {
		
		//Set the chromedriver path
		System.setProperty
		("webdriver.chrome.driver", 
				"C:\\Drivers_New\\BrowserDrivers\\chromedriver_win32 (1)\\chromedriver.exe");
        
			
		//Calling the chromedriver and maximising the browser window
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

	       
		//Open browser URL
		String url = "http://demo.guru99.com/test/guru99home/scrolling.html";
		driver.get(url);
		
		WebElement right_element = driver.findElement(By.linkText("VBScript"));
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)",right_element);
		
	    System.out.println("I have scrolled to the right to show the VBScript element");
	    
	    driver.quit();
	}
	

}

