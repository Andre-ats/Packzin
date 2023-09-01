package com.example.Packzin.Controller.Admin.DELETE;

import com.example.Packzin.Entity.Usuarios.UsuarioConsumidor.UsuarioConsumidor;
import com.example.Packzin.Service.UsuarioAdminSistemaService.DELETE.UsuarioAdminSistemaServiceDELETE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/AdminSistema")
public class UsuarioAdminSistemaControllerDELETE {

    @Autowired
    private UsuarioAdminSistemaServiceDELETE usuarioAdminSistemaServiceDELETE;

    @DeleteMapping("/deleteUsuarioConsumidor")
    public ResponseEntity<String> excluirUsuarioConsumidor(@RequestBody UsuarioConsumidor usuarioConsumidor){
        usuarioAdminSistemaServiceDELETE.excluirUsuarioConsumidor(usuarioConsumidor);
        return ResponseEntity.ok("Usuário consumidor excluído com sucesso.");
    }
}
