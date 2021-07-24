package pages.checkboxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private WebDriver webDriver;
    private By checkboxLink = By.linkText("Checkboxes");

    public HomePage(WebDriver webDriver){
        this.webDriver = webDriver;
    }
    public CheckboxesPage clickOnChecksOptions(){
        WebElement element = webDriver.findElement(checkboxLink);
        element.click();
        return new CheckboxesPage(webDriver);
    }


}
