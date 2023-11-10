package atividadeBaruffiKauanLima.domain.repository;

import atividadeBaruffiKauanLima.domain.entitys.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface usuarios extends JpaRepository<Usuario, Integer> {
}
