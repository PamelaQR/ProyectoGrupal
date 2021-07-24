package pages.formauthentication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver webDriver;
    private By userInput = By.id("username");
    private By passwordInput = By.id("password");
    private By loginButton = By.xpath("//*[@id='login']/button/i");

    public LoginPage(WebDriver webDriver){
        this.webDriver = webDriver;
    }
    public SecurePage clickOnLoginButton(String user, String password){
        webDriver.findElement(userInput).sendKeys(user);
        webDriver.findElement(passwordInput).sendKeys(password);
        webDriver.findElement(loginButton).click();
        return new SecurePage(webDriver);
    }

}
