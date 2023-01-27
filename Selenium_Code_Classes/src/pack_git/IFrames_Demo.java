package pack_git;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrames_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Set the chromedriver path
				System.setProperty
				("webdriver.chrome.driver", 
						"C:\\Drivers_New\\BrowserDrivers\\chromedriver_win32 (1)\\chromedriver.exe");
		        
					
				//Calling the chromedriver and maximising the browser window
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();

			       
				//Open browser URL
				String url = "https://demoqa.com/frames";
				driver.get(url);
				
				//Scroll down on the page
				//JavascriptExecutor js = (JavascriptExecutor) driver;
				//js.executeScript("window.scrollBy(0,500)"); 
				
				WebElement frame1 = driver.findElement(By.id("frame1"));	
                
				
				//scroll to that element
				//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)",frame1);
				//System.out.println("Am I scrolling??");
				
				//scroll to end of page
				((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight)"); 
				System.out.println("Am I scrolling to the end of the page??");

				//Get the first iframe
				//Switch to the first iframe -index, webelement,ID,name
				//driver.switchTo().frame("frame1"); //using ID
				//driver.switchTo().frame(1); //using index -first frame ????not working
				driver.switchTo().frame(frame1); //using WebElement
				
				System.out.println("Am I switching??");
				
                	
				//Get the text
				WebElement f1_heading = driver.findElement(By.id("sampleHeading"));
				String f1_text = f1_heading.getText();
				System.out.println("Text in first iframe" +f1_text);
				
				
				//Go back to the main page and get the text of the paragraph
				driver.switchTo().defaultContent(); //switch back to main
				//driver.switchTo().parentFrame();  //another way to go back to main
				
				String main_para = driver.findElement(By.xpath("//div[@id='framesWrapper']/child::div")).getText();
				System.out.println(main_para);
				
		
	}

}
