package automatizados.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseTest {
	protected static WebDriver driver;
//	private static final String URL_BASE = "https://www.google.com";
	private static final String URL_BASE = "file:///C:/htmlTeste/sistema/produtos.html";
	private static final String PATH_DRIVE = "src/test/resources/chromedriver.exe";
	
	@Before
	public  void iniciar() {
		System.setProperty("webdriver.chrome.driver", PATH_DRIVE);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL_BASE);
	}
	
	@After
	public void finalizar() {
		driver.quit();
	}

}
