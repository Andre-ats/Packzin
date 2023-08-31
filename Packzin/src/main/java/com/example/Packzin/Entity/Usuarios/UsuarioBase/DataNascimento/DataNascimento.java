package com.example.Packzin.Entity.Usuarios.UsuarioBase.DataNascimento;

import jakarta.persistence.*;


@Entity
@Table(name = "DataNascimento")
public class DataNascimento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long dataNascimentoID;
    private String dia;
    private String mes;
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
