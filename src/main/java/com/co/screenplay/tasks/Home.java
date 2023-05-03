package com.co.screenplay.tasks;

import com.co.screenplay.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Home implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {



      //  WaitUntil.the(HomePage.BTN_APPLAUNCHER, WebElementStateMatchers.isVisible()).forNoMoreThan(20).seconds();
        actor.attemptsTo(Click.on(HomePage.BTN_APPLAUNCHER));
      //  Waits.WaitsUntils(10,"segundos");
        actor.attemptsTo(Click.on(HomePage.BTN_APPLAUNCHER_SERVICE));
        actor.attemptsTo(Enter.theValue("Expresiones").into(HomePage.TXT_APPLAUNCHER_SERVICE));
      //  actor.attemptsTo(Click.on(HomePage.SELECT_OPPORTUNITIES));
        actor.attemptsTo(Click.on(HomePage.SELECT_EXPRESSION_SET));
    }


    public static Home homeenter (){

        return Tasks.instrumented(Home.class);
    }



}
