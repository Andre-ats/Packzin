package com.example.Packzin.Controller.Admin.POST;

import com.example.Packzin.Controller.DTO.Mapper.UsuarioAdminSistemaMapper;
import com.example.Packzin.Controller.DTO.UsuarioAdminSistemaDTO.UsuarioAdminSistemaDtoPOST;
import com.example.Packzin.Entity.Usuarios.UsuarioAdminSistema.UsuarioAdminSistema;
import com.example.Packzin.Service.UsuarioAdminSistemaService.POST.UsuarioAdminSistemaServicePOST;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/AdminSistema")
public class UsuarioAdminSistemaControllerPOST {
    @Autowired
    private UsuarioAdminSistemaServicePOST usuarioAdminSistemaServicePOST;

    @PostMapping("/postUsuarioAdminSistema")
    public ResponseEntity<UsuarioAdminSistemaDtoPOST> postUsuarioAdminSistema(@RequestBody UsuarioAdminSistemaDtoPOST usuarioAdminSistemaDtoPOST){
        UsuarioAdminSistema usuarioAdminSistema1 = usuarioAdminSistemaServicePOST.postUsuarioAdminSistema(UsuarioAdminSistemaMapper.toUsuarioAdminSistema(usuarioAdminSistemaDtoPOST));
        return ResponseEntity.status(HttpStatus.CREATED).body(UsuarioAdminSistemaMapper.toUsuarioAdminSistemaDtoPOST(usuarioAdminSistema1));
    }
}
