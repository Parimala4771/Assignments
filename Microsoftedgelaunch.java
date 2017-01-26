package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Microsoftedgelaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","E:\\Softwares\\MicrosoftWebDriver.exe");
		System.setProperty("webdriver.gecko.driver", "E:\\Softwares\\geckodriver-v0.13.0-win64\\geckodriver.exe");
		
WebDriver driver=new EdgeDriver();
driver.get("http:\\www.saibersys.com");
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
driver.close();
	}

}
