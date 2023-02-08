package com.ppi.finalWork.controllers;

import com.ppi.finalWork.models.Usuario;
import com.ppi.finalWork.repository.UsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioRepository ur;

    @GetMapping(value="/newuser")
    public String form() {
        return "NewUserPage/NewUserPage";
    }

    @PostMapping(value="/newuser")
    public String form(@Valid Usuario usuario, BindingResult result, RedirectAttributes attributes) {
        if(result.hasErrors()) {
            attributes.addFlashAttribute("mensagem", "Verifique os campos!");
            return "redirect:/newuser";
        }
        ur.save(usuario);
        return "redirect:/";
    }

    @PostMapping(value="/")
    public String login(){
        return "redirect:/tl";
    }
}
