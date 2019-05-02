package co.fedorrrr;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\SelenoiumStuff\\V3\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor jsExecutor=(JavascriptExecutor)driver;
		
		driver.get("http://amazon.com");
		
		driver.manage().window().maximize();
		
		WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("JBL earphones");
		
		WebElement serachButton=driver.findElement(By.className("nav-input"));
		serachButton.click();
		
		//WebElement checkBox=driver.findElement(By.xpath("//input[@type='checkbox'][misodiko]"));
		//WebElement checkBox=driver.findElement(By.name("a-icon a-icon-checkbox"));
		//checkBox.click();
		
		Thread.sleep(3000);
		
		jsExecutor.executeScript("window.scrollBy(0,4000)");
		
		Thread.sleep(4000);
		
		driver.quit();
	}

}
