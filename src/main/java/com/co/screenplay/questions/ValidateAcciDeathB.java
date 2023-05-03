package com.co.screenplay.questions;

import com.co.screenplay.userinterfaces.PlanPageB;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateAcciDeathB implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(PlanPageB.LBL_ACCIDENTAL_DEATH_B).viewedBy(actor).asString();
    }
    public static ValidateAcciDeathB compare6 () {
        return new ValidateAcciDeathB();
    }
}
