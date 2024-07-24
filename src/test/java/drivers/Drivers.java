package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Drivers {

	public static WebDriver driver;
	
	public static WebDriver getDriver() {
		return driver;
	}

	
	public static void abrirNavegador(boolean headless) {

		String ambiente = "https://buger-eats.vercel.app/deliver";

		ChromeOptions chromeOptions = new ChromeOptions();
		if (!headless) {
			chromeOptions.addArguments("--headless");
			chromeOptions.addArguments("--no-sandbox");
		}
		chromeOptions.addArguments("--start-maximized");
		driver = new ChromeDriver(chromeOptions);
		driver.get(ambiente);
		driver.manage().window().maximize();

	}

}
