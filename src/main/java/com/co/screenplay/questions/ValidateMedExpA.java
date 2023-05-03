package com.co.screenplay.questions;

import com.co.screenplay.userinterfaces.PlanPageA;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.apache.bcel.generic.PUSH;

public class ValidateMedExpA implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(PlanPageA.LBL_MEDICAL_EXPENSES_A).viewedBy(actor).asString();
    }

    public static ValidateMedExpA compare5(){

        return new ValidateMedExpA();
    }
}
