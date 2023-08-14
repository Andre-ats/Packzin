package com.example.Packzin.Controller;

import com.example.Packzin.Entity.Usuarios.UsuarioAdminSistema.UsuarioAdminSistema;
import com.example.Packzin.Entity.Usuarios.UsuarioBase.Cargo.Cargo;
import com.example.Packzin.Repository.IAdminSistemaRepository;
import com.example.Packzin.Repository.IUsuarioBaseRespository;
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
    @Autowired
    private IUsuarioBaseRespository usuarioBaseRespository;

    @GetMapping("/todosUsuarios")
    public ResponseEntity getTodosUsuarios(){
        var todosUsuarios = usuarioBaseRespository.findAll();
        return ResponseEntity.ok(todosUsuarios);
    }
}
