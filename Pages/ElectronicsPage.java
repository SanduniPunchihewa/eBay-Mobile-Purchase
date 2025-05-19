package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElectronicsPage extends BasePage{

    By electronicsTitle = By.xpath("//h1[text()='Electronics']");

    public boolean isElectronicTitleDisplayed(){
        return find(electronicsTitle).isDisplayed();
    }

    By cellPhonesAndAccessorsLink = By.linkText("Cell Phones & Accessories");
    public ElectronicsPage(WebDriver driver){
        super(driver);
    }

    public void clickCellPhonesAndAccessories(){
        click(cellPhonesAndAccessorsLink);
    }
}
