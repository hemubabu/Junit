package com.junittask;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.baseclass.CommonActions;


public class FacebookTask extends CommonActions {
	
	static CommonActions C = new CommonActions();
	static long startTime;
	@BeforeClass
	public static void launch() {
	C.launch("https://www.facebook.com/");
	}
	@Before
	public void beforeTest() {
		System.out.println("Start Time");
		startTime = System.currentTimeMillis();
		System.out.println(startTime);
	}
	@Test
	public void test1() throws Throwable {
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	Thread.sleep(3000);
	}
	@Test
	public void test2() {
	WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
	C.insertText(firstname, "Hemanth");
	}
	
	@Test
	public void test3() {
	WebElement lastname = driver.findElement(By.name("lastname"));
	C.insertText(lastname, "Babu");
	}
	
	@Test
	public void test4() {
	WebElement number=driver.findElement(By.name("reg_email__"));
	C.insertText(number, "8072861025");
	}
	
	@Test
	public void test5() {
	WebElement password = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
	C.insertText(password, "Hemu3123*");
	}
	
	@Test
	public void test6() {
	WebElement date = driver.findElement(By.xpath("//select[@name='birthday_day']"));
	C.dropDown(date,"13");
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	C.dropDown(month,"10");
	WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
	C.dropDown(year,"1998");
	}
	
	@Test
	public void test7() {
	WebElement gender = driver.findElement(By.xpath("//span[@data-type='radio']/span/following-sibling::span/label"));
	gender.click();
	}
	
	@Test
	public void test8() throws Throwable {
		C.screenShot("Facebook");
		
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
