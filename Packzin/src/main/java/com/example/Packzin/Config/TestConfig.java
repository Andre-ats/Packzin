package com.example.Packzin.Config;

import com.example.Packzin.Entity.Usuarios.UsuarioAdminSistema.UsuarioAdminSistema;
import com.example.Packzin.Entity.Usuarios.UsuarioBase.Cargo.Cargo;
import com.example.Packzin.Entity.Usuarios.UsuarioBase.DataNascimento.DataNascimento;
import com.example.Packzin.Entity.Usuarios.UsuarioBase.UsuarioBase;
import com.example.Packzin.Entity.Usuarios.UsuarioConsumidor.UsuarioConsumidor;
import com.example.Packzin.Repository.IAdminSistemaRepository;
import com.example.Packzin.Repository.IUsuarioConsumidor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class TestConfig implements CommandLineRunner {
    @Autowired
    private IAdminSistemaRepository adminSistemaRepository;
    @Autowired
    private IUsuarioConsumidor usuarioConsumidor;

    @Override
    public void run(String... args) throws Exception {
        UsuarioAdminSistema adm1 =
                new UsuarioAdminSistema("Andre", "Alves", "andre@gmail.com", "123",
                new DataNascimento("05", "04", "2003")
        );
        UsuarioAdminSistema adm2 =
                new UsuarioAdminSistema("Astolfo", "Dutra", "Astolfo@gmail.com", "123",
                new DataNascimento("22", "10", "2003")
        );
        UsuarioConsumidor usr01 =
                new UsuarioConsumidor("Ivan","Alves","Ivan@gmail.com","123",
                new DataNascimento("06","08","2003")
        );
        UsuarioConsumidor usr02 =
                new UsuarioConsumidor("Joao","Humberto","Joao@gmail.com","123",
                new DataNascimento("22","11","2003")
        );

        adminSistemaRepository.saveAll(Arrays.asList(adm1, adm2));
        usuarioConsumidor.saveAll(Arrays.asList(usr01, usr02));

    }
}
