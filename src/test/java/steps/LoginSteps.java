package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.CommonMethods;
import utils.ConfigReader;

public class LoginSteps extends CommonMethods {
    // WebDriver driver;

   // @Given("I am on the Sauce Demo Login Page")
    //public void i_am_on_the_sauce_demo_login_page() {
    //    openBrowserAndLaunchApplication();
   // }
    @When("I fill the account information for account StandardUser into the Username field and the Password field")
    public void i_fill_the_account_information_for_account_standard_user_into_the_username_field_and_the_password_field() {
        sendText(login.usernameTextField, ConfigReader.getPropertyValue("username"));
        sendText(login.passwordTextField, ConfigReader.getPropertyValue("password"));
    }
    @When("I click the Login Button")
    public void i_click_the_login_button() {
      click(login.loginButton);
    }

    @Then("I am redirected to the Sauce Demo Main Page and I verify the App Logo exists")
    public void i_am_redirected_to_the_sauce_demo_main_page_and_i_verify_the_app_logo_exists() {
     String expectedLogo = "Swag Labs";
     String actualLogo = driver.getTitle();

     Assert.assertEquals(actualLogo,expectedLogo);

    }

    @When("I fill the account information for account LockedOutUser into the Username field {string} and {string} and verify the Error Message contains the text {string}")
    public void i_fill_the_account_information_for_account_locked_out_user_into_the_username_field_and_and_verify_the_error_message_contains_the_text(String userName2, String passWord2, String errorMessage) {
        sendText(login.usernameTextField, userName2);
        sendText(login.passwordTextField, passWord2);
        click(login.loginButton);

       String actualErrorMessage =login.errorText.getText();
       Assert.assertEquals(errorMessage,actualErrorMessage);
    }

}
