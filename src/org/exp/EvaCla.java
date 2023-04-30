package org.exp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EvaCla {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium workspace\\Selenium\\Driver1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		
		//driver.findElement(By.xpath("//*[@name='firstName']/parent::div")).sendKeys("Ani"); //parent
		
		//driver.findElement(By.xpath("//*[@class='Xb9hP']/child::input")).sendKeys("adad"); //child
		
		//driver.findElement(By.xpath("(//*[@name='lastName']/ancestor::div)[16]")).sendKeys("dsad");//ancestor
		
		//driver.findElement(By.xpath("//*[@name='lastName']/following::input")).sendKeys("sawe");// following
		
		//driver.findElement(By.xpath("//*[@name='lastName']/preceding::input")).sendKeys("dasdasd");//preceding
		
		//driver.findElement(By.xpath("//*[@jsname='YRMmle']/preceding-sibling::*")).sendKeys("dsdsdsf"); //preceding-sibling
	
		//driver.findElement(By.xpath("//*[@name='firstName']/following-sibling::*")).sendKeys("cscsd");//following-sibling
		
		driver.get("https://www.amazon.in/s?k=mobiles&crid=8Z07R0WQ3AHY&sprefix=mobiles%2Caps%2C1010&ref=nb_sb_ss_ts-doa-p_2_7");
		
		driver.findElement(By.className("s-image"));
		
		
		
	}

}
