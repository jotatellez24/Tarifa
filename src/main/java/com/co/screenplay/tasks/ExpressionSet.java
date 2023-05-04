package com.co.screenplay.tasks;

import com.co.screenplay.models.OportunidadMetodo;
import com.co.screenplay.userinterfaces.ExpressionSetPage;
import com.co.screenplay.userinterfaces.SimulationPage;
import com.co.screenplay.utils.ExcelLoader;
import com.co.screenplay.utils.FormatClass;
import com.co.screenplay.utils.Waits;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.questions.Text;

import java.io.File;
import java.util.ArrayList;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class ExpressionSet implements Task {
    private String SaBasico;
    private String SA_ITP;
    private String SA_PO;
    private String SARD_HA;
    private String SA_RD_IT_A;
    private String SA_GM;
    private String TOTALPRIMA;
    private String TOTALPRIMAMENSUAL;


    @Override
    public <T extends Actor> void performAs(T actor) {
        ArrayList<OportunidadMetodo> ops = new ArrayList<>();
        try {
            ops = ExcelLoader.readExcel(new File("Sabana Tarifación Planes Cerrados.xlsx"));
        } catch (Exception e) {
        }


        actor.attemptsTo(Click.on(ExpressionSetPage.BTN_SET_OF_EXPRESSIONS));
        actor.attemptsTo(Click.on(ExpressionSetPage.BTN_ALL_EXPRESSIONS_LISTS));
        Waits.WaitsUntils(10, "segundos");
        actor.attemptsTo(Click.on(ExpressionSetPage.BTN_CP_AP_PLAN));
        Waits.WaitsUntils(20, "segundos");
        actor.attemptsTo(Click.on(ExpressionSetPage.BTN_SEE_ALL));
        Waits.WaitsUntils(20, "segundos");
        //actor.attemptsTo(Click.on(ExpressionSetPage.BTN_CP_AP_V14));
        actor.attemptsTo(Click.on(ExpressionSetPage.BTN_CP_AP_V15));
        Waits.WaitsUntils(20, "segundos");
//        actor.attemptsTo(Click.on(ExpressionSetPage.BTN_CP_AP_V14_2));
        actor.attemptsTo(Click.on(ExpressionSetPage.BTN_CP_AP_V15_2));
        Waits.WaitsUntils(10, "segundos");
        for (String winHandle : getDriver().getWindowHandles()) {
            getDriver().switchTo().window(winHandle);
        }
        Waits.WaitsUntils(10, "segundos");

        for (OportunidadMetodo op : ops) {
            actor.attemptsTo(Click.on(SimulationPage.BTN_SIMULATE));
            actor.attemptsTo(
                    Scroll.to(SimulationPage.TXT_RISK_LEVEL),
                    Click.on(SimulationPage.TXT_RISK_LEVEL),

                    Enter.theValue(Integer.toString(Math.round(Float.parseFloat(op.getNivelRiesgo())))).into(SimulationPage.TXT_RISK_LEVEL),
                    Scroll.to(SimulationPage.TXT_INSUREDS),
                    Click.on(SimulationPage.TXT_INSUREDS),
                    Enter.theValue(String.valueOf(Math.round(op.getCantAsegurados()))).into(SimulationPage.TXT_INSUREDS),
                    Scroll.to(SimulationPage.LBL_PLAN),
                    Click.on(SimulationPage.LBL_PLAN),
                    Enter.theValue(op.getPlan()).into(SimulationPage.LBL_PLAN),
                    Scroll.to(SimulationPage.TXT_FRACTIONATION),
                    Click.on(SimulationPage.TXT_FRACTIONATION),
                    Enter.theValue(op.getFraccionamiento()).into(SimulationPage.TXT_FRACTIONATION),
                    Click.on(SimulationPage.BTN_SIMULATE_2)
            );
            SaBasico = FormatClass.FormatoQuestion(Text.of(SimulationPage.LBL_SA_basico).viewedBy(actor).asString());
            SA_ITP = FormatClass.FormatoQuestion(Text.of(SimulationPage.LBL_SA_ITP).viewedBy(actor).asString());
            SA_PO = FormatClass.FormatoQuestion(Text.of(SimulationPage.LBL_SA_PO).viewedBy(actor).asString());
            SARD_HA = FormatClass.FormatoQuestion(Text.of(SimulationPage.LBL_SA_RD_HA).viewedBy(actor).asString());
            SA_RD_IT_A = FormatClass.FormatoQuestion(Text.of(SimulationPage.LBL_SA_RD_IT_A).viewedBy(actor).asString());
            SA_GM = FormatClass.FormatoQuestion(Text.of(SimulationPage.LBL_SA_GM).viewedBy(actor).asString());
            TOTALPRIMA = FormatClass.FormatoQuestion(Text.of(SimulationPage.LBL_TOTAL_PRIMA).viewedBy(actor).asString());
            TOTALPRIMAMENSUAL = FormatClass.FormatoQuestion(Text.of(SimulationPage.LBL_PRIMA_FRACCION).viewedBy(actor).asString());


            String SabanaBasico = ExcelLoader.SimpleDouble(op.getSaBasico());
            String SabanaSA_ITP = ExcelLoader.SimpleDouble(op.getSaItp());
            String SabanaSA_PO = ExcelLoader.SimpleDouble(op.getSaPo());
            String SabanaSARD_HA = ExcelLoader.SimpleDouble(op.getSaRdHa());
            String SabanaSA_RD_IT_A = ExcelLoader.SimpleDouble(op.getSaRdItA());
            String SabanaSA_GM = ExcelLoader.SimpleDouble(op.getSaGm());
            String SabanaPrimaAnual = ExcelLoader.completeDouble(op.getPrimaAnualTotal());
            String SabanaPrimaFraccion = ExcelLoader.completeDouble(op.getPrimaFraccionadaTotal());
            String Estado = "";
            if ((this.SaBasico.equals(SabanaBasico)) &&
                    (this.SA_GM.equals(SabanaSA_GM)) &&
                    (this.SA_PO.equals(SabanaSA_PO)) &&
                    (this.SARD_HA.equals(SabanaSARD_HA)) &&
                    (this.SA_RD_IT_A.equals(SabanaSA_RD_IT_A)) &&
                    (this.TOTALPRIMA.equals(SabanaPrimaAnual))&&
                    (this.TOTALPRIMAMENSUAL.equals(SabanaPrimaFraccion))
            ) {
                op.setEstado("Exito");

            } else {
                op.setEstado("FALLO");
            }

            Waits.WaitsUntils(4, "segundos");
            try {
                ExcelLoader.writeExcel(new File("Sabana Tarifación Planes Cerrados.xlsx"), ops);
            } catch (Exception e) {
            }
            actor.attemptsTo(Click.on(SimulationPage.BTN_BACK));

        }


    }

    public static ExpressionSet expressionSethome() {

        return Tasks.instrumented(ExpressionSet.class);
    }
}
