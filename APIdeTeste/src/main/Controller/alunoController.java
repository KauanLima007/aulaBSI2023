package Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/aluno")
public class alunoController {

    @GetMapping("Teste")
    public String teste(){

        return "HELLO WORLD";
    }
}
