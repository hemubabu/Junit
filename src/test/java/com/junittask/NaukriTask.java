package com.junittask;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.baseclass.CommonActions;

public class NaukriTask extends CommonActions{
	static long startTime;
	static CommonActions C = new CommonActions();
	@BeforeClass
	public static void launch() {
		C.launch("https://www.naukri.com/");
	}
	@Before
	public void beforeTest() {
		System.out.println("Start Time");
		startTime = System.currentTimeMillis();
		System.out.println(startTime);
	}
	@Test
	public void test1() {
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		
	}
	
	@Test
	public void test2() {
		WebElement name = driver.findElement(By.id("name"));
		C.insertText(name,"HemanthBabu");
	}
	
	@Test
	public void test3() {
		WebElement email = driver.findElement(By.id("email"));
		C.insertText(email,"hemanthfafu1998@gmail.com");
	}
	
	@Test
	public void test4() {
		WebElement password = driver.findElement(By.id("password"));
		C.insertText(password,"Hemu@3123*");
	}
	
	@Test
	public void test5() {
		WebElement mobile = driver.findElement(By.id("mobile"));
		C.insertText(mobile,"8072861025");
	}
	
	@Test
	public void test6() {
		WebElement experience = driver.findElement(By.xpath("//div[@class='iconWrap']/following-sibling::div"));
		experience.click();
	}
	
	@Test
	public void test7() throws Throwable {
		C.screenShot("naukri");
	}
	@After
	public void afterTest() {
		System.out.println("End Time");
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);
	}
	
	@AfterClass
	public static void quitBrowser() throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}

}
