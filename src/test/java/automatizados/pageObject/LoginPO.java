package automatizados.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPO extends BasePO {

	public LoginPO(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id = "email")
	public WebElement inputEmail;
	
	@FindBy(id="senha")
	public WebElement inputSenha;
	
	@FindBy(id="btn-entrar")
	public WebElement buttonEntrar;
	
	@FindBy(css = "form.form-login>div.alert>span")
	public WebElement spanMensagem;

}
