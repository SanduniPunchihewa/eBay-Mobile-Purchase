package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductItemPage extends BasePage{

    By productItemTitle = By.xpath("//h1[text()='6 Inch or More Cell Phones & Smartphones']");
    By firstItem = By.xpath("(//ul[contains(@class, 'carousel__list')]/li)[1]");
    By firstItemName = By.xpath("//div[@class='vim x-item-title']//span[contains(@class, 'ux-textspans--BOLD')]");
    By firstItemPrice = By.xpath("//div[@class='x-price-primary']//span[@class='ux-textspans']");
    By addToCartButton = By.xpath("//a[@id='atcBtn_btn_1' and contains(@class, 'ux-call-to-action')]");

    public ProductItemPage(WebDriver driver){
        super(driver);
    }

    public boolean isProductTitleDisplayed(){
        return find(productItemTitle).isDisplayed();
    }

    public void clickFirstItem(){
        click(firstItem);
    }

    public String getFirstItemName(){
        return find(firstItemName).getText();
    }

    public String getFirstItemPrice(){
        return find(firstItemPrice).getText();
    }

    public void printFirstItemName(){
        String itemName = getFirstItemName();
        System.out.println("Item Name: "+itemName);
    }

    public void printFirstItemPrice(){
        String itemPrice = getFirstItemPrice();
        System.out.println("Item Price: "+itemPrice);
    }

    public void clickAddToCart(){
        click(addToCartButton);

    }
}
