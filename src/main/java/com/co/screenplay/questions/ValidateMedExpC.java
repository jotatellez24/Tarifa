package com.co.screenplay.questions;

import com.co.screenplay.userinterfaces.PlanPageC;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateMedExpC implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(PlanPageC.LBL_MEDICAL_EXPENSES_C).viewedBy(actor).asString();
    }
    public static ValidateMedExpC compare15 (){
        return new ValidateMedExpC();
    }
}
