package com.co.screenplay.questions;

import com.co.screenplay.userinterfaces.PlanPageB;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateDaIncIncapB implements Question {


    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(PlanPageB.LBL_DAILY_INCOME_FOR_TEMPORARY_INCAPACITY_B).viewedBy(actor).asString();
    }
    public static ValidateDaIncIncapB compare8 (){
        return new ValidateDaIncIncapB();
    }
}
