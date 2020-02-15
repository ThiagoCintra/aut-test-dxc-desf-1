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

public class ConfirmationPage {
	TakeScreenshot screenshot = new TakeScreenshot();
	
	public ConfirmationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//font[contains(text(),'itinerary has been booked!')]")
	WebElement textConfirmation;

	public String validTextPage() throws IOException {
		Helper.elemento_existe(textConfirmation, 10);
		screenshot.takeScreenShot("Validando Page");
		return textConfirmation.getText();
	}

}
