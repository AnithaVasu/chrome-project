package Javascriptexecu;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jsexecutor {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium workspace\\Selenium\\Driver1\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		
		WebElement fname= driver.findElement(By.xpath("//input[@type='text']"));
		WebElement sname =driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		WebElement clic= driver.findElement(By.xpath("(//*[@jsname='V67aGc'])[3]"));
		
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].setAttribute('value','anitha')", fname);
		
		js.executeScript("arguments[0].setAttribute('value','123')", sname);
		
		js.executeScript("arguments[0].click()", clic);
		
		
		
		
	}

}
