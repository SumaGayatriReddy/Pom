package pom_amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPOM {
@FindBy (id = "ap_email")
private WebElement eMailTxtBox;
@FindBy (xpath = "//span[@id='continue']/span/input")
private WebElement submitBtn;
@FindBy (id = "createAccountSubmit")
private WebElement createAcntBtn;
public SignInPOM(WebDriver  driver)
{
	PageFactory.initElements(driver, this);
}

public void loginActivity()
{
	eMailTxtBox.sendKeys("abc_xyz@hotmail");	
	submitBtn.click();
}
public void createAccount()
{	
	createAcntBtn.click();
}

}
