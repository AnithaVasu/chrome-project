package org.WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableProcess {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium workspace\\Selenium\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		/*List<WebElement> table_rows = driver.findElements(By.tagName("tr"));
		int table_row = table_rows.size();
		System.out.println(table_row);*/
		
		WebElement table = driver.findElement(By.xpath("//table[@id='table1']"));
		
		WebElement particular_text = driver.findElement(By.xpath("//table[@id='table1']//tr[4]//td[1]"));
		System.out.println(particular_text.getText());
		
		
		
	
	}
	

}
