package HTestFile;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import UtilityPackage.Listner;

public class HTC_LaunchQuit extends Listner {

	@BeforeMethod()
	public void Launch() {

		driver = new ChromeDriver();
		driver.get("https://katalon-demo-cura.herokuapp.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		driver.manage().window().maximize();

	}

	@BeforeMethod()
	public void Quit() {
		// driver.quit();
	}

}
