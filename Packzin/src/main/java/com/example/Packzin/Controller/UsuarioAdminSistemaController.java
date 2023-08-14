package com.example.Packzin.Controller;

import com.example.Packzin.Entity.Usuarios.UsuarioAdminSistema.UsuarioAdminSistema;
import com.example.Packzin.Entity.Usuarios.UsuarioBase.Cargo.Cargo;
import com.example.Packzin.Repository.IAdminSistemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/UsuarioAdminSistema")
public class UsuarioAdminSistemaController {

    @Autowired
    private IAdminSistemaRepository adminSistemaRepository;

    @GetMapping("/todosUsuarios")
    public ResponseEntity getTodosUsuarios(){
        var todosUsuarios = adminSistemaRepository.findAll();
        return ResponseEntity.ok(todosUsuarios);
    }
}
