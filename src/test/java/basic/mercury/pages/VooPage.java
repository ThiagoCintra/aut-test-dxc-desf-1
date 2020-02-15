package basic.mercury.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import basic.mercury.utils.Helper;
import basic.mercury.utils.screenshot.TakeScreenshot;

public class VooPage {
	WebDriver driver;
	TakeScreenshot screenshot = new TakeScreenshot();
	
	public VooPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	WebElement voo;

	@FindBy(name = "reserveFlights")
	WebElement btnContinue;


	public void selectFligth(String value) throws IOException {
		voo = driver.findElement(By.xpath("(//input[contains(@value,'"+value+"')])"));
		Helper.elemento_existe(voo, 10);
		voo.click();
		screenshot.takeScreenShot("voo selecinado " + value);
	}
	
	public void clickBtnContinue() {
		Helper.elemento_existe(btnContinue, 10);
		btnContinue.click();
	}
}
