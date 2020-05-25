package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_SELECT = "//div[contains(@class, \"_5k_5\")]/span/span/select[1]";
    public static final String XPATH_SELECT_MONTH = "//div[contains(@class, \"_5k_5\")]/span/span/select[2]";
    public static final String XPATH_SELECT_YEAR = "//div[contains(@class, \"_5k_5\")]/span/span/select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        while (!driver.findElement(By.xpath(XPATH_SELECT)).isDisplayed()) ;

        WebElement dayElement = driver.findElement(By.xpath(XPATH_SELECT));
        Select selectDay = new Select(dayElement);
        selectDay.selectByIndex(30);


        WebElement monthElement = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectMonth = new Select(monthElement);
        selectMonth.selectByIndex(6);

        WebElement yearElement = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectYear = new Select(yearElement);
        selectYear.selectByIndex(1);

    }
}
