package org.interview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium workspace\\Selenium\\driver3\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.tamildailycalendar.com/tamil_daily_calendar.php");
		
		WebElement opt = driver.findElement(By.id("month"));
		
		Select s = new Select(opt);
		
		s.selectByValue("17");
		s.selectByVisibleText("07");
		s.selectByValue("2019");
		
		List<WebElement> option =s.getOptions();
		
		for(int i=0; i<=option.size();i++) {
			System.out.println(option.get(i).getText());
		}
	}

}
