package com.example.aula.aula3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //diz que essa classe responde a http e faz json, não uma página da web
@RequestMapping("/ola-mundo") // determino o prefixo pra acessar todas as rotas dessa classe

public class Ola_Mundo_Controler {
    @GetMapping //chama o metodo quando o verbo é GET
    public String ola_mundo(){
        return "Ola Mundo";
    }
    @GetMapping
    public String canjiquinha(){
        return "Vem mamae Dengo";
    }

}
