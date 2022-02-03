package pom_amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPOM {
@FindBy(id="ap_customer_name")
private WebElement fullNameTxtBox;
@FindBy(id="ap_email")
private WebElement emailIdTxtBox;
@FindBy(id="ap_password")
private WebElement password;
@FindBy(id="ap_password_check")
private WebElement passwordCheck;
@FindBy(id="continue")
private WebElement submit;

public CreateAccountPOM(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void createAcount()
{
	fullNameTxtBox.sendKeys("AbdXz");
	emailIdTxtBox.sendKeys("abc_xy123@hotmail");
	password.sendKeys("123456abc");
	passwordCheck.sendKeys("56789xyz");
	submit.click();
}
}
