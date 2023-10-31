package atividadeBaruffi.service;

import atividadeBaruffi.domain.entitys.Aluno;

import java.util.*;

public interface alunoService {

    Aluno salvar(Aluno aluno);
    void excluir(int id);
    Optional<Aluno> buscar(int id);
    List<Aluno> buscarTodos();

}
