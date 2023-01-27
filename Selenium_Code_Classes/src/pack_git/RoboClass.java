package pack_git;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RoboClass {

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
		
		//path where resume file is stored 
		StringSelection path = new StringSelection("C:\\SampleResume.docx");
		
		
		//put the path in clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);
		
		robo.delay(2000);

		//paste the file in the CV popup to upload file
		robo.keyPress(KeyEvent.VK_ENTER);  //press 'Enter' -similar to key down in Actions class
		
		robo.delay(2000);

		robo.keyRelease(KeyEvent.VK_ENTER ); //release 'Enter' key pressed -similar to key Up in Actions class

		robo.delay(2000);
		robo.keyPress(KeyEvent.VK_CONTROL); //paste the path
	

		robo.keyPress(KeyEvent.VK_V);   
		System.out.println("4");

		robo.delay(2000);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		System.out.println("5");

		robo.delay(2000);
		robo.keyRelease(KeyEvent.VK_V);      //release control + V
		robo.delay(2000);
		
		robo.keyPress(KeyEvent.VK_ENTER);  //press 'Enter' -similar to key down in Actions class
		robo.delay(2000);
		robo.keyRelease(KeyEvent.VK_ENTER ); //release 'Enter' key pressed -similar to key Up in Actions class
		System.out.println("8");

	}

}






