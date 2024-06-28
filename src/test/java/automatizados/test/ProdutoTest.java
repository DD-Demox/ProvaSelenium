package automatizados.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;

import static org.hamcrest.CoreMatchers.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Keys;

import automatizados.pageObject.LoginPO;
import automatizados.pageObject.ProdutoPO;

public class ProdutoTest extends BaseTest{
	private static ProdutoPO produtoPO;
	
	@Before
	public void prepararTestes() {
		produtoPO = new ProdutoPO(driver);
	}
	
	@Test
	public void testarBotaoCriar() {
		
		produtoPO.botaoCriar.click();
		String resultado = produtoPO.modalCriar.getAttribute("aria-modal");
		assertEquals(resultado, "true");
	}
	
	@Test
	public void testarCriarProdutoComTudoVazio() {
		
		produtoPO.botaoCriar.click();
		produtoPO.botaoCriar.click();
		
		produtoPO.botaoSalvar.click();
		
		String resultado = produtoPO.msgErro.getText();
		assertEquals(resultado, "Todos os campos são obrigatórios para o cadastro!");
	}
	
	@Test
	public void testarCriarProdutoComCampoErrado() {
		
		produtoPO.botaoCriar.click();
		produtoPO.botaoCriar.click();
		
		produtoPO.codigo.sendKeys("1235td");
		produtoPO.nome.sendKeys("1235td");
		produtoPO.valor.sendKeys("1235td");
		produtoPO.quantidade.sendKeys("1235td");
		produtoPO.data.sendKeys("1235td");
		
		produtoPO.botaoSalvar.click();
		
		String resultadoTexto = produtoPO.msgErro.getText();
		assertEquals(resultadoTexto, "Certos campos possuem dados errados");
	}
	
	@Test
	public void testarCriarProduto() {
		
		produtoPO.botaoCriar.click();
		produtoPO.botaoCriar.click();
		produtoPO.codigo.sendKeys("123456");
		produtoPO.nome.sendKeys("Armando");
		produtoPO.valor.sendKeys("22.34");
		produtoPO.quantidade.sendKeys("140");
		produtoPO.data.sendKeys("12041900");
		
		produtoPO.botaoSalvar.click();
		
		assertEquals(produtoPO.codigoSalvo.getText(),"123456");
		assertEquals(produtoPO.nomeSalvo.getText(),"Armando");
		assertEquals(produtoPO.valorSalvo.getText(),"22.34");
		assertEquals(produtoPO.quantidadeSalvo.getText(),"140");
		assertEquals(produtoPO.dataSalvo.getText(),"1900-04-12");
		
	}
	
	
}
