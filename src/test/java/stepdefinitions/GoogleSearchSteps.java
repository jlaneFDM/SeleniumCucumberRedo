package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	
	@Given("browser is open")
	public void browser_is_open() {
	   System.out.println("browser open");
	}
	@And("user is on google search page")
	public void user_is_on_google_search_page() {
	    System.out.println("on google search page");
	}
	
	@When("user enters text in search box")
	public void user_enters_text_in_search_box() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@And("user hits enter")
	public void user_hits_enter() {
	   System.out.println("user hits enter");
	}
	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
	   System.out.println("navigated to search results");
	}


}
