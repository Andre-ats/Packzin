package com.example.Packzin.Entity.Usuarios.UsuarioBase.DataNascimento;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "DataNascimento")
public class DataNascimento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dataNascimentoID;
    @NotNull
    private String dia;
    @NotNull
    private String mes;
    @NotNull
    private String ano;

    public DataNascimento(String dia, String mes, String ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public DataNascimento(){

    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
}
