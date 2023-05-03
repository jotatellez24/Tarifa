package com.co.screenplay.questions;

import com.co.screenplay.userinterfaces.PlanPageD;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateAcciDeathD implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(PlanPageD.LBL_ACCIDENTAL_DEATH_D).viewedBy(actor).asString();
    }
    public static ValidateAcciDeathD compare17 (){
        return new ValidateAcciDeathD();
    }
}
