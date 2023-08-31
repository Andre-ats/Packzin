package com.example.Packzin.Controller.DTO.Mapper;

import com.example.Packzin.Controller.DTO.UsuarioAdminSistemaDTO.UsuarioAdminSistemaDtoPOST;
import com.example.Packzin.Entity.Usuarios.UsuarioAdminSistema.UsuarioAdminSistema;
import org.modelmapper.ModelMapper;

public class UsuarioAdminSistemaMapper {
    public static UsuarioAdminSistema toUsuarioAdminSistema(UsuarioAdminSistemaDtoPOST usuarioAdminSistemaDtoPOST){
        return new ModelMapper().map(usuarioAdminSistemaDtoPOST, UsuarioAdminSistema.class);
    }


    public static UsuarioAdminSistemaDtoPOST toUsuarioAdminSistemaDtoPOST(UsuarioAdminSistema usuarioAdminSistema){
        return new ModelMapper().map(usuarioAdminSistema, UsuarioAdminSistemaDtoPOST.class);
    }
}
