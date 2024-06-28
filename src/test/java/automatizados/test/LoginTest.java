package automatizados.test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Keys;

import automatizados.pageObject.LoginPO;

public class LoginTest extends BaseTest{
	private static LoginPO loginPO;
	
	@BeforeClass
	public static void prepararTestes() {
		loginPO = new LoginPO(driver);
	}
	
	@Test
	public void naoDeveLogarNoSistemaNoEmailESenhaVazio() {
		loginPO.inputEmail.sendKeys("");
		loginPO.inputSenha.sendKeys("");
		loginPO.buttonEntrar.click();
		String resultado = loginPO.spanMensagem.getText();
		assertEquals(resultado, "Informe usuário e senha, os campos não podem ser brancos.");
	}
}
