package org.exp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AccesingMail {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium workspace\\Selenium\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/search?q=google&oq=goog&aqs=chrome.0.35i39j46i131i199i433i465i512j69i57j35i39j69i65j69i60l2j5.885j0j7&sourceid=chrome&ie=UTF-8");
		WebElement we = driver.findElement(By.xpath("//*[@class='gb_e']"));
		we.click();
		
		WebElement play = driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div/c-wiz/div/div/ul[1]/li[5]/a"));
		driver.switchTo().frame(play);
		driver.close();
			
		}
		
		
		
	}


