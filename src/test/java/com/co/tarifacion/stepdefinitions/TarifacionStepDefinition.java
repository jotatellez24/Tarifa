package com.co.tarifacion.stepdefinitions;

import com.co.screenplay.tasks.Home;
import com.co.screenplay.tasks.Login;
import com.co.screenplay.tasks.Opportunity;
import com.co.screenplay.tasks.Quotation;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class TarifacionStepDefinition {


    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("SalesForce-User");

    }


    @Given("^The user logged into the page with valid credentials$")
    public void theUserLoggedIntoThePageWithValidCredentials()  {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://globalseguros--ta.sandbox.my.salesforce.com/"));
        OnStage.theActorInTheSpotlight().attemptsTo(Login.loginenter());
    }

    @When("^The user enters into the opportunity tag and creates a new opportunity$")
    public void theUserEntersIntoTheOpportunityTagAndCreateANewOpportunity()  {
        OnStage.theActorInTheSpotlight().attemptsTo(Home.homeenter());
        OnStage.theActorInTheSpotlight().attemptsTo(Opportunity.opportunityenter());

    }


    @When("^The user creates a new quote$")
    public void theUserCreatesANewQuote()  {

        OnStage.theActorInTheSpotlight().attemptsTo(Quotation.quotationenter());

    }

    @When("^The user wants to display the values associates to Plan A$")
    public void theUserWantsToDisplayTheValuesAssociatesToPlanA()  {

    }

    @When("^The user wants to display the values associates to Plan B$")
    public void theUserWantsToDisplayTheValuesAssociatesToPlanB()  {

    }

    @When("^The user wants to display the values associates to Plan C$")
    public void theUserWantsToDisplayTheValuesAssociatesToPlanC()  {

    }

    @When("^The user wants to display the values associates to Plan D$")
    public void theUserWantsToDisplayTheValuesAssociatesToPlanD()  {

    }

    @Then("^The user will be able to see all the values associated to the requested quotes Plan A$")
    public void theUserWillBeAbleToSeeAllTheValuesAssociatedToTheRequestedQuotesPlanA()  {

    }

    @Then("^The user will be able to see all the values associated to the requested quotes Plan B$")
    public void theUserWillBeAbleToSeeAllTheValuesAssociatedToTheRequestedQuotesPlanB()  {

    }

    @Then("^The user will be able to see all the values associated to the requested quotes Plan C$")
    public void theUserWillBeAbleToSeeAllTheValuesAssociatedToTheRequestedQuotesPlanC() {

    }

    @Then("^The user will be able to see all the values associated to the requested quotes Plan D$")
    public void theUserWillBeAbleToSeeAllTheValuesAssociatedToTheRequestedQuotesPlanD()  {

    }


}
