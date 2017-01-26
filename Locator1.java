package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator1 {

	public static void main(String[] args) {
				
		System.setProperty("webdriver.gecko.driver","E:\\Softwares\\geckodriver-v0.13.0-win64\\geckodriver.exe");
		
WebDriver driver= new FirefoxDriver();
		
driver.get("https://www.udemy.com");
driver.findElement(By.xpath(".//*[@id='udemy']/div[2]/div[1]/div[2]/div[2]/form/button")).click();

	}

}
