package basic.mercury.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import basic.mercury.utils.Helper;
import basic.mercury.utils.screenshot.TakeScreenshot;

public class BookPage {

	public BookPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "passFirst0")
	WebElement fistName;

	@FindBy(name = "passLast0")
	WebElement lastName;

	@FindBy(name = "creditnumber")
	WebElement creditnumber;

	@FindBy(name = "buyFlights")
	WebElement btnBuyFlights;

	public void sendKeyFistName(String value) {
		Helper.elemento_existe(fistName, 10);
		fistName.sendKeys(value);
	}

	public void sendKeyLastName(String value) {
		Helper.elemento_existe(lastName, 10);
		lastName.sendKeys(value);
	}

	public void sendKeyNumberCard(String value) {
		Helper.elemento_existe(creditnumber, 10);
		creditnumber.sendKeys(value);
	}

	public void clickBtnContinue() {
		Helper.elemento_existe(btnBuyFlights, 10);
		btnBuyFlights.click();
	}
}
