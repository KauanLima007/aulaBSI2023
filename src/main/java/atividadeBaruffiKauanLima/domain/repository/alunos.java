package atividadeBaruffiKauanLima.domain.repository;

import atividadeBaruffiKauanLima.domain.entitys.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface alunos extends JpaRepository<Aluno, Integer> {
}
