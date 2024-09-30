package HTestFile;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import HSourceFile.Health_LoginPage;

@Listeners(UtilityPackage.Listner.class)
public class HTC01_Loginpage extends HTC_LaunchQuit{

	@Test 
	public void login() 
	{
		Health_LoginPage a1 = new Health_LoginPage(driver);
		
		a1.makeAppointment();
		
		a1.UserName("John Doe");
		
		a1.Password("ThisIsNotAPassword");
		
		a1.Signid();
	}

}
