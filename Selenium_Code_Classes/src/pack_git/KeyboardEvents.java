package pack_git;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEvents {

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
				String url = "https://demoqa.com/text-box";
				driver.get(url);
				
				//username
				driver.findElement(By.id("userName")).sendKeys("Aparna Venugopal");
				
				//email
				driver.findElement(By.id("userEmail")).sendKeys("AVenu@abc.com");
				
				//c address
				WebElement cAddress = driver.findElement(By.id("currentAddress"));
				cAddress.sendKeys("123, Road 1, Street 2");
				
				//Actions class
				Actions actions = new Actions(driver);
				
				/*
				actions.keyDown(Keys.CONTROL); //press down control key
				actions.sendKeys("a");   //press a (control +a)
				actions.keyUp(Keys.CONTROL); //release pressed control+a keys
				actions.build().perform(); //perform the action
				*/
				
				//all the 4 lines can be combined to the line below
				actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
				
				/*
				actions.keyDown(Keys.CONTROL); //press down control key
				actions.sendKeys("c");   //press c (control +c)
				actions.keyUp(Keys.CONTROL); //release pressed control+c keys
				actions.build().perform(); //perform the action
				*/
				
				//all the 4 lines can be combined to the line below
				actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
				
                //p address
				//WebElement pAddress = driver.findElement(By.id("permanentAddress"));
				/*
				actions.sendKeys(Keys.TAB); //move the contorl to p address text box
				actions.build().perform(); //perform the action
                */
				
				//all the 2 lines can be combined to the line below
				actions.sendKeys(Keys.TAB).build().perform();
				
				/*
				actions.keyDown(Keys.CONTROL); //press down control key
				actions.sendKeys("v");   //press v (control +v)
				actions.keyUp(Keys.CONTROL); //release pressed control+v keys
				actions.build().perform(); //perform the action
                */
				
				//all the 4 lines can be combined to the line below
				actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
				
				
	}

}
