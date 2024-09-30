package HTestFile;

import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import HSourceFile.Health_LoginPage;
import HSourceFile.Health_RegistrationPage;

@Listeners(UtilityPackage.Listner.class)
public class HTC02_RegistrationPage extends HTC_LaunchQuit {

	@Test
	public void Registration() throws InterruptedException {

		Health_LoginPage a1 = new Health_LoginPage(driver);

		a1.makeAppointment();
		a1.UserName("John Doe");
		a1.Password("ThisIsNotAPassword");
		a1.Signid();

		Health_RegistrationPage a2 = new Health_RegistrationPage(driver);

		Thread.sleep(3000);
		a2.Facility();
		Thread.sleep(3000);
		a2.SFacility();

		boolean checkbox = a2.CheckBox().isEnabled();
		Assert.assertTrue("Checkbox is not enabled", checkbox);
		a2.CheckBox().click();

		boolean HealthProgram = a2.CheckBox().isEnabled();
		Assert.assertTrue("Checkbox is not enabled", HealthProgram);
		a2.HealthProgram().click();

		a2.Calender();
		Thread.sleep(2000);
		a2.Next();
		Thread.sleep(2000);
		a2.DateSelect();
		Thread.sleep(2000);
		a2.Commet("Hi sir i need an appointment");
		Thread.sleep(2000);
		a2.BookAppointment();

	}

}
