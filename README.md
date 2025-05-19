# eBay-Mobile-Purchase





```markdown
# eBay-Mobile-Purchase 🛒📱

This is a Selenium TestNG automation project that simulates purchasing a mobile phone on the [eBay](https://www.ebay.com/) website without logging in. The test covers search, selection, and cart interaction steps using the Page Object Model (POM) design pattern.

## 📁 Project Structure

```

eBay-Mobile-Purchase/
│
├── Pages/          # Contains Page Object Model (POM) classes
│   ├── HomePage.java
│   ├── SearchResultsPage.java
│   └── ProductPage.java
│
├── Test/           # Contains TestNG test classes
│   └── MobilePurchaseTest.java
│
├── pom.xml         # Maven project file
├── testng.xml      # TestNG configuration file
└── README.md       # Project documentation

````

## 🛠 Technologies Used

- Java
- Selenium WebDriver
- TestNG
- Maven
- IntelliJ IDEA

## ✅ Features Covered

- Open eBay homepage
- Search for a mobile phone
- Filter/search results (optional enhancement)
- Select a product from results
- Interact with the product page (e.g., "Add to Cart")
- Validate that the item is added to the cart

## 🚀 Getting Started

1. Clone the repository:
   ```bash
   git clone https://github.com/<your-username>/eBay-Mobile-Purchase.git
````

2. Open the project in IntelliJ.

3. Install Maven dependencies:

   ```bash
   mvn clean install
   ```

4. Run tests via TestNG:

   * Right-click on `testng.xml` and select **Run**.

## 🔄 Future Enhancements

* Add cross-browser testing support
* Implement logging with Log4j or ExtentReports
* Include data-driven testing (DDT) with Excel or JSON

## 👩‍💻 Author

**Sanduni Punchihewa** – QA Intern | Undergraduate in ICT
University of Sri Jayewardenepura
🔗 [LinkedIn](https://www.linkedin.com/) (Add your profile)

---


