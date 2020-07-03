package engineering;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class processoSeletivo {

	private static processoSeletivoPage pageObjects;
	private static WebDriver driver;

	@Before
	public void preCondicao() {
		System.setProperty("webdriver.chrome.driver", "/home/nayara/selenium_drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://www.google.com.br");
		driver.manage().window().maximize();
		pageObjects = new processoSeletivoPage(driver);

	}

	@Test
	public void teste() {
		pageObjects.Passo1();
		pageObjects.Passo2("Engineering Brasil");
		pageObjects.Passo3();

	}

	@After
	public void posCondicao() {
		driver.quit();

	}

}
