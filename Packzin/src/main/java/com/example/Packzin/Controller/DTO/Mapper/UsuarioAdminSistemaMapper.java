package com.example.Packzin.Controller.DTO.Mapper;

import com.example.Packzin.Controller.DTO.UsuarioAdminSistemaDTO.GET.GetTodosUsuarioAdminSistemaOutput;
import com.example.Packzin.Controller.DTO.UsuarioAdminSistemaDTO.POST.PostUsuarioAdminSistemaInput;
import com.example.Packzin.Entity.Usuarios.UsuarioAdminSistema.UsuarioAdminSistema;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;


public class UsuarioAdminSistemaMapper {
    public static UsuarioAdminSistema toUsuarioAdminSistema(PostUsuarioAdminSistemaInput postUsuarioAdminSistemaInput){
        return new ModelMapper().map(postUsuarioAdminSistemaInput, UsuarioAdminSistema.class);
    }

    public static PostUsuarioAdminSistemaInput toUsuarioAdminSistemaDtoPOST(UsuarioAdminSistema usuarioAdminSistema){
        return new ModelMapper().map(usuarioAdminSistema, PostUsuarioAdminSistemaInput.class);
    }

    public static GetTodosUsuarioAdminSistemaOutput getTodosUsuarioAdminSistemaOutputtoDTO(UsuarioAdminSistema usuarioAdminSistema){
        return new ModelMapper().map(usuarioAdminSistema, GetTodosUsuarioAdminSistemaOutput.class);
    }

    public static List<GetTodosUsuarioAdminSistemaOutput> toListGetTodosUsuarioAdminSistemaOutput(List<UsuarioAdminSistema> usuarioAdminSistemas){
        return usuarioAdminSistemas.stream().map(usuarioAdminSistema01 -> getTodosUsuarioAdminSistemaOutputtoDTO(usuarioAdminSistema01)).collect(Collectors.toList());
    }
}
