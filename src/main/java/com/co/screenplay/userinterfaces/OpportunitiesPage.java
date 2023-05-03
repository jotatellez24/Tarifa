package com.co.screenplay.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class OpportunitiesPage {


    public static final Target BTN_NEW_OPPORTUNITY = Target.the("Click on NEW button")
            .locatedBy("//li[@data-target-selection-name='sfdc:StandardButton.Opportunity.New']");
    public static final Target SELECT_OPTION_GENERAL = Target.the("Click on GENERAL button")
            .locatedBy("//span[normalize-space()='General']");
    public static final Target BTN_NEXT = Target.the("Click on NEXT button")
            .locatedBy("//span[contains(text(),'Next')]");
    public static final Target TXT_OPPORTUNITY_NAME = Target.the("Enter the OPPORTUNITY name")
            .locatedBy("//body[1]/div[4]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/records-modal-lwc-detail-panel-wrapper[1]/records-record-layout-event-broker[1]/slot[1]/records-lwc-detail-panel[1]/records-base-record-form[1]/div[1]/div[1]/div[1]/div[1]/records-lwc-record-layout[1]/forcegenerated-detailpanel_opportunity___01222000000qqrnaa2___full___create___recordlayout2[1]/records-record-layout-block[1]/slot[1]/records-record-layout-section[1]/div[1]/div[1]/div[1]/slot[1]/records-record-layout-row[3]/slot[1]/records-record-layout-item[1]/div[1]/span[1]/slot[1]/records-record-layout-base-input[1]/lightning-input[1]/div[1]/div[1]/input[1]");

    public static final Target TXT_ACCOUNT = Target.the("Enter the ACCOUNT name")
            .locatedBy("//input[@placeholder='Search Accounts...']");

    public static final Target TXT_ENTER_ALPINE = Target.the("Enter en la lista account")
            .located(By.id("combobox-input-1139"));

    public static final Target SELECT_ACCOUNT_NAME = Target.the("Select the ACCOUNT name from list")
            .locatedBy("//ul[@role='group']//li[@role='presentation']");
    public static final Target SELECT_CLOSE_DATE = Target.the("Select CLOSE DATE")
            .locatedBy("//input[@name='CloseDate']");

    public static final Target SELECT_STAGE = Target.the("Select the Stage")
            .locatedBy("//body[1]/div[4]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/records-modal-lwc-detail-panel-wrapper[1]/records-record-layout-event-broker[1]/slot[1]/records-lwc-detail-panel[1]/records-base-record-form[1]/div[1]/div[1]/div[1]/div[1]/records-lwc-record-layout[1]/forcegenerated-detailpanel_opportunity___01222000000qqrnaa2___full___create___recordlayout2[1]/records-record-layout-block[1]/slot[1]/records-record-layout-section[1]/div[1]/div[1]/div[1]/slot[1]/records-record-layout-row[4]/slot[1]/records-record-layout-item[2]/div[1]/span[1]/slot[1]/sfa-input-stage-name[1]/records-record-picklist[1]/records-form-picklist[1]/lightning-picklist[1]/lightning-combobox[1]/div[1]/lightning-base-combobox[1]/div[1]/div[1]/button[1]");

    public static final Target BTN_SAVE = Target.the("Click on the SAVE button")
            .locatedBy("//button[@name='SaveEdit']");











}
