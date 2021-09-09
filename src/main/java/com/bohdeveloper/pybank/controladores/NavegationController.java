package com.bohdeveloper.pybank.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavegationController {
    
/* EMPAQUETAR URL POR SECCIONES ej: /personas/productos */

    @GetMapping("/")
    public String goPrincipal() {
        return "principal";
    }

    @GetMapping("/negocios")
    public String goNegocios() {
        return "negocios";
    }

    @GetMapping("/info_registro")
    public String goInfoRegistroHumano() {
        return "info_registro";
    }

    @GetMapping("/info_registro_negocios")
    public String goInfoRegistroNegocio() {
        return "info_registro_negocios";
    }

    @GetMapping("/registro")
    public String goRegistro() {
        return "registro";
    }

    @GetMapping("/registro_negocio")
    public String goRegistroNegocio() {
        return "registro_negocio";
    }

    @GetMapping("/login")
    public String goLogin() {
        return "login";
    }

    @GetMapping("/validar_login")
    public String goValidarLogin() {
        return "login";
    }

}
