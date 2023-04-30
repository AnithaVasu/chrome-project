package org.scrshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchPhoneandScreenShot {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium workspace\\Selenium\\Driver1\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.bigbasket.com/sp/2302481-bbpl-staples/?nc=b-cp-hp-sec1&b_t=cp_hp_sec1&b_camp=2302481-bbpl-staples_460_bangalore&t_from_ban=6307941&t_pos=1&t_ch=desktop");
		
		
		WebElement search =driver.findElement(By.xpath("(//*[@qa='product'])[1]"));
		search.click();
		WebElement clc= driver.findElement(By.xpath("//*[text()='ADD TO BASKET')"));
		clc.click();
		
		driver.navigate().to("https://www.bigbasket.com/sp/2302481-bbpl-staples/?nc=b-cp-hp-sec1&b_t=cp_hp_sec1&b_camp=2302481-bbpl-staples_460_bangalore&t_from_ban=6307941&t_pos=1&t_ch=desktop");
		
		WebElement click2=driver.findElement(By.xpath("(//*[@qa='product'])[2]"));
		click2.click();
		
		driver.navigate().back();
		
		WebElement click3 = driver.findElement(By.xpath("(//*[@qa='product'])[3]"));
		click3.click();
	
		
		
		
		
	}

}
