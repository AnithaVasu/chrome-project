package org.WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTableDynamic {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium workspace\\Selenium\\driver2\\chromedriver.exe");
	ChromeOptions ops = new ChromeOptions();
	ops.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(ops);
	driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
	
	WebElement table = driver.findElement(By.xpath("//*[@summary='Sample Table']"));
	List<WebElement> table_data = table.findElements(By.tagName("tr"));
	for(int i=1; i<=table_data.size();i++) {
		String ta =driver.findElement(By.xpath("//*[@id=\"post-body-5867683659713562481\"]/div[1]/div[4]/table/tbody/tr["+i+"]/td[5]")).getText();
	if(table_data.equals("1")) {
		String text =driver.findElement(By.xpath("//*[@id=\"post-body-5867683659713562481\"]/div[1]/div[4]/table/tbody/tr[" + i + "]/th")).getText();
		System.out.println(text);
	}
	}

	
}
}
