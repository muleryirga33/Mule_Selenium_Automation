package co.edurakel.selenium.webdriver.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class launchbrowser {
	
	public static WebDriver driver=null;

	public static void main(String[] args) throws InterruptedException { 
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\SELENIUM AUTOMATION\\BROWSER DRIVERS\\chromedriver.exe");
		    driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
			
			// open the web page
			
			driver.navigate().to("https://www.amazon.in/");
			driver.manage().window().maximize();
			String title= driver.getTitle();
			
			if(title.equalsIgnoreCase("amazon.in"))
				System.out.println("Title matches");
				
				else
					System.out.println(title);
			
			//locate a web element
			String tagname= "";
			tagname= driver.findElement(By.cssSelector("#nav-hamburger-menu > span")).getText();
			System.out.println(tagname);
			
			driver.findElement(By.className("hm-icon-label")).click();
		
			
		    WebElement seeAll= driver.findElement(By.xpath("//i[@class='nav-sprite hmenu-arrow-more']"));
		    JavascriptExecutor js= (JavascriptExecutor) driver;
		    js.executeScript("arguments[0].scrollIntoView(true)", seeAll);
		    Thread.sleep(2000);
		    seeAll.click();
		    
		    driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/ul/li[7]/a")).click(); 
			Thread.sleep(1000);
			
			driver.findElement(By.linkText("Fiction Books")).click();
			Thread.sleep(2000);
			
			//Typing the Text
			
			WebElement myElement= driver.findElement(By.id("twotabsearchtextbox"));
			myElement.sendKeys("John Grisham");
			
			driver.findElement(By.id("nav-search-submit-button")).click();
			Thread.sleep(2000);
			
			//Select the book
			
			//driver.findElement(By.partialLinkText("Firm")).click();
			//Thread.sleep(2000);
		   
			//driver.quit();
					
	}
	
}
