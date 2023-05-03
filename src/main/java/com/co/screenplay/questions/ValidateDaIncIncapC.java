package com.co.screenplay.questions;

import com.co.screenplay.userinterfaces.PlanPageC;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateDaIncIncapC implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(PlanPageC.BTN_DAILY_INCOME_FOR_TEMPORARY_INCAPACITY_C).viewedBy(actor).asString();
    }
    public static ValidateDaIncIncapC compare13(){
        return new ValidateDaIncIncapC();
    }
}
