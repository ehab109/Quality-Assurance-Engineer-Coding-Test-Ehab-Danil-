package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class LoginPage extends CommonMethods {

@FindBy(id="user-name")
public WebElement usernameTextField;

    @FindBy(id="password")
    public WebElement passwordTextField;

    @FindBy(id="login-button")
    public WebElement loginButton;

@FindBy(xpath = "//h3[@data-test='error']")
public WebElement errorText;

    public LoginPage(){
        //call selenium page factory
        PageFactory.initElements(driver, this);
    }


}
