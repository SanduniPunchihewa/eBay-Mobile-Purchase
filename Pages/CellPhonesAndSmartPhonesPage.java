package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CellPhonesAndSmartPhonesPage extends BasePage{

    By cellPhonesAnsSmartPhonesTitle = By.xpath("//h1[text()='Cell Phones & Smartphones']");

    public boolean isCellPhonesAndSmartPhonesTitleDisplayed(){
        return find(cellPhonesAnsSmartPhonesTitle).isDisplayed();
    }

    By filter = By.xpath("//button[.//span[text()='Filter']]");
    By screenSizeFilter = By.xpath("//h3[text()='Screen Size']");
    By sixInchesOrMoreCheckBox = By.xpath("//input[@id='group-checkbox-6 in or More']");

    By applyButton = By.xpath("//button[@class='btn-submit btn btn--primary']");



    public CellPhonesAndSmartPhonesPage(WebDriver driver){
        super(driver);
    }

    public void clickFilter(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        click(filter);
    }

    public void selectScreenSizeFilter(){
        click(screenSizeFilter);
    }
    public void selectSixInchesOrMore(){
        click(sixInchesOrMoreCheckBox);
    }
    public void clickApplyButton(){
        click(applyButton);
    }

}
