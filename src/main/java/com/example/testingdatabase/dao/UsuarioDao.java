package com.example.testingdatabase.dao;

import com.example.testingdatabase.models.Usuario;

import java.util.List;

public interface UsuarioDao {

    List<Usuario> getUsuarios();

    void eliminar(Long id);
}
