package com.zup.pizzaria.dtos;

public class PedidoDTO {
    private String nome;
    private String email;
    private String descricaoPedido;
    private double valorTotalPedido;

    public PedidoDTO(String nome, String email, String descricaoPedido, double valorTotalPedido) {
        this.nome = nome;
        this.email = email;
        this.descricaoPedido = descricaoPedido;
        this.valorTotalPedido = valorTotalPedido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescricaoPedido() {
        return descricaoPedido;
    }

    public void setDescricaoPedido(String descricaoPedido) {
        this.descricaoPedido = descricaoPedido;
    }

    public double getValorTotalPedido() {
        return valorTotalPedido;
    }

    public void setValorTotalPedido(double valorTotalPedido) {
        this.valorTotalPedido = valorTotalPedido;
    }
}
