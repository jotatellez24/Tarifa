package com.co.screenplay.tasks;

import com.co.screenplay.userinterfaces.ExpressionSetPage;
import com.co.screenplay.userinterfaces.SimulationPage;
import com.co.screenplay.utils.Waits;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Simulation implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SimulationPage.BTN_SIMULATE));
        Waits.WaitsUntils(5,"segundos");
        actor.attemptsTo(Enter.theValue("1").into(SimulationPage.TXT_RISK_LEVEL));
        Waits.WaitsUntils(2,"segundos");
        actor.attemptsTo(Enter.theValue("10").into(SimulationPage.TXT_INSUREDS));
        Waits.WaitsUntils(2,"segundos");
        actor.attemptsTo(Enter.theValue("Mensual").into(SimulationPage.TXT_FRACTIONATION));
        Waits.WaitsUntils(2,"segundos");
        actor.attemptsTo(Click.on(SimulationPage.BTN_SIMULATE_2));
        Waits.WaitsUntils(15,"segundos");

    }
    public static Simulation simulationenter (){
        return Tasks.instrumented(Simulation.class);
    }
}
