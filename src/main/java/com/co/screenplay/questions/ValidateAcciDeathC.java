package com.co.screenplay.questions;

import com.co.screenplay.userinterfaces.PlanPageC;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateAcciDeathC implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(PlanPageC.LBL_ACCIDENTAL_DEATH_C).viewedBy(actor).asString();
    }
    public static ValidateAcciDeathC compare11 (){
        return new ValidateAcciDeathC();
    }
}
