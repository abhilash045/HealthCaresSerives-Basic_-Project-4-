package UtilityPackage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listner implements ITestListener {

	public static ChromeDriver driver;

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);

		TakesScreenshot s1 = (TakesScreenshot) driver;

		File source = s1.getScreenshotAs(OutputType.FILE);

		File destination = new File(
				"C:\\Users\\USER\\OneDrive\\Desktop\\screenshot\\Passed\\" + Math.random() + ".png");

		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Reporter.log("Test Case is Passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);

		TakesScreenshot s1 = (TakesScreenshot) driver;

		File source = s1.getScreenshotAs(OutputType.FILE);

		File destination = new File(
				"C:\\Users\\USER\\OneDrive\\Desktop\\screenshot\\Failed\\" + Math.random() + ".png");

		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Reporter.log("Test Case Failed");
	}

}
