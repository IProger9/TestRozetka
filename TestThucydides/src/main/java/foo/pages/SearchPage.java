package foo.pages;


import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.WebElementFacade;

import net.thucydides.core.annotations.findby.FindBy;

import foo.pages.GeneralPage;


@DefaultUrl("http://rozetka.com.ua/")
public class SearchPage extends GeneralPage {

    @FindBy(className="header-search-input-text")
    private WebElementFacade searchField;

    @FindBy(className="search-button-go-link")
    private WebElementFacade searchButton;
    
    @FindBy(className="search-result-title-text")
    private WebElementFacade searchResultTitleText;
    
    @FindBy(name="search-category-value")
    private WebElementFacade searchCategoryValue;
    
    //@FindBy(name="header_user_menu_parent")
    //private WebElementFacade headerUserMenuParent;

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