package com.co.screenplay.questions;

import com.co.screenplay.userinterfaces.PlanPageC;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateDaIncHospC implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(PlanPageC.LBL_DAILY_INCOME_FOR_HOSPITALIZATION_C).viewedBy(actor).asString();
    }
    public static ValidateDaIncHospC compare12 (){
        return new ValidateDaIncHospC();
    }
}
