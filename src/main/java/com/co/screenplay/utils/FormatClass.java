package com.co.screenplay.utils;

import javax.swing.*;

public class FormatClass {


    private static String Valor;
    private static String Valor2;


    public static String FormatoQuestion(String Dinero) {

        Valor = Dinero.replace("$", "");
        Valor2 = Valor.replace(".", "");

        return Valor2.trim();
    }
}
