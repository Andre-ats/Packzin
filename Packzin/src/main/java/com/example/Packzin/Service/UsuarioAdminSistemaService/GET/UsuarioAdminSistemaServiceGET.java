package com.example.Packzin.Service.UsuarioAdminSistemaService.GET;

import com.example.Packzin.Entity.Usuarios.UsuarioAdminSistema.UsuarioAdminSistema;
import com.example.Packzin.Repository.IAdminSistemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioAdminSistemaServiceGET {

    @Autowired
    private IAdminSistemaRepository iAdminSistemaRepository;

    public ResponseEntity<List<UsuarioAdminSistema>> getTodosAdminSistema(){
        List<UsuarioAdminSistema> usuarioAdminSistema = iAdminSistemaRepository.findAll();
        return ResponseEntity.ok().body(usuarioAdminSistema);
    }
}
