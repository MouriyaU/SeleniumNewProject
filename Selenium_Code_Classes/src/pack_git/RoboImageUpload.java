package pack_git;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RoboImageUpload {

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
		String url = "https://blueimp.github.io/jQuery-File-Upload/";
		driver.get(url);
		
		//Add files
		driver.findElement(By.cssSelector(".btn.btn-success.fileinput-button")).click();
		
		
		//Instantiate Robot class
				Robot robo = new Robot();
				
				//path where resume file is stored 
				StringSelection path = new StringSelection("C:\\im1.png");
				
				
				//put the path in clipboard
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);
				
				robo.delay(2000);
				//paste the file in the CV popup to upload file
				robo.keyPress(KeyEvent.VK_ENTER);  //press 'Enter' -similar to key down in Actions class
				System.out.println("1");
				robo.keyRelease(KeyEvent.VK_ENTER ); //release 'Enter' key pressed -similar to key Up in Actions class
				System.out.println("2");

				robo.delay(2000);

				robo.keyPress(KeyEvent.VK_CONTROL); //paste the path
				System.out.println("3");
				robo.keyPress(KeyEvent.VK_V);   
				System.out.println("4");

				robo.delay(2000);

				robo.keyRelease(KeyEvent.VK_CONTROL);
				System.out.println("5");

				robo.delay(2000);

				robo.keyRelease(KeyEvent.VK_V);      //release control + V
				System.out.println("6");
				robo.delay(2000);

				robo.keyPress(KeyEvent.VK_ENTER);  //press 'Enter' -similar to key down in Actions class
				System.out.println("7");
				robo.delay(2000);

				robo.keyRelease(KeyEvent.VK_ENTER ); //release 'Enter' key pressed -similar to key Up in Actions class
				System.out.println("8");

	}

}
