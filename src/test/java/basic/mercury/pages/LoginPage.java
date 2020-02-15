package basic.mercury.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import basic.mercury.utils.Helper;

public class LoginPage {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "userName")
	private WebElement userName;

	@FindBy(name = "password")
	private WebElement password;

	@FindBy(name = "login")
	private WebElement btnLogin;

	public void sendUserName(String txt) {
		Helper.elemento_existe(userName, 10);
		userName.sendKeys(txt);
	}

	public void sendUserPassword(String txt) {
		Helper.elemento_existe(password, 10);
		password.sendKeys(txt);
	}

	public void clickBtnLogin() {
		Helper.elemento_existe(btnLogin, 10);
		btnLogin.click();
	}
}
