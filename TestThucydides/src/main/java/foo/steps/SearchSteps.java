package foo.steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import foo.pages.SearchPage;

public class SearchSteps extends ScenarioSteps {
	
    private SearchPage onSearchPage(){
    	return getPages().getPage(SearchPage.class);
    }
    
    @Step
    public void openSearchPage(){
    	onSearchPage().open();
    }

    @Step
    public void typeSearchField(String keyword) {
    	onSearchPage().typeSearchField(keyword);
    }

    @Step
    public void clickSearchButton() {
    	onSearchPage().clickSearchButton();
    }

    @Step
    public void searchResultTitleTextContains(String text) {
        assertThat(onSearchPage().getSearchResultTitleText(), containsString(text));
    }

}