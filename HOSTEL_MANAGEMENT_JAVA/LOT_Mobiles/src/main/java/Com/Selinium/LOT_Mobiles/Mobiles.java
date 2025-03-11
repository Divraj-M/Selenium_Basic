package Com.Selinium.LOT_Mobiles;
import org.openqa.selenium.By;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mobiles {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver1 = new ChromeDriver();
        driver1.manage().window().maximize();
        driver1.get("https://duckduckgo.com");
        System.out.println("Title:"+driver1.getTitle());
        Thread.sleep(1000);
        WebElement search=driver1.findElement(By.xpath("//*//input[@name=\"q\"]"));
        System.out.println("Displayed:"+search.isDisplayed());
        System.out.println("Enabled:"+search.isEnabled());
		search.sendKeys("JAVA"+Keys.ENTER);
		
		
		
		
		
		
		
		
		 
		
		
		
		
		
		
		
		

	}

}