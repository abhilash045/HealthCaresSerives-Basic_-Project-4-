package HSourceFile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Health_RegistrationPage {

	@FindBy(xpath = "//select[@id='combo_facility']")
	WebElement Facility;

	@FindBy(xpath = "((//select[@id='combo_facility'])/option)[2]")
	WebElement SFacility;

	@FindBy(xpath = "//input[@id='chk_hospotal_readmission']")
	WebElement CheckBox;

	@FindBy(xpath = "((//div[@class='col-sm-4'])[2]//label)[2]")
	WebElement HealthProgram;

	@FindBy(xpath = "//div[@class='input-group-addon']")
	WebElement Calender;

	@FindBy(xpath = "(((//table[@class='table-condensed']//thead)//tr)[2]//th)[3]")
	WebElement Next;

	@FindBy(xpath = "(//div[@class='datepicker-days']//td)[12]")
	WebElement DateSelect;

	@FindBy(xpath = "//textarea[@class='form-control']")
	WebElement Commet;
	
	@FindBy(xpath = "//button[@id='btn-book-appointment']")
	WebElement BookAppointment;

	public void Facility() {
		Facility.click();
	}

	public void SFacility() {
		Facility.click();
	}

	public WebElement CheckBox() {
		return CheckBox;
	}

	public WebElement HealthProgram() {
		return HealthProgram;
	}

	public void Calender() {
		Calender.click();
	}

	public void Next() {
		Next.click();
	}

	public void DateSelect() {
		DateSelect.click();
	}

	public void Commet(String Message) {
		Commet.sendKeys(Message);
	}
	
	public void BookAppointment()
	{
		BookAppointment.click();	}

	public Health_RegistrationPage(ChromeDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
