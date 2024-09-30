package HSourceFile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Health_LoginPage {

	@FindBy(xpath = "(//a[@class='btn btn-dark btn-lg'])[1]")
	WebElement makeAppointment;

	@FindBy(xpath = "//input[@id='txt-username']")
	WebElement UserName;

	@FindBy(xpath = "//input[@name='password']")
	WebElement Password;

	@FindBy(xpath = "//button[@id='btn-login']")
	WebElement Signid;

	public void makeAppointment() {
		makeAppointment.click();
	}

	public void UserName(String Name) {
		UserName.sendKeys(Name);
	}

	public void Password(String pswd) {
		Password.sendKeys(pswd);
	}

	public void Signid() {
		Signid.click();
	}

	public Health_LoginPage(ChromeDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
