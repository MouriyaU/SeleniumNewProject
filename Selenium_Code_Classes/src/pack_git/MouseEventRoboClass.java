package pack_git;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseEventRoboClass {

	public static void main(String[] args) throws AWTException 
	{
		//Set the Chrome driver path
				System.setProperty
				("webdriver.chrome.driver", 
						"C:\\Drivers_New\\BrowserDrivers\\chromedriver_win32 (1)\\chromedriver.exe");


				//Calling the ChromeDriver and maximizing the browser window
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();


				//Open browser URL
				String url = "https://www.foundit.in/seeker/registration";
				driver.get(url);
				
				
				//Get the Choose CV button and click on it
				driver.findElement(By.xpath("//span[@class='browse-text']")).click();
				
				//Instantiate Robot class
				Robot robo = new Robot();
				
				//Get the size of the window and try with pixels rto
				//click on the 'Open'
				Dimension dim = driver.manage().window().getSize();
				
				System.out.println("Dimesnsions x and y: " +dim.getWidth() +dim.getHeight());
				
				int x = (dim.getWidth()/4);// +20;
				int y = (dim.getHeight()/10) +50;
				
				robo.mouseMove(x, y);
				
				//trying to move mouse and take actions 
				//opening folder
				robo.delay(2000);
				robo.mousePress(InputEvent .BUTTON1_DOWN_MASK); //left click
				robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); //release left click
				robo.delay(2000);
				
				robo.keyPress(KeyEvent.VK_ENTER);
				robo.delay(2000);
				robo.keyRelease(KeyEvent.VK_ENTER);

				
				
	}
}
