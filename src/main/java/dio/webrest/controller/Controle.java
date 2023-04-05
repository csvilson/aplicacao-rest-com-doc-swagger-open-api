package dio.webrest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controle {

    @GetMapping
    public String retorno(){
        return "Testando meu projeto com REST";
    }
}
