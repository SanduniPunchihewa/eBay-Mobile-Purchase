package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage{
     By cartItemName = By.cssSelector("span.BOQZ0.BOQZ0--large");
     By cartItemPrice = By.xpath("//div[@class='grid-item-price']");
     By checkoutButton=By.xpath("//button[@class='btn btn--primary btn--large']");
     By guestButton=By.xpath("//*[@id='gxo-btn']");

     public CartPage(WebDriver driver){
         super(driver);
     }

     public String getCartItemName(){
          return find(cartItemName).getText();
     }

     public String getCartItemPrice(){
          return find(cartItemPrice).getText();
     }

     public void printEstimatedTotal(){
          String total = getCartItemPrice();
          System.out.println("Estimated Total: "+total);
     }

     public void clickCheckoutButton(){
          click(checkoutButton);
     }

     public void clickGuestButton(){
          click(guestButton);
     }
}
