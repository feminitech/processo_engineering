package engineering;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class processoSeletivoPage {

	WebDriver driver;

	public processoSeletivoPage(WebDriver driver) {
		this.driver = driver;
	}

	public processoSeletivoPage Passo1() {
		String tituloGoogle = driver.getTitle();
		System.out.println("Passo 1: " + tituloGoogle);
		return this;
	}

	public processoSeletivoPage Passo2(String pesquisa) {
		WebElement barraDePesquisa = driver.findElement(By.name("q"));
		barraDePesquisa.sendKeys("Engineering Brasil");
		barraDePesquisa.sendKeys(Keys.ENTER);

		String tituloPesquisa = driver.getTitle();
		System.out.println("Passo 2: " + tituloPesquisa);
		return this;
	}

	public processoSeletivoPage Passo3() {
		WebElement homePageEngineering = driver.findElement(
				By.xpath("//*[@id=\"rhs\"]/div/div[1]/div/div[1]/div/div[1]/div[3]/div[1]/div/div[2]/div[2]/div[1]/a"));
		homePageEngineering.click();

		String tituloHomePageEngineering = driver.getTitle();
		boolean tituloEstaCorreto = tituloHomePageEngineering.equals("Homepage - Engineering");
		Assert.assertTrue(tituloEstaCorreto);
		System.out.println("Passo 3: " + tituloHomePageEngineering);
		return this;
	}

}
