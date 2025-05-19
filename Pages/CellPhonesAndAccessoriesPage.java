package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CellPhonesAndAccessoriesPage extends BasePage{

    By cellPhonesAndAccessoriesTitle = By.xpath("//h1[text()='Cell Phones, Smart Watches & Accessories']");

    public boolean isCellPhonesAndAccessoriesTitleDisplayed(){
        return find(cellPhonesAndAccessoriesTitle).isDisplayed();
    }
    By cellphonesAndSmartPhonesLink = By.linkText("Cell Phones & Smartphones");

    public CellPhonesAndAccessoriesPage(WebDriver driver){
        super(driver);
    }

    public void clickCellPhonesAndSmartPhones(){
        click(cellphonesAndSmartPhonesLink);
    }
}
