package com.co.screenplay.tasks;

import com.co.screenplay.userinterfaces.QuotationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Quotation implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(QuotationPage.TAG_QOUTATION));
        actor.attemptsTo(Click.on(QuotationPage.BTN_CURRENT_STAGE));
        actor.attemptsTo(Click.on(QuotationPage.BTN_CREATE_QOUTE));
        actor.attemptsTo(Click.on(QuotationPage.BTN_NEXT_Q));
        actor.attemptsTo(Enter.theValue("#").into(QuotationPage.TXT_NUMBER_OF_INSUREDS));
        actor.attemptsTo(Click.on(QuotationPage.BTN_PAYMENT_FORM));
        actor.attemptsTo(Click.on(QuotationPage.BTN_CLOSE_PLAN));
        actor.attemptsTo(Click.on(QuotationPage.BTN_NEXT_Q2));





    }

    public static Quotation quotationenter () {

        return Tasks.instrumented(Quotation.class);
    }

}
