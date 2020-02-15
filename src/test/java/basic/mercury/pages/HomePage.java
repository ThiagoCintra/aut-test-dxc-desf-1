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

public class HomePage {
	TakeScreenshot screenshot = new TakeScreenshot();
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "fromPort")
	WebElement selectfromPort;

	@FindBy(name = "toPort")
	WebElement selectToPort;

	@FindBy(name = "fromMonth")
	WebElement selecDateOnMonth;

	@FindBy(name = "fromDay")
	WebElement selecDateOnDay;

	@FindBy(name = "toMonth")
	WebElement selecDateReturnM;

	@FindBy(name = "toDay")
	WebElement selecDateReturnD;

	@FindBy(xpath = "//input[contains(@value,'Coach')]")
	WebElement economyClass;

	@FindBy(xpath = "//input[contains(@value,'Business')]")
	WebElement busisnesClass;

	@FindBy(xpath = "//input[contains(@value,'First')]")
	WebElement firstClass;

	@FindBy(name = "passCount")
	WebElement numberPassengers;

	@FindBy(name = "findFlights")
	WebElement btnContinue;

	public void selectDepartingFrom(String value) {
		Helper.elemento_existe(selectfromPort, 10);
		new Select(selectfromPort).selectByValue(value);
	}

	public void selectToPort(String value) {
		Helper.elemento_existe(selectToPort, 10);
		new Select(selectToPort).selectByValue(value);
	}

	public void selecDateOn(String valueM, String valueD) {
		Helper.elemento_existe(selecDateOnMonth, 10);
		new Select(selecDateOnMonth).selectByValue(valueM);
		Helper.elemento_existe(selecDateOnDay, 10);
		new Select(selecDateOnDay).selectByValue(valueD);
	}

	public void selectReturnDate(String valueM, String valueD) {
		Helper.elemento_existe(selecDateReturnM, 10);
		new Select(selecDateReturnM).selectByValue(valueM);
		Helper.elemento_existe(selecDateReturnD, 10);
		new Select(selecDateReturnD).selectByValue(valueD);

	}

	public void serviceClassEconomy() throws IOException {
		Helper.elemento_existe(economyClass, 10);
		economyClass.click();
		screenshot.takeScreenShot("dados preenchidos");
	}

	public void serviceClassBusisne() {
		Helper.elemento_existe(busisnesClass, 10);
		firstClass.click();
	}

	public void serviceClassFisrt() {
		Helper.elemento_existe(firstClass, 10);
		firstClass.click();
	}

	public void numberOfPassengers(String value) throws IOException {
		Helper.elemento_existe(numberPassengers, 10);
		new Select(numberPassengers).selectByValue(value);
		screenshot.takeScreenShot("Dados Iniciais");
	}

	public void clickBtnContinue() {
		Helper.elemento_existe(btnContinue, 10);
		btnContinue.click();
	}
}
