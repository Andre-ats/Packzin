package com.example.Packzin.Repository;

import com.example.Packzin.Entity.Usuarios.UsuarioAdminSistema.UsuarioAdminSistema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAdminSistemaRepository extends JpaRepository<UsuarioAdminSistema, Long> {
}
