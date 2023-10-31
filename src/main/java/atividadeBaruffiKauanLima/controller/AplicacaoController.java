package atividadeBaruffiKauanLima.controller;

import atividadeBaruffiKauanLima.domain.repository.alunos;
import atividadeBaruffiKauanLima.domain.entitys.Aluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("api/aluno")
public class AplicacaoController {

    private alunos alunosRepository;
    @Autowired
    private atividadeBaruffiKauanLima.service.alunoService alunoService;
    public AplicacaoController(alunos alunosRepository) {
        this.alunosRepository = alunosRepository;
    }
    @GetMapping("TESTE")
    public String Hello()
    {
        return  "HELLO WORLD";
    }

    @GetMapping
    @Operation(
            method = "GET",
            description = "Lista todos os alunos cadastrados",
            summary = "Sumario",
            tags = "/api/aluno")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<Aluno> find()
    {
        return alunoService.buscarTodos();
    }
    @GetMapping(value = "{id}")
    @Operation(
            method = "GET",
            description = "Lista um aluno cadastrado",
            summary = "Sumario",
            tags = "/api/aluno/id")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Optional<Aluno> findById(@PathVariable int id)
    {
        return alunoService.buscar(id);
    }
    @DeleteMapping(value = "{id}")
    @Operation(
            method = "DELETE",
            description = "Deleta um aluno cadastrado",
            summary = "Sumario",
            tags = "/api/aluno/id")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void delete(@PathVariable int id)
    {
        alunoService.excluir(id);
    }
    @PostMapping
    @Operation(
            method = "POST",
            description = "Salva um novo aluno",
            summary = "Sumario",
            tags = "/api/aluno")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Aluno salvar(@RequestBody Aluno aluno)
    {
        return alunoService.salvar(aluno);
    }
    @PutMapping
    @Operation(
            method = "PUT",
            description = "Atualiza um aluno existente",
            summary = "Sumario",
            tags = "/api/aluno/id")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Aluno editar(@RequestBody Aluno aluno)
    {
        return alunoService.salvar(aluno);
    }

}
