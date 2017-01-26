package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Chromelaunch {

	public static void main(String[] args) {
	
				System.setProperty("webdriver.gecko.driver","E:\\Softwares\\geckodriver-v0.13.0-win64\\geckodriver.exe");
				System.setProperty("webdriver.chrome.driver","E:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		
	WebDriver driver= new ChromeDriver();
			
	driver.get("https://www.google.com/");
	//driver.quit();

	}

}
