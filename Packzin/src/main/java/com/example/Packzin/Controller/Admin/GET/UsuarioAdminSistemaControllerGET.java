package com.example.Packzin.Controller.Admin.GET;

import com.example.Packzin.Controller.DTO.Mapper.UsuarioAdminSistemaMapper;
import com.example.Packzin.Controller.DTO.UsuarioAdminSistemaDTO.GET.GetTodosUsuarioAdminSistemaOutput;
import com.example.Packzin.Entity.Usuarios.UsuarioAdminSistema.UsuarioAdminSistema;
import com.example.Packzin.Service.UsuarioAdminSistemaService.GET.UsuarioAdminSistemaServiceGET;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/UsuarioAdminSistema")
public class UsuarioAdminSistemaControllerGET {

    @Autowired
    private UsuarioAdminSistemaServiceGET usuarioAdminSistemaGetService;
    @GetMapping("/todosUsuariosAdminSistema")
    public ResponseEntity<List<GetTodosUsuarioAdminSistemaOutput>> getTodosUsuariosAdminSistema(){
        List<UsuarioAdminSistema> usuarioAdminSistemas = usuarioAdminSistemaGetService.getTodosAdminSistema();
        return ResponseEntity.ok(UsuarioAdminSistemaMapper.toListGetTodosUsuarioAdminSistemaOutput(usuarioAdminSistemas));
    }
}

