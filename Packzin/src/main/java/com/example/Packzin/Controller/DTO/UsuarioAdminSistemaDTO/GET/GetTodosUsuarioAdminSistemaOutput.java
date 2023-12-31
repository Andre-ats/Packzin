package com.example.Packzin.Controller.DTO.UsuarioAdminSistemaDTO.GET;

public class GetTodosUsuarioAdminSistemaOutput {
    private String nome;
    private String sobrenome;
    private String email;
    private String cargo;

    public GetTodosUsuarioAdminSistemaOutput(String nome, String sobrenome, String email, String cargo) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.cargo = cargo;
    }

    public GetTodosUsuarioAdminSistemaOutput(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
