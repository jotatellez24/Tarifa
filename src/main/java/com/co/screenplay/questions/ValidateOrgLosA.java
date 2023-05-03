package com.co.screenplay.questions;

import com.co.screenplay.userinterfaces.PlanPageA;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateOrgLosA  implements Question {
    @Override
    public Object answeredBy(Actor actor) {

        return Text.of(PlanPageA.LBL_ORGANIC_LOSSES_A).viewedBy(actor).asString();
    }

    public static ValidateOrgLosA compare2 (){

        return new ValidateOrgLosA();
    }
}
