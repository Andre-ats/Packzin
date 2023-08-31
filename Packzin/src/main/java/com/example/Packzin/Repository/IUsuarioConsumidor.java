package com.example.Packzin.Repository;

import com.example.Packzin.Entity.Usuarios.UsuarioConsumidor.UsuarioConsumidor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioConsumidor extends JpaRepository<UsuarioConsumidor, Long> {
}
