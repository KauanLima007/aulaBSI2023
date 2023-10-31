package atividadeBaruffi.domain.repository;

import atividadeBaruffi.domain.entitys.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface alunos extends JpaRepository<Aluno, Integer> {
}
