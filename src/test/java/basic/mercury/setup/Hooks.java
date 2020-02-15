package basic.mercury.setup;

import java.io.IOException;
import java.text.ParseException;
import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.itextpdf.text.DocumentException;

import basic.mercury.utils.Helper;
import basic.mercury.utils.pdf.PdfGenerete;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	public static WebDriver driver;
	public static ResourceBundle bundle = ResourceBundle.getBundle("project");
	
	@Before
	public void startTest(Scenario scenario) {
		
		
		System.setProperty("webdriver.chrome.driver", Helper.set_navigator());
		driver = new ChromeDriver();
		driver.get(bundle.getString("env.url"));	
		driver.manage().window().maximize();
	}
	
	@After
	public void tearDown(Scenario scenario) throws IOException, ParseException { 
		PdfGenerete document = new PdfGenerete();
		try {
			document.createPdf(scenario.getName().replaceAll(" ", "_"));
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		driver.close();
	}
	
	public static WebDriver getDriver() { 
		return driver;
	}

}
