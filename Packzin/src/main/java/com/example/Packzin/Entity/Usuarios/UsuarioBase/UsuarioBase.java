package com.example.Packzin.Entity.Usuarios.UsuarioBase;

import com.example.Packzin.Entity.Usuarios.UsuarioBase.Cargo.Cargo;
import com.example.Packzin.Entity.Usuarios.UsuarioBase.DataNascimento.DataNascimento;

import javax.persistence.*;


@Entity
@Table(name = "Usuario")
public class UsuarioBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String sobrenome;
    private String email;
    private String senha;
    private Cargo cargo;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dataNascimentoID")
    private DataNascimento dataNascimento;


    public UsuarioBase(String nome, String sobrenome, String email, String senha, Cargo cargo,DataNascimento dataNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.senha = senha;
        this.cargo = cargo;
        this.dataNascimento = dataNascimento;
    }

    public UsuarioBase() {

    }

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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public DataNascimento getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(DataNascimento dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
