package org.WebTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WbDyanmic {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium workspace\\Selenium\\driver5\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		
		//WebDriverWait wait = new WebDriverWait(driver,20);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement table = driver.findElement(By.xpath("//*[@summary='Sample Table']"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> row = driver.findElements(By.tagName("tr"));
		for(int i=1;i<=row.size();i++) {
			System.out.println(row.get(i).getText()); 
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			WebElement meca= driver.findElement(By.xpath("//*[@id=\"post-body-5867683659713562481\"]/div[1]/div[4]/table/tbody/tr["+i+"]/td[2]"));
			meca.getText();
		}
		
		
		
		
		
		
		
		
		driver.close();
	}

}
