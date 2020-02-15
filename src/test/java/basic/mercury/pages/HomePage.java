package basic.mercury.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import basic.mercury.utils.Helper;
import basic.mercury.utils.screenshot.TakeScreenshot;

public class HomePage {

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "fromPort")
	WebElement select;
	Select s = new Select(select);
	
	public void selectDepartingFrom(String value) {
		Helper.elemento_existe(select, 10);
		s.selectByValue(value);
	}
}
