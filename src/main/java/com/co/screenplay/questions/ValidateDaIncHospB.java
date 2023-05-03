package com.co.screenplay.questions;

import com.co.screenplay.userinterfaces.PlanPageA;
import com.co.screenplay.userinterfaces.PlanPageB;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateDaIncHospB implements Question {
    @Override
    public Object answeredBy(Actor actor) {

        return Text.of(PlanPageB.LBL_DAILY_INCOME_FOR_HOSPITALIZATION_B).viewedBy(actor).asString();

    }

    public static ValidateDaIncHospB compare8 (){

        return new ValidateDaIncHospB();
    }
}
