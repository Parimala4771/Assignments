package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","E:\\Softwares\\geckodriver-v0.13.0-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("parimala.nijalapuram@gmail.com");
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("dabang");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();

	}

}
