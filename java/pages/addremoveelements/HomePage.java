package pages.addremoveelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private WebDriver webDriver;
    private By addRemoveElementsLink = By.linkText("Add/Remove Elements");

    public HomePage(WebDriver webDriver){
        this.webDriver = webDriver;
    }
    
    public AddRemovePage clickOnAddRemoveElementLink(){
        WebElement element = webDriver.findElement(addRemoveElementsLink);
        element.click();
        return new AddRemovePage(webDriver);
    }


}
