package com.example.Packzin.Entity.Usuarios.UsuarioConsumidor;

import com.example.Packzin.Entity.Usuarios.UsuarioBase.Cargo.Cargo;
import com.example.Packzin.Entity.Usuarios.UsuarioBase.DataNascimento.DataNascimento;
import com.example.Packzin.Entity.Usuarios.UsuarioBase.UsuarioBase;

import jakarta.persistence.*;


@Entity
@Table(name = "UsuarioConsumidor_tb")
public class UsuarioConsumidor extends UsuarioBase {
    public UsuarioConsumidor(String nome, String sobrenome, String email, String senha, DataNascimento dataNascimento) {
        super(nome, sobrenome, email, senha, Cargo.UsuarioConsumidor, dataNascimento);
    }

    public UsuarioConsumidor() {
    }
}
