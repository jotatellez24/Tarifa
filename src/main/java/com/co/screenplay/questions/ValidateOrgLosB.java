package com.co.screenplay.questions;

import com.co.screenplay.userinterfaces.PlanPageB;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateOrgLosB implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(PlanPageB.LBL_ORGANIC_LOSSES_B).viewedBy(actor).asString();
    }
    public static ValidateOrgLosB compare10(){
        return new ValidateOrgLosB();
    }
}
