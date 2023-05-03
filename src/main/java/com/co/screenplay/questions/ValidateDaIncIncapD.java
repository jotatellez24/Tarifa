package com.co.screenplay.questions;

import com.co.screenplay.userinterfaces.PlanPageD;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateDaIncIncapD implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(PlanPageD.LBL_DAILY_INCOME_FOR_TEMPORARY_INCAPACITY_D).viewedBy(actor).asString();
    }
    public static ValidateDaIncIncapD compare19(){
        return new ValidateDaIncIncapD();
    }
}
