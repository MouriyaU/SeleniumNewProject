package pack_git;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo {

	public static void main(String[] args) {
		
		//Set the chromedriver path
		System.setProperty
		("webdriver.chrome.driver", 
				"C:\\Drivers_New\\BrowserDrivers\\chromedriver_win32 (1)\\chromedriver.exe");
        
			
		//Calling the ChromeDriver and maximizing the browser window
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

	       
		//Open browser URL
		String url = "https://demoqa.com/buttons";
		driver.get(url);
		
		//Create an instance of the action class
		Actions action = new Actions(driver);
		
		//Find the button for ' Right click me'
		WebElement rtClickBn = driver.findElement(By.id("rightClickBtn"));
		//right click the button
		//action.contextClick(rtClickBn).perform(); 
		

		//another technique to right click
		//action.contextClick(rtClickBn);
		//Action act = action.build();
		//act.perform();
		
	//	action.contextClick(rtClickBn).build().perform(); //action chaining 1
		action.moveToElement(rtClickBn).contextClick(rtClickBn).build().perform();//action chaining 2

		
		//Get the text displayed
		String rtClMessage = driver.findElement(By.id("rightClickMessage")).getText();
		System.out.println(rtClMessage);
		
		
		//Get the double click button
		 WebElement doubleClickBn = driver.findElement(By.id("doubleClickBtn"));
      //  action.doubleClick(doubleClickBn).perform();--method 1

		action.doubleClick(doubleClickBn).build().perform(); //method 2action cheining

		//Get the text displayed
	    String doubleClMessage = driver.findElement(By.id("doubleClickMessage")).getText();
		System.out.println(doubleClMessage);
	   
		//Get the last button - Click me
		
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,500)"); 
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,50)"); 
		// ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight)"); 
		 WebElement clickBtn = driver.findElement(By.xpath("//button[text()='Click Me']"));

		 clickBtn.click();
		 
		//Get the text displayed
		 String clickMessage = driver.findElement(By.id("dynamicClickMessage")).getText();
		 System.out.println(clickMessage);
		 
		 
		//Close the browser
	    driver.quit();

	}

}






