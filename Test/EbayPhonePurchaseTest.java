package tests;

import Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class EbayPhonePurchaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");
    }

    @Test
    public void testEbayPhonePurchase() {
        HomePage home = new HomePage(driver);
        home.clickElectronics();

        ElectronicsPage electronics = new ElectronicsPage(driver);
        Assert.assertTrue(electronics.isElectronicTitleDisplayed(), "Electronic Title not displayed");
        electronics.clickCellPhonesAndAccessories();

        CellPhonesAndAccessoriesPage cellPhonesAndAccessories = new CellPhonesAndAccessoriesPage(driver);
        Assert.assertTrue(cellPhonesAndAccessories.isCellPhonesAndAccessoriesTitleDisplayed(), "Cell Phones & Accessories Title not displayed");
        cellPhonesAndAccessories.clickCellPhonesAndSmartPhones();

        CellPhonesAndSmartPhonesPage cellPhonesAndSmartPhones = new CellPhonesAndSmartPhonesPage(driver);
        Assert.assertTrue(cellPhonesAndSmartPhones.isCellPhonesAndSmartPhonesTitleDisplayed(), "Cell Phones & SmartPhones Title not displayed");
        cellPhonesAndSmartPhones.clickFilter();
        cellPhonesAndSmartPhones.selectScreenSizeFilter();
        cellPhonesAndSmartPhones.selectSixInchesOrMore();
        cellPhonesAndSmartPhones.clickApplyButton();

        ProductItemPage productItem = new ProductItemPage(driver);
        Assert.assertTrue(productItem.isProductTitleDisplayed(), "Product Item Title not Displayed");
        productItem.clickFirstItem();
        productItem.printFirstItemName();
        productItem.printFirstItemPrice();

        //This use to switch for new tab
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }

        productItem.clickAddToCart();

        CartPage cartPage = new CartPage(driver);
        cartPage.printEstimatedTotal();
        cartPage.clickCheckoutButton();
        cartPage.clickGuestButton();

        CheckoutPage checkout = new CheckoutPage(driver);
        checkout.fillShippingInfo(
                "Sanduni", "Punchihewa", "725/5Temple Road", "Kadawatha", "Western", "11850", "sandunisp2020@gmail.com", "0768565801"
        );
        checkout.clickDoneButton();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();


        }
    }
}