package basic.mercury.steps;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Assert;

import basic.mercury.pages.BookPage;
import basic.mercury.pages.ConfirmationPage;
import basic.mercury.pages.HomePage;
import basic.mercury.pages.LoginPage;
import basic.mercury.pages.VooPage;
import basic.mercury.setup.Hooks;
import basic.mercury.utils.screenshot.TakeScreenshot;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class ReservaSteps {
	TakeScreenshot screenshot = new TakeScreenshot();

	private LoginPage loginPage = new LoginPage(Hooks.getDriver());
	private HomePage homePage = new HomePage(Hooks.getDriver());
	private VooPage vooPage = new VooPage(Hooks.getDriver());
	private BookPage bookPage = new BookPage(Hooks.getDriver());
	private ConfirmationPage confirmationPage = new ConfirmationPage(Hooks.getDriver());
	
	@Dado("que eu acesse a aplicação mercury")
	public void que_eu_acesse_a_url_do_sistema() throws IOException {
		loginPage.sendUserName("mercury");
		loginPage.sendUserPassword("mercury");
		screenshot.takeScreenShot("Inserindo Usuario e Senha");
		loginPage.clickBtnLogin();
	}

	@Quando("relizar reserva")
	public void clicar_no_botão_entrar_sem_preencher_os_dados() throws IOException {
		homePage.numberOfPassengers("1");
		homePage.selectDepartingFrom("London");
		homePage.selecDateOn("5", "15");
		homePage.selectToPort("Zurich");
		homePage.selectReturnDate("8", "8");
		homePage.serviceClassEconomy();
		homePage.clickBtnContinue();
		vooPage.selectFligth("Blue Skies Airlines$361$271$7:10");
		bookPage.sendKeyFistName("Test");
		bookPage.sendKeyLastName("teste");
		bookPage.sendKeyNumberCard("6666666666666666");
		bookPage.clickBtnContinue();
	}

	@Então("devo ter realizado reserva de um ticket")
	public void devo_visualizar_a_mensagem_login_e_senha_obrigatório() throws IOException, InterruptedException {
		assertEquals(confirmationPage.validTextPage(), "Your itinerary has been booked!");
		screenshot.takeScreenShot("Validando Page");
	}

}
