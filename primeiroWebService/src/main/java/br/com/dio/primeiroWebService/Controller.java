package br.com.dio.primeiroWebService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    private String mensagem(){
        return "Primeiro projeto rodando!";
    }
}
