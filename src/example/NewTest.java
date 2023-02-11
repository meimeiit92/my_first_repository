package example;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		driver.get("https://codestar.vn/");
	}

	@Test
	public void TC01_CheckEnvironment() {
		String title = driver.getTitle();
		
		System.out.println("Title is " + title);
		Assert.assertEquals("Trang chủ | Học viện đào tạo CodeStar | CodeStar Academy", title);

	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
