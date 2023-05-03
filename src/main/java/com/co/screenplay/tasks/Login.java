package com.co.screenplay.tasks;

import com.co.screenplay.models.OportunidadMetodo;
import com.co.screenplay.userinterfaces.LoginPage;
import com.co.screenplay.utils.ExcelLoader;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import javax.swing.*;
import java.io.File;
import java.util.ArrayList;

public class Login implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(Enter.theValue("juan.vergara@cloudblue.us").into(LoginPage.TXT_USERNAME));
        actor.attemptsTo(Enter.theValue("Juan$ebastian25").into(LoginPage.TXT_PASSWORD));
        actor.attemptsTo(Click.on(LoginPage.BTN_LOGIN));
    /*    actor.attemptsTo(Enter.theValue("ivan@gsf.com.ta").into(LoginPage.TXT_USERNAME));
        actor.attemptsTo(Enter.theValue("@@Global2022").into(LoginPage.TXT_PASSWORD));

     */


    }


    public static Login loginenter (){

        return Tasks.instrumented(Login.class);
    }
}
