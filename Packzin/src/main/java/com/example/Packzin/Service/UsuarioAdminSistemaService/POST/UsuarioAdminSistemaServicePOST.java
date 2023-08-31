package com.example.Packzin.Service.UsuarioAdminSistemaService.POST;

import com.example.Packzin.Entity.Usuarios.UsuarioAdminSistema.UsuarioAdminSistema;
import com.example.Packzin.Repository.IAdminSistemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UsuarioAdminSistemaServicePOST {

    @Autowired
    private IAdminSistemaRepository iAdminSistemaRepository;

    public UsuarioAdminSistema postUsuarioAdminSistema(UsuarioAdminSistema usuarioAdminSistema){
        UsuarioAdminSistema usuarioAdminSistema1 = iAdminSistemaRepository.save(usuarioAdminSistema);
        return usuarioAdminSistema1;
    }

}
