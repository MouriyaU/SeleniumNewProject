package pack_git;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
				//Set CHrome driver path
				System.setProperty
				("webdriver.chrome.driver", 
						"C:\\Drivers_New\\BrowserDrivers\\chromedriver_win32 (1)\\chromedriver.exe");
				
				
				//Calling the chromedriver and maximising the browser window
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();

			    //Open browser URL
				String url = "https://demoqa.com/browser-windows";
				driver.get(url);
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

				//CLick on the 'New Window' button				
				//driver.findElement(By.id("windowButton")).click();
				
				
				//uisng xpath -Method 1 -'contains'
				//driver.findElement(By.xpath("//button[contains(@type,'button')]")).click();
				//driver.findElement(By.xpath("//button[contains(@id,'windowButton')]")).click();
				//driver.findElement(By.xpath("//button[contains(@id,'windowB')]")).click();
				//driver.findElement(By.xpath("//*[contains(@id,'windowButton')]")).click();  //doesnt click so try next line
				//driver.findElement(By.xpath("//*[(@id ='windowButton' and @type = 'button')]")).click();
				
				driver.findElement(By.xpath("//*[(@id ='windowButton' or @type = 'bun')]")).click();
				//or condition will check any condition is true

				
				//uisng xpath -Method 2 -'starts-with'
				//driver.findElement(By.xpath("//button[starts-with(@id,'win')]")).click();
				
				//uisng xpath -Method 3 -'text' function
				//driver.findElement(By.xpath("//button[text()='New Window']")).click();
				//driver.findElement(By.xpath("//*[text()='New Window']")).click();
				
				

				//Click on the 'New Window message' button
				WebElement newWindowBtn = driver.findElement(By.id("messageWindowButton"));
				((JavascriptExecutor) driver).executeScript("arguments[0].click()",newWindowBtn);

				//Window handling
				
				//Main window
				 String mainWindow = driver.getWindowHandle();
				 System.out.println("Main Window Text: " +mainWindow);
				 
				 //Get multiple window handles and put them into a set
				 Set <String> winSet1 = driver.getWindowHandles();
						 
				 Iterator<String> itr = winSet1.iterator();
				 while(itr.hasNext())
				 {
					 System.out.println("Inside while");

					 String childWindow = itr.next();
					 System.out.println("Child window ID: " + childWindow);
					 
					 if (! mainWindow.equalsIgnoreCase(childWindow))
					 {
						 System.out.println("Inside first if");

						 String childURL = driver.switchTo().window(childWindow).getCurrentUrl();
						 System.out.println("First window switch????/");

						 System.out.println("Child window ID: " + childWindow);
						 System.out.println("Child window URL :" + childURL);

						 if (childURL.equals("https://demoqa.com/sample"))
						 {
							 System.out.println("Inside if");

							//Get text from first child window
							 WebElement text = driver.findElement(By.id("sampleHeading"));
	                         System.out.println("Text of child window is " + text.getText());
	                         driver.close(); //Close the child window
							 System.out.println("Child window1 closed");

						 }
						 
					 }

				 } 
	}

}

