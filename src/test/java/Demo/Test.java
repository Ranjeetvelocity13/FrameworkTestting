package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "/Users/ranjeetkendre/Documents/chromedriver");

		// Step 2

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();

		// ChromeDriver driver1 =new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.guru99.com/test/simple_context_menu.html");

		WebElement Double = driver.findElement(By.xpath("//button[@ondblclick=\"myFunction()\"]"));

		Actions act = new Actions(driver);

		act.doubleClick(Double).build().perform();

		Thread.sleep(2000);

		driver.switchTo().alert().accept();

		driver.quit();
	}

}
