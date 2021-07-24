package pages.formauthentication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SecurePage {
    private WebDriver webDriver;
    private By validationText = By.xpath("//*[@id='content']/div/h4");
    private By logoutButton = By.xpath("//*[@id='content']/div/a/i");

    public SecurePage(WebDriver webDriver){
        this.webDriver = webDriver;
    }
    public boolean isMessageDisplayed(){
        WebElement element = webDriver.findElement(validationText);
        return element.isDisplayed();
    }
    public String getLoadedText(){
        WebElement element = webDriver.findElement(validationText);
        return element.getText();
    }
}
