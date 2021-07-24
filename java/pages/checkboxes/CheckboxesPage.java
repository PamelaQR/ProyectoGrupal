package pages.checkboxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckboxesPage {
    private WebDriver webDriver;
    private By checkbox1 = By.xpath("//*[@id='checkboxes']/input[1]");
    private By checkbox2 = By.xpath("//*[@id='checkboxes']/input[2]");


    public CheckboxesPage(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    public boolean onClickSelectCheck1() {
        webDriver.findElement(checkbox1).click();
        WebElement element = webDriver.findElement(checkbox1);
        return element.isSelected();
    }

    public boolean onClickUnselectCheck2(){
        webDriver.findElement(checkbox2).click();
        WebElement element = webDriver.findElement(checkbox2);
        return element.isSelected();
    }
}
