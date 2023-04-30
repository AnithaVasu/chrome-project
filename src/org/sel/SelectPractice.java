package org.sel;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class SelectPractice {
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium workspace\\Selenium\\Driver1\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/dropdowns");
		
		//WebElement month = driver.findElement(By.name("month"));
		//Select s =new Select(month);
		//s.selectByIndex(04);
		
		//WebElement day = driver.findElement(By.name("day"));
		//Select s1 =new Select(day);
		//s1.selectByValue("17");
		
		//WebElement year = driver.findElement(By.name("year"));
		//Select s2 = new Select(year);
		//s2.selectByVisibleText("2019");
		
		//WebElement submit = driver.findElement(By.name("Submit"));
		//submit.click();
		
		WebElement multiple =driver.findElement(By.xpath("//*[@multiple]"));
		Select s3 = new Select(multiple);
		s3.selectByIndex(4);
		s3.selectByValue("ta");
		s3.selectByVisibleText("Aquaman");
		
		List<WebElement> selected = s3.getAllSelectedOptions();
		
		for(WebElement selectedlist : selected ) {
			System.out.println(selectedlist.getText());
		}
		
		
		//TakesScreenshot t = (TakesScreenshot) driver;
		//File pic = t.getScreenshotAs(OutputType.FILE);
		//File f = new File("D:\\Selenium workspace\\Selenium\\Scrrenshot.multiple.jpeg");
		//FileHandler.copy(pic, f);
		
		
		
	}

}
