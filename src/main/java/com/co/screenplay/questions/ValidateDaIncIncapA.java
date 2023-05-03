package com.co.screenplay.questions;

import com.co.screenplay.userinterfaces.PlanPageA;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateDaIncIncapA implements Question {


    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(PlanPageA.LBL_DAILY_INCOME_FOR_TEMPORARY_INCAPACITY_A).viewedBy(actor).asString();
    }

    public static ValidateDaIncIncapA compare4 () {

        return new ValidateDaIncIncapA();
    }
}
