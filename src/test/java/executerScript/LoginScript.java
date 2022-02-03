package executerScript;

import org.testng.annotations.Test;

import genericScript.BaseLib;
import pom_amazon.HomePage;
import pom_amazon.SignInPOM;

public class LoginScript extends BaseLib{
@Test
public void loginFunc()
{
HomePage obj1 = new HomePage(driver);
SignInPOM obj2 = new SignInPOM(driver);
obj1.clickSignIn();
obj2.loginActivity();
//obj2.createAccount();

}
}
