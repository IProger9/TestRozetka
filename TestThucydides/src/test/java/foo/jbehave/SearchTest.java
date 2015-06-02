package foo.jbehave;

import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import foo.steps.SearchSteps;

public class SearchTest {
	
	private final String SEARCH_WORD = "notebook";

    @Steps
    SearchSteps searchSteps;

    @Given("the user is on the Rozetka home page")
    public void givenTheUserIsOnTheRozetkaHomePage() {
    	searchSteps.openSearchPage();
    }

    @When("the user type word 'notebook' in search field")
    public void whenTheUserTypeWordNotebook() {
    	searchSteps.typeSearchField(SEARCH_WORD);
    	searchSteps.clickSearchButton();
    }

    @Then("they should see appropriate result of searching")
    public void thenTheyShouldSeeAppropriateResultOfSearching() {
    	searchSteps.searchResultTitleTextContains(SEARCH_WORD);
    }

}
