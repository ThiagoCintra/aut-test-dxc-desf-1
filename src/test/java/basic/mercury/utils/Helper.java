package basic.mercury.utils;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import basic.mercury.setup.Hooks;
import io.cucumber.datatable.DataTable;

public class Helper {

	public static List<Map<String, String>> dataTable;

	public static void aguardar_elemento(int timeout, WebElement elemento) {

		WebDriverWait aguardar = new WebDriverWait(Hooks.getDriver(), timeout);
		aguardar.until(ExpectedConditions.visibilityOf(elemento));
	}

	public static boolean elemento_existe(WebElement elemento, int timeout) {

		try {
			aguardar_elemento(timeout, elemento);

			return true;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public static void create_datatable(DataTable dataTable_) {
		dataTable = dataTable_.asMaps(String.class, String.class);
	}

	public static String set_navigator() {
		if (System.getProperty("os.name").toUpperCase().contains("WINDOWS")) {
			return "src/test/resources/mac/chromedriver.exe";
		} else {
			return "src/test/resources/mac/chromedriver";
		}
	}
}