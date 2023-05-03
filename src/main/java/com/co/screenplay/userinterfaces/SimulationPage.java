package com.co.screenplay.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class SimulationPage {


    public static final Target BTN_SIMULATE = Target.the("Click in the simulation button")
            .locatedBy("//lightning-button[@data-id='simulate']");
    public static final Target TXT_RISK_LEVEL = Target.the("Enter the risk level")
            .locatedBy("//div[3]//div[1]//builder_industries_interaction_rule-input-form-element[1]//div[1]//div[1]//span[2]//lightning-input[1]//div[1]//div[1]//input[1]");
    public static final Target TXT_INSUREDS = Target.the("Enter the number of insureds")
            .locatedBy("/html[1]/body[1]/builder_industries_interaction_rule-rule-builder-module[1]/div[1]/div[2]/builder_industries_interaction_rule-simulation-editor[1]/div[1]/div[1]/builder_industries_interaction_rule-simulation-editor-left-panel[1]/div[1]/div[1]/lightning-tabset[1]/div[1]/slot[1]/lightning-tab[1]/slot[1]/div[1]/lightning-accordion[1]/slot[1]/lightning-accordion-section[1]/section[1]/div[2]/slot[1]/nav[1]/div[6]/div[1]/builder_industries_interaction_rule-input-form-element[1]/div[1]/div[1]/span[2]/lightning-input[1]/div[1]/div[1]/input[1]");
    //  public static final Target TXT_PLAN = Target.the("Enter kind of plan")
    //         .locatedBy("//div[3]//div[1]//builder_industries_interaction_rule-input-form-element[1]//div[1]//div[1]//span[2]//lightning-input[1]//div[1]//div[1]//input[1]");
    public static final Target TXT_FRACTIONATION = Target.the("Enter the kind of fractionation")
            .locatedBy("/html[1]/body[1]/builder_industries_interaction_rule-rule-builder-module[1]/div[1]/div[2]/builder_industries_interaction_rule-simulation-editor[1]/div[1]/div[1]/builder_industries_interaction_rule-simulation-editor-left-panel[1]/div[1]/div[1]/lightning-tabset[1]/div[1]/slot[1]/lightning-tab[1]/slot[1]/div[1]/lightning-accordion[1]/slot[1]/lightning-accordion-section[1]/section[1]/div[2]/slot[1]/nav[1]/div[8]/div[1]/builder_industries_interaction_rule-input-form-element[1]/div[1]/div[1]/span[2]/lightning-input[1]/div[1]/div[1]/input[1]");
    public static final Target BTN_SIMULATE_2 = Target.the("Click on simulation_2")
            .locatedBy("//button[normalize-space()='Simular']");
    //public static final Target TXT_INSURANCE_PLAN
    // = Target.the("Enter kind of insurance")
    //    .locatedBy("//div[3]//div[1]//builder_industries_interaction_rule-input-form-element[1]//div[1]//div[1]//span[2]//lightning-input[1]//div[1]//div[1]//input[1]");

    public static final Target LBL_PLAN = Target.the("Click on simulation_2")
            .locatedBy("/html[1]/body[1]/builder_industries_interaction_rule-rule-builder-module[1]/div[1]/div[2]/builder_industries_interaction_rule-simulation-editor[1]/div[1]/div[1]/builder_industries_interaction_rule-simulation-editor-left-panel[1]/div[1]/div[1]/lightning-tabset[1]/div[1]/slot[1]/lightning-tab[1]/slot[1]/div[1]/lightning-accordion[1]/slot[1]/lightning-accordion-section[1]/section[1]/div[2]/slot[1]/nav[1]/div[7]/div[1]/builder_industries_interaction_rule-input-form-element[1]/div[1]/div[1]/span[2]/lightning-input[1]/div[1]/div[1]/input[1]");

    public static final Target BTN_BACK = Target.the("Click on Back button")
            .locatedBy("//button[normalize-space()='Atrás']");

    public static final Target LBL_SA_basico = Target.the("La Suma asegurada: ")

            .locatedBy("//tbody/tr[1]/td[2]/div[1]/builder_industries_interaction_rule-formatted-data[1]/div[1]/lightning-formatted-number[1]");

    public static final Target LBL_SA_ITP = Target.the("La suma asegurada por incapacidad total es: ")
            .locatedBy("//tbody/tr[2]/td[2]/div[1]/builder_industries_interaction_rule-formatted-data[1]/div[1]/lightning-formatted-number[1]");

    public static final Target LBL_SA_PO = Target.the("La suma asegurada por perdidas organizas es: ")
            .locatedBy("//tbody/tr[2]/td[2]/div[1]/builder_industries_interaction_rule-formatted-data[1]/div[1]/lightning-formatted-number[1]");

    public static final Target LBL_SA_RD_HA = Target.the("La suma asegurada para renta diaria por hospitalizacion es: ")
            .locatedBy("/html[1]/body[1]/builder_industries_interaction_rule-rule-builder-module[1]/div[1]/div[2]/builder_industries_interaction_rule-simulation-editor[1]/div[1]/div[1]/builder_industries_interaction_rule-simulation-editor-left-panel[1]/div[1]/div[1]/lightning-tabset[1]/div[1]/slot[1]/lightning-tab[2]/slot[1]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[2]/div[1]/builder_industries_interaction_rule-formatted-data[1]/div[1]/lightning-formatted-number[1]");

    public static final Target LBL_SA_RD_IT_A = Target.the("La suma asegurada para renta diaria por incapacidad es:")
            .locatedBy("/html[1]/body[1]/builder_industries_interaction_rule-rule-builder-module[1]/div[1]/div[2]/builder_industries_interaction_rule-simulation-editor[1]/div[1]/div[1]/builder_industries_interaction_rule-simulation-editor-left-panel[1]/div[1]/div[1]/lightning-tabset[1]/div[1]/slot[1]/lightning-tab[2]/slot[1]/div[1]/div[1]/table[1]/tbody[1]/tr[5]/td[2]/div[1]/builder_industries_interaction_rule-formatted-data[1]/div[1]/lightning-formatted-number[1]");

    public static final Target LBL_SA_GM = Target.the("La suma asegurada para gastos medicos es:")
            .locatedBy("/html[1]/body[1]/builder_industries_interaction_rule-rule-builder-module[1]/div[1]/div[2]/builder_industries_interaction_rule-simulation-editor[1]/div[1]/div[1]/builder_industries_interaction_rule-simulation-editor-left-panel[1]/div[1]/div[1]/lightning-tabset[1]/div[1]/slot[1]/lightning-tab[2]/slot[1]/div[1]/div[1]/table[1]/tbody[1]/tr[6]/td[2]/div[1]/builder_industries_interaction_rule-formatted-data[1]/div[1]/lightning-formatted-number[1]");

    public static final Target LBL_TOTAL_PRIMA = Target.the(" La suma de Prima total es: ")
            .locatedBy("//body[1]/builder_industries_interaction_rule-rule-builder-module[1]/div[1]/div[2]/builder_industries_interaction_rule-simulation-editor[1]/div[1]/div[1]/builder_industries_interaction_rule-simulation-editor-left-panel[1]/div[1]/div[1]/lightning-tabset[1]/div[1]/slot[1]/lightning-tab[2]/slot[1]/div[1]/div[1]/table[1]/tbody[1]/tr[26]/td[2]/div[1]");

    public static final Target LBL_PRIMA_FRACCION = Target.the("La suma de prima segun el fraccionamiento es: ")
            .locatedBy("//body[1]/builder_industries_interaction_rule-rule-builder-module[1]/div[1]/div[2]/builder_industries_interaction_rule-simulation-editor[1]/div[1]/div[1]/builder_industries_interaction_rule-simulation-editor-left-panel[1]/div[1]/div[1]/lightning-tabset[1]/div[1]/slot[1]/lightning-tab[2]/slot[1]/div[1]/div[1]/table[1]/tbody[1]/tr[27]/td[2]/div[1]");
}
