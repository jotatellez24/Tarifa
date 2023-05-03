package com.co.screenplay.questions;

import com.co.screenplay.userinterfaces.PlanPageD;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateOrgLosD implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(PlanPageD.LBL_ORGANIC_LOSSES_D).viewedBy(actor).asString();
    }
    public static ValidateOrgLosD compare22 (){
        return new ValidateOrgLosD();
    }
}
