package com.example.testingdatabase.controllers;


import com.example.testingdatabase.dao.UsuarioDao;
import com.example.testingdatabase.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping(value = "usuario")
    public Usuario getUsuario(){
        Usuario user = new Usuario();

        user.setId(1);
        user.setUserName("Emanuel");
        user.setUserName("Ema");
        user.setEmail("emanuelsce94@gmail.com");
        user.setPassword("123");

        return user;
    }

    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios(){
        return usuarioDao.getUsuarios();
    }

    @RequestMapping(value = "api/usuarios{id}", method = RequestMethod.DELETE)
    public void eliminar(@PathVariable Long id){
        usuarioDao.eliminar(id);
    }
}
