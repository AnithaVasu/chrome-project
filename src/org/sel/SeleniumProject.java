package org.sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumProject {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium workspace\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		
		
		//driver.quit();
		
		//String cureenturl= driver.getCurrentUrl();
		
		//System.out.println("Current URL" + cureenturl);
		
		//if ("https://www.amazon.in/ref=nav_logo".equals(cureenturl)) {
			
			//System.out.println("Url Same");
		//}
		
		//String Title =driver.getTitle();
		
		//System.out.println(Title);
		
		String pagesource= driver.getPageSource();
		
		System.out.println(pagesource);
		
		
		driver.close();
		
	}

}
