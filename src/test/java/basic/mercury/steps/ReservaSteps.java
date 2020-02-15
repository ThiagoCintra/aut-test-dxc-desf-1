package basic.mercury.steps;

import java.io.IOException;

import basic.mercury.pages.LoginPage;
import basic.mercury.setup.Hooks;
import basic.mercury.utils.screenshot.TakeScreenshot;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class ReservaSteps {
	TakeScreenshot screenshot = new TakeScreenshot();
	private LoginPage loginPage = new LoginPage(Hooks.getDriver());

	@Dado("que eu acesse a aplicação mercury")
	public void que_eu_acesse_a_url_do_sistema() throws IOException {
		loginPage.sendUserName("mercury");
		loginPage.sendUserPassword("mercury");
		screenshot.takeScreenShot("Inserindo Usuario e Senha");
	}


	@Quando("relizar reserva")
	public void clicar_no_botão_entrar_sem_preencher_os_dados() throws IOException {
		
	}

	@Então("devo ter realizado reserva de um ticket")
	public void devo_visualizar_a_mensagem_login_e_senha_obrigatório() throws IOException, InterruptedException {
		
		

	}

	
}
