package pack_git;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseHover {

	public static void main(String[] args) 
	{
		        //Set the chromedriver path
				System.setProperty
				("webdriver.chrome.driver", 
						"C:\\Drivers_New\\BrowserDrivers\\chromedriver_win32 (1)\\chromedriver.exe");
				

					
				//Calling the ChromeDriver and maximizing the browser window
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				
		       
				//Open browser URL
				String url = "https://demoqa.com/menu/";
				driver.get(url);
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
				((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)"); 

				//Create an instance of the action class
				Actions action = new Actions(driver);
				
				//Find the webelement of the 'Main Item 2' menu
				WebElement mItem2 = driver.findElement(By.xpath("//a[text()='Main Item 2']"));
				//Hover over Main Item 2 menu
				action.moveToElement(mItem2).build().perform(); 
				System.out.println("Hover over Main Item 2");
							
				//Find the webelement of the 'SUB SUB LIST' menu (3rd in the menu)
				WebElement subSubList = driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']"));
				//Hover over SUB SUB LIST menu
				action.moveToElement(subSubList).build().perform(); 
				System.out.println("Hover over SUB SUB LIST");
					
				//Find the webelement of the 'Sub Sub Item 2' menu (2nd in the menu)
				WebElement subSubItem2 = driver.findElement(By.xpath("//a[text()='Sub Sub Item 2']"));
 				//Hover over Sub Sub Item 2 menu
				action.moveToElement(subSubItem2).build().perform(); 
				System.out.println("Hover over Sub Sub Item 2");
				
				driver.quit();

	}

}
