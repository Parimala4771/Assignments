package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browserinvocation {

	//@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","E:\\Softwares\\geckodriver-v0.13.0-win64\\geckodriver.exe");
		//System.setProperty("webdriver.firefox.marionette","E:\\Softwares\\geckodriver-v0.13.0-win64");
WebDriver driver= new FirefoxDriver();
		//WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com/");
//driver.quit();

//WebDriver driver = new ChromeDriver();
	}

}
