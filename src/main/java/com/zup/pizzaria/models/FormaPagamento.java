package com.zup.pizzaria.models;

public enum FormaPagamento {
    
    CREDITO("Crédito"),
    DEBITO("Débito"),
    DINHEIRO("Dinheiro"),
    PIX("PIX");

    private final String formaPagamento;

    FormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getFormaPagamento(){
        return formaPagamento;
    }
}