package com.example.Packzin.Repository;

import com.example.Packzin.Entity.Usuarios.UsuarioBase.UsuarioBase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioBaseRespository extends JpaRepository<UsuarioBase, Long> {
}
