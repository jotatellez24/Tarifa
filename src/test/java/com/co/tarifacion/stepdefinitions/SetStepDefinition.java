package com.co.tarifacion.stepdefinitions;

import com.co.screenplay.tasks.ExpressionSet;
import com.co.screenplay.tasks.Home;
import com.co.screenplay.tasks.Login;
import com.co.screenplay.tasks.Simulation;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class SetStepDefinition {

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("SalesForce-User");

    }

    @Given("^The user logged into the salesforce CRM with valid credentials$")
    public void theUserLoggedIntoTheSalesforceCRMWithValidCredentials()  {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://globalseguros--ta.sandbox.my.salesforce.com"));
        OnStage.theActorInTheSpotlight().attemptsTo(Login.loginenter());

    }

    @When("^The user enters into the expression set tag and execute a new simulation$")
    public void theUserEntersIntoTheExpressionSetTagAndExecuteANewSimulation()  {
        OnStage.theActorInTheSpotlight().attemptsTo(Home.homeenter());
        OnStage.theActorInTheSpotlight().attemptsTo(ExpressionSet.expressionSethome());
      //  OnStage.theActorInTheSpotlight().attemptsTo(Simulation.simulationenter());

    }

    @Then("^The user will be able to validate if the values displayed in the database matches with the values displayed in the simulation$")
    public void theUserWillBeAbleToValidateIfTheValuesDisplayedInTheDatabaseMatchesWithTheValuesDisplayedInTheSimulation()  {

    }


}
