package atividadeBaruffi.service.Impl;

import atividadeBaruffi.domain.entitys.Aluno;
import lombok.RequiredArgsConstructor;
import atividadeBaruffi.service.alunoService;
import atividadeBaruffi.domain.repository.alunos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class alunoServiceImpl implements alunoService {

    @Autowired
    private alunos alunosRepository;
    public Aluno salvar(Aluno aluno)
    {
        return alunosRepository.save(aluno);
    }

    public void excluir(int id)
    {
        alunosRepository.deleteById(id);
    }
    public Optional<Aluno> buscar(int id)
    {
        return alunosRepository.findById(id);
    }

    public List<Aluno> buscarTodos()
    {
        return alunosRepository.findAll();
    }

}
