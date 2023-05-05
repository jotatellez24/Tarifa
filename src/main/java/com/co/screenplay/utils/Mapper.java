package com.co.screenplay.utils;

import com.co.screenplay.models.OportunidadMetodo;

public class Mapper {

    public static OportunidadMetodo OportunidadMapper(Object[] data) {
        OportunidadMetodo o = new OportunidadMetodo();
        o.setCuenta(data[0].toString());
        o.setCantAsegurados((Double)data[1]);
        o.setNivelRiesgo(data[2].toString());
        o.setFraccionamiento(data[3].toString());
        o.setSaBasico((Double)data[4]);
        o.setSaItp((Double)data[5]);
        o.setSaPo((Double)data[6]);
        o.setSaRdHa((Double)data[7]);
        o.setSaRdItA((Double)data[8]);
        o.setSaGm((Double)data[9]);
        o.setPrimaBasico((Double)data[10]);
        o.setPrimaItp((Double)data[11]);
        o.setPrimaPo((Double)data[12]);
        o.setPrimaRdHa((Double)data[13]);
        o.setPrimaRdItA((Double)data[14]);
        o.setPrimaGm((Double)data[15]);
        o.setPrimaTotalAnualPorAsegurado((Double)data[16]);
        o.setPrimaFraccionadaPorAsegurado((Double)data[17]);
        o.setPrimaAnualTotal((Double)data[18]);
        o.setPrimaFraccionadaTotal((Double)data[19]);
        o.setPlan(data[20].toString());
        o.setEstado(data[21].toString());
        o.setExpressionprimaAnualTotal(data[22].toString());
        o.setExpressionprimaFraccionadaTotal(data[23].toString());

        return o;
    }
}
