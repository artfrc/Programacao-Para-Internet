package com.ppi.finalWork.repository;

import com.ppi.finalWork.models.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, String> {
}
