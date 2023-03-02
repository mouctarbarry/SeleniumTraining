package commun;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class General {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\dev\\browserDrivers\\chromedriver.exe"); 
		
		WebDriverManager.chromedriver().setup(); // pour charger le chromDriver

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}

}
