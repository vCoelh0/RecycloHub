package com.a3.recyclohub.entites.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.a3.recyclohub.entites.Usuario;

public interface UsuarioRespository extends JpaRepository<Usuario, Long>  {
	Optional<Usuario> findByEmail(String email);
}
