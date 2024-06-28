package automatizados.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProdutoPO extends BasePO {

	public ProdutoPO(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(id = "cadastro-produto")
	public WebElement modalCriar;
	
	@FindBy(id="btn-adicionar")
	public WebElement botaoCriar;
	
	@FindBy(id="btn-salvar")
	public WebElement botaoSalvar;
	
	@FindBy(css = "html>body.modal-open>div.container>div#cadastro-produto.modal.show>div.modal-dialog>div.modal-content>div.modal-body>div.alert.alert-danger.text-center.alert-dismissible>span")
	public WebElement msgErro;
	
	@FindBy(id="codigo")
	public WebElement codigo;
	
	@FindBy(id="nome")
	public WebElement nome;
	
	@FindBy(id="quantidade")
	public WebElement quantidade;
	
	@FindBy(id="valor")
	public WebElement valor;
	
	@FindBy(id="data")
	public WebElement data;
	
	@FindBy(xpath = "/html/body/div/div[2]/table/tbody/tr[1]/td[1]")
	public WebElement codigoSalvo;
	
	@FindBy(xpath = "/html/body/div/div[2]/table/tbody/tr[1]/td[2]")
	public WebElement nomeSalvo;
	@FindBy(xpath = "/html/body/div/div[2]/table/tbody/tr[1]/td[3]")
	public WebElement quantidadeSalvo;
	@FindBy(xpath = "/html/body/div/div[2]/table/tbody/tr[1]/td[4]")
	public WebElement valorSalvo;
	@FindBy(xpath = "/html/body/div/div[2]/table/tbody/tr[1]/td[5]")
	public WebElement dataSalvo;
	
}
