package com.ppi.finalWork.controllers;

import com.ppi.finalWork.models.Usuario;
import com.ppi.finalWork.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioRepository ur;
    @RequestMapping(value="/newuser", method = RequestMethod.GET)
    public String form() {
        return "NewUserPage/NewUserPage";
    }

    @RequestMapping(value="/newuser", method = RequestMethod.POST)
    public String form(Usuario usuario) {
        ur.save(usuario);
        return "redirect:/newuser";
    }
}
