package com.baseclass;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonActions {
	public static WebDriver driver;
	public void launch(String url) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		driver.get(url);
	}
	public void insertText(WebElement ele,String S) {
		ele.sendKeys(S);	
	}
	public void screenShot(String name) throws Throwable {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("C:\\Users\\HEMU\\eclipse-workspace2\\JUNITTASK\\Screenshot\\"+ name +".png");
		FileUtils.copyFile(source, target);
	}
	public void dropDown(WebElement ele,String value) {
		Select S = new Select(ele);
		S.selectByValue(value);
	}
	

}
