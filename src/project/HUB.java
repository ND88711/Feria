package project;

import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HUB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

						
				DesiredCapabilities dc = new DesiredCapabilities();
				dc.setBrowserName("firefox");
				dc.setPlatform(Platform.WINDOWS);
				
				RemoteWebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.108:4444/wd/hub"),dc);
				
				//driver.get("https://www.facebook.com/");
				driver.get("https://www.google.co.in/?gfe_rd=cr&ei=s0WZWfC_MPLx8Aet-Y
				
				
				
				

			}

		

	}

}
