package com.example.Packzin.Entity.Usuarios.UsuarioAdminSistema;

import com.example.Packzin.Entity.Usuarios.UsuarioBase.Cargo.Cargo;
import com.example.Packzin.Entity.Usuarios.UsuarioBase.DataNascimento.DataNascimento;
import com.example.Packzin.Entity.Usuarios.UsuarioBase.UsuarioBase;

import javax.persistence.*;

@Entity
@Table(name = "AdminSistema_tb")
public class UsuarioAdminSistema extends UsuarioBase {

    public UsuarioAdminSistema(String nome, String sobrenome, String email, String senha, DataNascimento dataNascimento) {
        super(nome, sobrenome, email, senha, Cargo.UsuarioAdminSistema ,dataNascimento);
    }

    public UsuarioAdminSistema() {
    }
}
