package com.co.screenplay.tasks;

import com.co.screenplay.userinterfaces.PlanPageA;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class PlanA implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(PlanPageA.BTN_PLAN_DETAILS_A));
        actor.attemptsTo(Click.on(PlanPageA.BTN_ACCIDENTAL_DEATH_A));
        actor.attemptsTo(Click.on(PlanPageA.BTN_INCAPACITY_A));
        actor.attemptsTo(Click.on(PlanPageA.BTN_ORGANIC_LOSSES_A));
        actor.attemptsTo(Click.on(PlanPageA.BTN_DAILY_INCOME_FOR_HOSPITALIZATION_A));
        actor.attemptsTo(Click.on(PlanPageA.BTN_DAILY_INCOME_FOR_TEMPORARY_INCAPACITY_A));
        actor.attemptsTo(Click.on(PlanPageA.BTN_MEDICAL_EXPENSES_A));
        actor.attemptsTo(Click.on(PlanPageA.BTN_EXIT));



    }
}
