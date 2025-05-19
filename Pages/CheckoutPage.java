package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends BasePage {

     By firstNameField = By.id("firstName");
     By lastNameField = By.id("lastName");
     By addressField = By.id("addressLine1");
     By cityField = By.id("city");
     By provinceField = By.id("stateOrProvince");
     By zipCodeField = By.id("postalCode");
     By emailField = By.id("email");
     By confirmEmailField = By.id("emailConfirm");
     By phoneNumberField = By.id("phoneNumber");
     By doneButton = By.xpath("//button[@class='btn btn--primary']");

     public CheckoutPage(WebDriver driver){
         super(driver);
     }

     public void fillShippingInfo(String firstName,String lastName, String address, String city, String province, String zip, String email, String phone){
         find(firstNameField).sendKeys(firstName);
         find(lastNameField).sendKeys(lastName);
         find(addressField).sendKeys(address);
         find(cityField).sendKeys(city);
         find(provinceField).sendKeys(province);
         find(zipCodeField).sendKeys(zip);
         find(emailField).sendKeys(email);
         find(confirmEmailField).sendKeys(email);
         find(phoneNumberField).sendKeys(phone);
     }

     public void clickDoneButton(){
         click(doneButton);
     }


}
