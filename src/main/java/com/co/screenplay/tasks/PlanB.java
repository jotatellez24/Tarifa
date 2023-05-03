package com.co.screenplay.tasks;

import com.co.screenplay.userinterfaces.PlanPageA;
import com.co.screenplay.userinterfaces.PlanPageB;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class PlanB implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(PlanPageB.BTN_PLAN_DETAILS_B));
        actor.attemptsTo(Click.on(PlanPageB.BTN_ACCIDENTAL_DEATH_B));
        actor.attemptsTo(Click.on(PlanPageB.BTN_INCAPACITY_B));
        actor.attemptsTo(Click.on(PlanPageB.BTN_ORGANIC_LOSSES_B));
        actor.attemptsTo(Click.on(PlanPageB.BTN_DAILY_INCOME_FOR_HOSPITALIZATION_B));
        actor.attemptsTo(Click.on(PlanPageB.BTN_DAILY_INCOME_FOR_TEMPORARY_INCAPACITY_B));
        actor.attemptsTo(Click.on(PlanPageB.BTN_MEDICAL_EXPENSES_B));
        actor.attemptsTo(Click.on(PlanPageB.BTN_EXIT));

    }



}
