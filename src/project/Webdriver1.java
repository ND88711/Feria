package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webdriver1 {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.in");
		
	}

}
