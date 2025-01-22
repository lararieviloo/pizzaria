package com.zup.pizzaria.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class ClienteRequestDTO {

    @NotBlank(message = "Por favor, o nome não pode ser vazio ou nulo.")
    private String nome;

    @NotBlank(message = "Por favor, digite um email válido.")
    @Email(message = "Por favor, digite um email válido.")
    private String email;

    @NotBlank(message = "Por favor, o telefone não pode ser vazio ou nulo.")
    @Pattern(regexp = "\\d{8,}", message = "Por favor, o telefone deve conter apenas números e ter no mínimo 8 dígitos.")
    private String telefone;

    public ClienteRequestDTO() {}

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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}