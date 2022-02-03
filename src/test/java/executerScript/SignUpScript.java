package executerScript;

import org.testng.annotations.Test;

import genericScript.BaseLib;
import pom_amazon.CreateAccountPOM;
import pom_amazon.HomePage;
//import pom_amazon.SignInPOM;

public class SignUpScript extends BaseLib{
	@Test
	public void createAccountFunc()
	{
		HomePage obj1 = new HomePage(driver);
		CreateAccountPOM obj2 = new CreateAccountPOM(driver);
	//	SignInPOM obj3 = new SignInPOM(driver);
		obj1.clickNew();
		obj2.createAcount();
		//obj3.loginActivity();
	}
}
