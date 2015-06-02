package foo.pages;

import ch.lambdaj.function.convert.Converter;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import net.thucydides.core.pages.WebElementFacade;

import net.thucydides.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;

import java.util.List;

import static ch.lambdaj.Lambda.convert;

@DefaultUrl("http://rozetka.com.ua/")
public class SearchPage extends PageObject {

    @FindBy(className="header-search-input-text")
    private WebElementFacade searchField;

    @FindBy(className="search-button-go-link")
    private WebElementFacade searchButton;
    
    @FindBy(className="search-result-title-text")
    private WebElementFacade searchResultTitleText;

    public void typeSearchField(String keyword) {
    	searchField.type(keyword);
    }

    public void clickSearchButton() {
    	searchButton.click();
    }
    
    public String  getSearchResultTitleText() {
    	return searchResultTitleText.getText();
    }

    
}