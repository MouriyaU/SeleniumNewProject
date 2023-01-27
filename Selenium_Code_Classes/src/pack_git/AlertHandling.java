/*
 * Program Details:
   Selenium program to automate ALERT POPUPS
   
   Author: Aparna Venugopal
   Date :  09-12-2022
 
 */


package pack_git;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertHandling {

	public static void main(String[] args) 
	{
		//Set cHrome driver path
		System.setProperty
		("webdriver.chrome.driver", 
				"C:\\Drivers_New\\BrowserDrivers\\chromedriver_win32 (1)\\chromedriver.exe");
		
		
		//Calling the chromedriver and maximising the browser window
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

	    //Open browser URL
		String url = "https://demoqa.com/alerts";
		driver.get(url);
		
			
		/* ***************************************************************************************/
		
		//Click on the first button
		WebElement firstButton = driver.findElement(By.id("alertButton"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click()",firstButton);

		Alert promptAlert1 = driver.switchTo().alert();
		System.out.println("Text in alert1" +promptAlert1.getText());
		
		promptAlert1.accept();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
		//Click on the second button

		WebElement secondButton = driver.findElement(By.id("timerAlertButton"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click()",secondButton);
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		Alert secondAlert = 
				 wait.until(ExpectedConditions.alertIsPresent());


		Alert promptAlert2 = driver.switchTo().alert();
		System.out.println("Text in alert2"+ promptAlert2.getText());
		promptAlert2.accept();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        
		
		//Click on the third button
		WebElement thirdButton = driver.findElement(By.id("confirmButton"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click()",thirdButton);
		
		Alert promptAlert3 = driver.switchTo().alert();
		System.out.println("Text in alert3" + promptAlert3.getText());
		
		promptAlert3.accept(); //to click the ok button
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));


		//Click on the last button 
		//On button click, prompt box will appear - button
		
		WebElement promptBt1 = driver.findElement(By.id("promtButton"));
		
		
	//	Click on the element using JavascriptExecutor as the element is not completely visible
		//on page load
		
		((JavascriptExecutor) driver).executeScript("arguments[0].click()",promptBt1);
				
		//Once the pop-up is visible, we need to switch the context to alert window
		//Alert class is used to use alert options
		Alert promptAlert = driver.switchTo().alert();
		System.out.println("Text in alert4" + promptAlert.getText());
		
		promptAlert.sendKeys("Aparna");
		promptAlert.accept(); //to click the ok button
		
		System.out.println(driver.findElement(By.id("promptResult")).getText());
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
		
		
		driver.quit();
	}

}
