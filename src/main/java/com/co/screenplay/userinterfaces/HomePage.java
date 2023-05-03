package com.co.screenplay.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public static final Target BTN_APPLAUNCHER = Target.the("Click on APPLAUNCHER button")
            .locatedBy("//div[@class='slds-icon-waffle']");
    public static final Target BTN_APPLAUNCHER_SERVICE = Target.the("Click on APPLAUNCHER_SERVICE button")
            .locatedBy("//input[@placeholder='Buscar aplicaciones y elementos...']");
    public static final Target TXT_APPLAUNCHER_SERVICE = Target.the("Write on APPLAUNCHER_SERVICE field")
            .locatedBy("//input[@placeholder='Buscar aplicaciones y elementos...']");
    //public static final Target SELECT_OPPORTUNITIES = Target.the("Select the opportunity option")
     //       .locatedBy("");

    public static final Target SELECT_EXPRESSION_SET = Target.the("Select the expression set option")
            .locatedBy("//a[@data-label='Conjuntos de expresiones']//p[@class='slds-truncate']");


}


