package com.a3.recyclohub.entites.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.a3.recyclohub.dto.RankingDTO;
import com.a3.recyclohub.entites.Usuario;

public interface UsuarioRespository extends JpaRepository<Usuario, Long>  {
	Optional<Usuario> findByEmail(String email);
	
	@Query("SELECT new com.a3.recyclohub.dto.RankingDTO(u.nome, u.pontosVerdes) " +
	           "FROM Usuario u ORDER BY u.pontosVerdes DESC")
	    List<RankingDTO> findRanking();
	
}
