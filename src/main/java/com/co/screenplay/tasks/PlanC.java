package com.co.screenplay.tasks;

import com.co.screenplay.userinterfaces.PlanPageB;
import com.co.screenplay.userinterfaces.PlanPageC;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class PlanC implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(PlanPageC.BTN_PLAN_DETAILS_C));
        actor.attemptsTo(Click.on(PlanPageC.BTN_ACCIDENTAL_DEATH_C));
        actor.attemptsTo(Click.on(PlanPageC.BTN_INCAPACITY_C));
        actor.attemptsTo(Click.on(PlanPageC.BTN_ORGANIC_LOSSES_C));
        actor.attemptsTo(Click.on(PlanPageC.BTN_DAILY_INCOME_FOR_HOSPITALIZATION_C));
        actor.attemptsTo(Click.on(PlanPageC.BTN_DAILY_INCOME_FOR_TEMPORARY_INCAPACITY_C));
        actor.attemptsTo(Click.on(PlanPageC.BTN_MEDICAL_EXPENSES_C));
        actor.attemptsTo(Click.on(PlanPageB.BTN_EXIT));


    }
}
