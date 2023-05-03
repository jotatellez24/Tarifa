package com.co.screenplay.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ExpressionSetPage {


    public static final Target BTN_SET_OF_EXPRESSIONS = Target.the("Click on set of expressions")
            .locatedBy("//button[@title='Seleccionar una vista de lista']//lightning-primitive-icon//*[name()='svg']");

    public static final Target BTN_ALL_EXPRESSIONS_LISTS = Target.the("Click on all expressions")
            .locatedBy("//span[normalize-space()='Todos los conjuntos de expresiones']");

    public static final Target BTN_CP_AP_PLAN = Target.the("Click on Close plan")
            .locatedBy("//*[@id=\"brandBand_2\"]/div/div/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div[1]/div/div/table/tbody/tr[1]/th/span/a");

    public static final Target BTN_SEE_ALL = Target.the("Click on see all")
            .locatedBy("//body[1]/div[4]/div[1]/section[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/article[1]/a[1]/div[1]/span[1]");
    public static final Target BTN_CP_AP_V14 = Target.the("Click on CP_AP V14")
            .locatedBy("//*[@id=\"brandBand_2\"]/div/div/div[4]/div/div/div[2]/div/div[1]/div[2]/div[2]/div[1]/div/div/table/tbody/tr[4]/td[7]/span/div/a/span");

    public static final Target BTN_CP_AP_V14_2 = Target.the("Click on CP_AP V14-2")
            .locatedBy("//a[@title='Open in Expression Set Builder']");

    public static final Target BTN_CP_AP_V15 = Target.the("Click on CP_AP V15")
            .locatedBy("//tbody/tr[4]/td[7]/span[1]/div[1]/a[1]/span[1]/span[1]");

    public static final Target BTN_CP_AP_V15_2 = Target.the("Click on CP_AP V15-2")
            .locatedBy("//a[@title='Open in Expression Set Builder']");



}
