package tests;

import nastya.homework2.PrepareTestData;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseClass {
    Calculator calculator = new Calculator();
    public PrepareTestData prepareTestData = new PrepareTestData();


    @BeforeMethod
    public void setPrepareTestData() {
        prepareTestData.fillArrayInt();
        prepareTestData.fillArrayString();
    }

    @Parameters({"browserName", "country"})
    @BeforeMethod
    public void prepareProject(@Optional String browserName, @Optional String country) {
        System.out.println("Environments:");
        if (browserName.equals("Chrome")) {
            System.out.println("Browser name: " + browserName);
        } else {
            System.out.println("Browser name: " + browserName + " not found");
        }
        if (country.equals("SE")) {
            System.out.println("Country: " + country);
        } else {
            System.out.println("Country: " + country + " not found");
        }
        System.out.println("Before method");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("After method");
    }

}
