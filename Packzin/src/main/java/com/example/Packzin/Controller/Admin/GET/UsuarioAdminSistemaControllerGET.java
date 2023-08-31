package com.example.Packzin.Controller.Admin.GET;

import com.example.Packzin.Service.UsuarioAdminSistemaService.GET.UsuarioAdminSistemaServiceGET;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/UsuarioAdminSistema")
public class UsuarioAdminSistemaControllerGET {

    @Autowired
    private UsuarioAdminSistemaServiceGET usuarioAdminSistemaGetService;
    @GetMapping("/todosUsuarios")
    public ResponseEntity getTodosUsuarios(){
        var todosUsuarios = usuarioAdminSistemaGetService.getTodosAdminSistema();
        return ResponseEntity.ok(todosUsuarios);
    }
}

