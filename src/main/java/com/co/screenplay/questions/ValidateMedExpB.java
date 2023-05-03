package com.co.screenplay.questions;

import com.co.screenplay.userinterfaces.PlanPageB;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateMedExpB implements Question {
    @Override
    public Object answeredBy(Actor actor) {

        return Text.of(PlanPageB.LBL_MEDICAL_EXPENSES_B).viewedBy(actor).asString();
    }
    public static ValidateMedExpB compare9(){
        return new ValidateMedExpB();
    }
}
