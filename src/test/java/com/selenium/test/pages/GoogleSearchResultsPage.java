package com.selenium.test.pages;

import com.selenium.test.webtestsbase.BasePage;
import com.selenium.test.webtestsbase.WebDriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.NoSuchElementException;

/**
 * Created by daria on 15.11.15.
 */
public class GoogleSearchResultsPage extends BasePage {

    @FindBy(xpath = "//div[@id='search']")
    private WebElement searchResults;

    @FindBy(xpath = "//div[@id='center_col']//div[@class='rc']/h3/a")
    private WebElement firstResult;

    public GoogleSearchResultsPage() {
        super(false);
    }

    @Override
    protected void openPage() {
        getDriver().get("");
    }

    @Override
    public boolean isPageOpened() {
        try {


            return searchResults.isDisplayed();
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    public VKMainPage clickFirstResult(){
        firstResult.click();
        return new VKMainPage();
    }

}
