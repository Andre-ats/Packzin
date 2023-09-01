package com.example.Packzin.Service.UsuarioAdminSistemaService.DELETE;

import com.example.Packzin.Entity.Usuarios.UsuarioConsumidor.UsuarioConsumidor;
import com.example.Packzin.Repository.IUsuarioConsumidor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UsuarioAdminSistemaServiceDELETE {
    @Autowired
    private IUsuarioConsumidor iUsuarioConsumidor;

    public void excluirUsuarioConsumidor(UsuarioConsumidor usuarioConsumidor){
        iUsuarioConsumidor.delete(usuarioConsumidor);
    }
}
