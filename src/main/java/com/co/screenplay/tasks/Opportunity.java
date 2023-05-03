package com.co.screenplay.tasks;

import com.co.screenplay.models.OportunidadMetodo;
import com.co.screenplay.utils.ExcelLoader;
import com.co.screenplay.userinterfaces.OpportunitiesPage;
import com.co.screenplay.utils.Waits;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Mouse;

import java.io.File;
import java.util.ArrayList;

public class Opportunity implements Task {

    public String Variable = "";

    @Override
    public <T extends Actor> void performAs(T actor) {

        // WaitUntil.the(OpportunitiesPage.SELECT_OPTION_GENERAL, WebElementStateMatchers.isVisible()).forNoMoreThan(20).seconds();
        Waits.WaitsUntils(3, "segundos");
        actor.attemptsTo(
                Click.on(OpportunitiesPage.BTN_NEW_OPPORTUNITY));
        Waits.WaitsUntils(5, "segundos");
        actor.attemptsTo(Click.on(OpportunitiesPage.SELECT_OPTION_GENERAL));
        actor.attemptsTo(Click.on(OpportunitiesPage.BTN_NEXT)              );

        ArrayList<OportunidadMetodo> ops = new ArrayList<>();
        try {
            ops = ExcelLoader.readExcel(new File("Sabana Tarifación Planes Cerrados.xlsx"));
        } catch (Exception e) {
        }

        for (OportunidadMetodo op : ops) {
            actor.attemptsTo(Enter.theValue(op.getCuenta()).into(OpportunitiesPage.TXT_ACCOUNT));
            Waits.WaitsUntils(2, "segundos");
            actor.attemptsTo(
                    Hit.the(Keys.ARROW_DOWN).into(OpportunitiesPage.TXT_ACCOUNT),
                    Hit.the(Keys.ARROW_DOWN).into(OpportunitiesPage.TXT_ACCOUNT),
                    Hit.the(Keys.ENTER).into(OpportunitiesPage.TXT_ACCOUNT));
            System.out.println(op.getCuenta() + " "+ op.getFraccionamiento() + " " +op.getCantAsegurados());
            Variable = "Acercamiento";

            switch (Variable) {

                case "Acercamiento":
                    for (int i = 0; i <= 0; i++) {
                        actor.attemptsTo(
                                Hit.the(Keys.ARROW_DOWN).into(OpportunitiesPage.SELECT_STAGE)
                        );
                    }
                    actor.attemptsTo(Hit.the(Keys.ENTER).into(OpportunitiesPage.SELECT_STAGE));
                    break;
                case "Cancelada":

                    for (int i = 0; i <= 9; i++) {
                        actor.attemptsTo(
                                Hit.the(Keys.ARROW_DOWN).into(OpportunitiesPage.SELECT_STAGE)
                        );
                    }
                    actor.attemptsTo(Hit.the(Keys.ENTER).into(OpportunitiesPage.SELECT_STAGE));

                    break;
                default:
                    for (int i = 0; i <= 0; i++) {
                        actor.attemptsTo(
                                Hit.the(Keys.ARROW_DOWN).into(OpportunitiesPage.SELECT_STAGE)
                        );
                    }

            }
        }

        actor.attemptsTo(
                Enter.theValue("ALPINA").into(OpportunitiesPage.TXT_ACCOUNT),
                Hit.the(Keys.ARROW_DOWN).into(OpportunitiesPage.TXT_ACCOUNT),
                Hit.the(Keys.ARROW_DOWN).into(OpportunitiesPage.TXT_ACCOUNT),
                Hit.the(Keys.ENTER).into(OpportunitiesPage.TXT_ACCOUNT),
                Enter.theValue("11/04/2023").into(OpportunitiesPage.SELECT_CLOSE_DATE),
                Click.on(OpportunitiesPage.SELECT_STAGE),
                Click.on(OpportunitiesPage.BTN_SAVE));






      //  actor.attemptsTo(Click.on(OpportunitiesPage.SELECT_ACCOUNT_NAME));
       // actor.attemptsTo(Enter.theValue("11/04/2023").into(OpportunitiesPage.SELECT_CLOSE_DATE));




    }

    public static Opportunity opportunityenter() {

        return Tasks.instrumented(Opportunity.class);
    }

}
