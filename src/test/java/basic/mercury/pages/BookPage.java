package basic.mercury.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import basic.mercury.utils.Helper;
import basic.mercury.utils.screenshot.TakeScreenshot;

public class BookPage {
	TakeScreenshot screenshot = new TakeScreenshot();

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

	public void sendKeyFistName(String value) throws IOException {
		Helper.elemento_existe(fistName, 10);
		fistName.sendKeys(value);
		screenshot.takeScreenShot("Primeiro nome Preenchido");
	}

	public void sendKeyLastName(String value) throws IOException {
		Helper.elemento_existe(lastName, 10);
		lastName.sendKeys(value);
		screenshot.takeScreenShot("Sengundo nome preenchido");
	}

	public void sendKeyNumberCard(String value) throws IOException {
		Helper.elemento_existe(creditnumber, 10);
		creditnumber.sendKeys(value);
		screenshot.takeScreenShot("Numero do cartao preenchido");
	}

	public void clickBtnContinue() {
		Helper.elemento_existe(btnBuyFlights, 10);
		btnBuyFlights.click();
	}
}
