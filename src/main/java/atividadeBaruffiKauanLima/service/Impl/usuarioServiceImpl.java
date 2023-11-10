package atividadeBaruffiKauanLima.service.Impl;

import atividadeBaruffiKauanLima.domain.entitys.Aluno;
import atividadeBaruffiKauanLima.domain.entitys.Usuario;
import atividadeBaruffiKauanLima.service.usuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import atividadeBaruffiKauanLima.domain.repository.usuarios;


@Service
@RequiredArgsConstructor
public class usuarioServiceImpl implements usuarioService{

    @Autowired
    private usuarios usuariosRepository;

    public void salvar(Usuario usuario) {
        usuariosRepository.save(usuario);
    }


}
