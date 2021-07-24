package pages.addremoveelements;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddRemovePage {
    private WebDriver webDriver;
    private By addElementButton = By.xpath("//*[@id='content']/div/button");
    private By deleteButton = By.xpath("//*[@id='elements']/button");


    public AddRemovePage(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    public boolean onClickAddElementButton() {
        webDriver.findElement(addElementButton).click();
        WebElement element = webDriver.findElement(deleteButton);
        return element.isDisplayed();
    }

    public boolean onClickRemoveElementButton() {
        webDriver.findElement(addElementButton).click();
        webDriver.findElement(deleteButton).click();
        try{
            webDriver.findElement(deleteButton);
            return true;
        }
        catch(NoSuchElementException e){
            return false;
        }
    }
}
