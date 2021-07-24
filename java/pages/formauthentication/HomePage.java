package pages.formauthentication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver webDriver;
    private By formAuthenticationLink = By.linkText("Form Authentication");

    public HomePage(WebDriver webDriver){
        this.webDriver = webDriver;
    }
    public LoginPage clickOnFormAuthenticationLink(){
        WebElement element = webDriver.findElement(formAuthenticationLink);
        element.click();
        return new LoginPage(webDriver);
    }

}
