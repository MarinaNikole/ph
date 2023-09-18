import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "defaultRegisterFormEmail")
     WebElement emailInputField ;

    @FindBy( css = "input[formcontrolname='password']")
     WebElement passwordInputField;

    @FindBy(css = "button[type='submit']")
    WebElement loginButton;

    public void login(String expectedEmail, String expectedPassword){
        emailInputField.sendKeys(expectedEmail);
        passwordInputField.sendKeys(expectedPassword);
        loginButton.click();
    }


}