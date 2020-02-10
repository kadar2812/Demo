package org.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
	public static void loadDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abdul\\OneDrive\\Desktop\\Demo\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	}
public static void getUrl(String url) {
	driver.get(url);

}
}
