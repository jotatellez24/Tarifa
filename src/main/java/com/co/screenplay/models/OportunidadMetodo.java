package com.co.screenplay.models;

public class OportunidadMetodo {
    private String cuenta;
    private double cantAsegurados;
    private String nivelRiesgo;
    private String fraccionamiento;
    private double saBasico;
    private double saItp;
    private double saPo;
    private double saRdHa;
    private double saRdItA;
    private double saGm;
    private double primaBasico;
    private double primaItp;
    private double primaPo;
    private double primaRdHa;
    private double primaRdItA;
    private double primaGm;
    private double primaTotalAnualPorAsegurado;
    private double primaFraccionadaPorAsegurado;
    private double primaAnualTotal;
    private double primaFraccionadaTotal;

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    private String Estado;


    private String Plan;

    public OportunidadMetodo() {
    }

    // Constructor
    public OportunidadMetodo(String cuenta, double cantAsegurados, String nivelRiesgo, String fraccionamiento,
                             double saBasico, double saItp, double saPo, double saRdHa, double saRdItA, double saGm,
                             double primaBasico, double primaItp, double primaPo, double primaRdHa, double primaRdItA,
                             double primaGm, double primaTotalAnualPorAsegurado, double primaFraccionadaPorAsegurado,
                             double primaAnualTotal, double primaFraccionadaTotal,String plan,String estado) {
        this.cuenta = cuenta;
        this.cantAsegurados = cantAsegurados;
        this.nivelRiesgo = nivelRiesgo;
        this.fraccionamiento = fraccionamiento;
        this.setSaBasico(saBasico);
        this.setSaItp(saItp);
        this.setSaPo(saPo);
        this.setSaRdHa(saRdHa);
        this.setSaRdItA(saRdItA);
        this.setSaGm(saGm);
        this.setPrimaBasico(primaBasico);
        this.setPrimaItp(primaItp);
        this.setPrimaPo(primaPo);
        this.setPrimaRdHa(primaRdHa);
        this.setPrimaRdItA(primaRdItA);
        this.setPrimaGm(primaGm);
        this.setPrimaTotalAnualPorAsegurado(primaTotalAnualPorAsegurado);
        this.setPrimaFraccionadaPorAsegurado(primaFraccionadaPorAsegurado);
        this.setPrimaAnualTotal(primaAnualTotal);
        this.setPrimaFraccionadaTotal(primaFraccionadaTotal);
        this.Plan = plan;
        this.Estado =estado;
    }

    public void setFraccionamiento(String fraccionamiento) {
        this.fraccionamiento = fraccionamiento;
    }
    // Getters y setters

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getCantAsegurados() {
        return cantAsegurados;
    }

    public void setCantAsegurados(double cantAsegurados) {
        this.cantAsegurados = cantAsegurados;
    }

    public String getNivelRiesgo() {
        return nivelRiesgo;
    }

    public void setNivelRiesgo(String nivelRiesgo) {
        this.nivelRiesgo = nivelRiesgo;
    }

    public String getFraccionamiento() {
        return fraccionamiento;
    }

    public double getPrimaFraccionadaTotal() {
        return primaFraccionadaTotal;
    }

    public void setPrimaFraccionadaTotal(double primaFraccionadaTotal) {
        this.primaFraccionadaTotal = primaFraccionadaTotal;
    }

    public double getSaBasico() {
        return saBasico;
    }

    public void setSaBasico(double saBasico) {
        this.saBasico = saBasico;
    }

    public double getSaItp() {
        return saItp;
    }

    public void setSaItp(double saItp) {
        this.saItp = saItp;
    }

    public double getSaPo() {
        return saPo;
    }

    public void setSaPo(double saPo) {
        this.saPo = saPo;
    }

    public double getSaRdHa() {
        return saRdHa;
    }

    public void setSaRdHa(double saRdHa) {
        this.saRdHa = saRdHa;
    }

    public double getSaRdItA() {
        return saRdItA;
    }

    public void setSaRdItA(double saRdItA) {
        this.saRdItA = saRdItA;
    }

    public double getSaGm() {
        return saGm;
    }

    public void setSaGm(double saGm) {
        this.saGm = saGm;
    }

    public double getPrimaBasico() {
        return primaBasico;
    }

    public void setPrimaBasico(double primaBasico) {
        this.primaBasico = primaBasico;
    }

    public double getPrimaItp() {
        return primaItp;
    }

    public void setPrimaItp(double primaItp) {
        this.primaItp = primaItp;
    }

    public double getPrimaPo() {
        return primaPo;
    }

    public void setPrimaPo(double primaPo) {
        this.primaPo = primaPo;
    }

    public double getPrimaRdHa() {
        return primaRdHa;
    }

    public void setPrimaRdHa(double primaRdHa) {
        this.primaRdHa = primaRdHa;
    }

    public double getPrimaRdItA() {
        return primaRdItA;
    }

    public void setPrimaRdItA(double primaRdItA) {
        this.primaRdItA = primaRdItA;
    }

    public double getPrimaGm() {
        return primaGm;
    }

    public void setPrimaGm(double primaGm) {
        this.primaGm = primaGm;
    }

    public double getPrimaTotalAnualPorAsegurado() {
        return primaTotalAnualPorAsegurado;
    }

    public void setPrimaTotalAnualPorAsegurado(double primaTotalAnualPorAsegurado) {
        this.primaTotalAnualPorAsegurado = primaTotalAnualPorAsegurado;
    }

    public double getPrimaFraccionadaPorAsegurado() {
        return primaFraccionadaPorAsegurado;
    }

    public void setPrimaFraccionadaPorAsegurado(double primaFraccionadaPorAsegurado) {
        this.primaFraccionadaPorAsegurado = primaFraccionadaPorAsegurado;
    }

    public double getPrimaAnualTotal() {
        return primaAnualTotal;
    }

    public void setPrimaAnualTotal(double primaAnualTotal) {
        this.primaAnualTotal = primaAnualTotal;
    }

    public String getPlan() {
        return Plan;
    }

    public void setPlan(String plan) {
        Plan = plan;
    }
}
