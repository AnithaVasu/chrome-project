package org.interview;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class sel {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium workspace\\Selenium\\driver5\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		//ChromeDriver driver = new ChromeDriver(options);
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//WebDriverWait wait = new WebDriverWait(driver,Minutes);
		
		driver.get("https://www.tamildailycalendar.com/tamil_daily_calendar.php");
		
		driver.manage().window().maximize();
		
		WebElement mon =driver.findElement(By.xpath("//*[@id=\"month\"]"));
		Select s = new Select(mon);
		s.selectByIndex(4);
		
		WebElement year =driver.findElement(By.xpath("//*[@name=\"year\"]"));
		Select sel = new Select(year);
		sel.selectByVisibleText("2019");
		
		List<WebElement> opt=sel.getOptions();
		for(int i=0;i<opt.size();i++) {
			System.out.println(opt.get(i).getText()); 
		}
		
		driver.close();
		
		//s.selectByVisibleText("04 (April)");
		//s.selectByValue("06")
	}

}
