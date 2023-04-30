package org.ActionandActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
	public static WebDriver driver;
	
	public void settingEnvironment() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium workspace\\Selenium\\Driver1\\chromedriver.exe");
		
	}
	public void launchurl(String URL) {
		driver.get(URL);
	}
	public void windowmaxi() {
		driver.manage().window().maximize();
	}
	public void inputfield(WebElement element, String inputkeys) {
		element.sendKeys(inputkeys);
	}
	
	public WebElement byElement(By by) {
		WebElement FindElement = driver.findElement(by);
		return FindElement;
	}
	public void clic(WebElement element) {
		element.click();
	}
	public void sub(WebElement element) {
		element.submit();
	}
	public void alertacce() {
		driver.switchTo().alert().accept();
		
	}
	public void alertdis() {
		driver.switchTo().alert().dismiss();
	}
	public static void Selectoperation(String Xpath_pata_1, int a) {
		
		WebElement slectdata = driver.findElement(By.xpath(Xpath_pata_1));
		Select s = new Select(slectdata);
		
		s.selectByIndex(a);
	}
	public void selebyindex(String Xpath_pata_2,String by_value) {
		WebElement slectdata = driver.findElement(By.xpath(Xpath_pata_2));
		Select s = new Select(slectdata);
		
		s.selectByValue(by_value);
	}
	
	public void selebytext(String Xpath_pata_3,String by_text) {
		WebElement slectdata = driver.findElement(By.xpath(Xpath_pata_3));
		Select s = new Select(slectdata);
		
		s.selectByVisibleText(by_text);
	}
	
	public List selebygetoption(String Xpath_pata_4) {
		WebElement slectdata = driver.findElement(By.xpath(Xpath_pata_4));
		Select s = new Select(slectdata);
		
		return s.getOptions();
		
	}
	
	public List selegetSeectedOpeation (String Xpath_pata_5) {
		WebElement slectdata = driver.findElement(By.xpath(Xpath_pata_5));
		Select s = new Select(slectdata);
		return s.getAllSelectedOptions();
	}
	
	public void alertMethodAccept() {
		
		driver.switchTo().alert().accept();
	}
	public void alertMethodDismiss() {
		
		driver.switchTo().alert().dismiss();
	}
	
	public void frameMethod(WebElement ele) {
		
		driver.switchTo().frame(ele);
	}
	
	public void takeScreenshotMethod() throws IOException {
		
		TakesScreenshot t =(TakesScreenshot) driver;
		
		File input = t.getScreenshotAs(OutputType.FILE);
		File to_eclipse = new File("D:\\Selenium workspace\\Selenium\\selenium\\screenshot1.jpeg");
		FileHandler.copy(input, to_eclipse);
		
	}
	
	public void actionContexCli( String path_con) {
		WebElement conclik = driver.findElement(By.xpath(path_con));
		
		Actions a = new Actions(driver);
		a.contextClick(conclik);
	}
	
	public void actionDClick( String path_dcli) {
		WebElement dcli = driver.findElement(By.xpath(path_dcli));
		
		Actions a = new Actions(driver);
		a.doubleClick(dcli);
		
		
	}
	
	public void actionMoveToEle(String path_moveto) {
		WebElement moveto = driver.findElement(By.xpath(path_moveto));
		
		Actions a = new Actions(driver);
		a.moveToElement(moveto);
	}
	
	public void actionDragAndDrop(String path_drag, String path_drop) {
		
		WebElement source = driver.findElement(By.xpath(path_drag));
		WebElement target = driver.findElement(By.xpath(path_drop));
		
		Actions a = new Actions(driver);
		a.dragAndDrop(source, target);
		
	}
	
	public void ActionsKeyDown(String path_downkey) {
		WebElement targ = driver.findElement(By.xpath(path_downkey));
		Actions a = new Actions(driver);
		a.keyDown(targ, Keys.SHIFT.DOWN);
	}
	
	public void robotClassKeyboard() throws AWTException {
		
		Robot r =  new Robot();
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}
	
	public void robotMouse(int x , int y) throws AWTException {
		Robot r =  new Robot();
		r.mouseMove(x, y);
	}
	public void radioAndCheckbox (String raio_chk) {
		WebElement radiocb = driver.findElement(By.xpath(raio_chk));
		
		radiocb.isDisplayed();
		radiocb.isEnabled();
		radiocb.isSelected();
	}
	public void jasExecsetAttr(String input, String path_js_1) {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement setAtt = driver.findElement(By.xpath(path_js_1));
		
		js.executeScript("arguments[0].setAttribute('Value', 'input')", path_js_1);
	}
	public WebElement jsexegetAttr( String path_js_2) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement getAtt = driver.findElement(By.xpath(path_js_2));
		js.executeScript("arguments[0].getAttribute('value','getAtt')", getAtt);
		return getAtt;
	}
	
	public void jsExecli(String path_js_3) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement cli = driver.findElement(By.xpath(path_js_3));
		
		js.executeScript("arguments[0].click()", cli);
	}	
	public void jshigh(String path_js_4, String color) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement high = driver.findElement(By.xpath(path_js_4));
		js.executeScript("arguments[0].setAttribute('Style','background :color'", high);
		
	}
	
	public void jsScrollIntoView(String path_js_5) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement scrollview = driver.findElement(By.xpath(path_js_5));
		js.executeScript("arguments[0].ScrollIntoView(true)", scrollview);
		
	}
	
	public void jsscroll(String path_js_6, int b, int c) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement scrollview = driver.findElement(By.xpath(path_js_6));
		
		js.executeScript("window.scrollBy('b','c')");
	}
	
	public void implicwait(int time) {
		
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
		
	}
	
	public void exewait(Duration sec, String wait_1) {
		WebElement click = driver.findElement(By.xpath(wait_1));
		
		WebDriverWait wait =new WebDriverWait(driver, sec);
		wait.until(ExpectedConditions.elementToBeClickable(click));
	}
	
	
}

