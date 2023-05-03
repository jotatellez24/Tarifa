package com.co.screenplay.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static final Target TXT_USERNAME = Target.the("Enter the username")
            .locatedBy("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/div[1]/div/input[1]");
    public static final Target TXT_PASSWORD = Target.the("Enter the password")
            .locatedBy("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/input[1]");
    public static final Target BTN_LOGIN = Target.the("Click on button log in")
            .locatedBy("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/input[2]");






}
