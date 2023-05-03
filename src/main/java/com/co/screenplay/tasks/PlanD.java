package com.co.screenplay.tasks;

import com.co.screenplay.userinterfaces.PlanPageB;
import com.co.screenplay.userinterfaces.PlanPageC;
import com.co.screenplay.userinterfaces.PlanPageD;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class PlanD implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(PlanPageD.BTN_PLAN_DETAILS_D));
        actor.attemptsTo(Click.on(PlanPageD.BTN_ACCIDENTAL_DEATH_D));
        actor.attemptsTo(Click.on(PlanPageD.BTN_INCAPACITY_D));
        actor.attemptsTo(Click.on(PlanPageD.BTN_ORGANIC_LOSSES_D));
        actor.attemptsTo(Click.on(PlanPageD.BTN_DAILY_INCOME_FOR_HOSPITALIZATION_D));
        actor.attemptsTo(Click.on(PlanPageD.BTN_DAILY_INCOME_FOR_TEMPORARY_INCAPACITY_D));
        actor.attemptsTo(Click.on(PlanPageD.BTN_MEDICAL_EXPENSES_D));
        actor.attemptsTo(Click.on(PlanPageB.BTN_EXIT));

    }
}
