package pack_git;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragnDropDemo {

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
		String url = "https://demoqa.com/droppable";
		driver.get(url);
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)"); 
		
		//Find the web element for draggable element
		WebElement draggable = driver.findElement(By.id("draggable"));
		System.out.println("Found draggable");
		
		//Find the web element for droppable element
		WebElement droppable = driver.findElement(By.id("droppable"));
		String dropHere = droppable.getText();
		System.out.println("Text before dropping : " +dropHere);

		//Create an instance of the action class
		Actions action = new Actions(driver);
		
		//Drag and drop the element on the page
		action.dragAndDrop(draggable, droppable).build().perform();
		
		String isDropped = droppable.getText();
		System.out.println("Text after dropping : " +isDropped);

		driver.quit();
		
	}

}


