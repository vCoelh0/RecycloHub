package com.a3.recyclohub.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.a3.recyclohub.dto.UsuarioDTO;
import com.a3.recyclohub.entites.Usuario;
import com.a3.recyclohub.entites.perfilUsuario;
import com.a3.recyclohub.entites.repositories.UsuarioRespository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRespository repository;
	
	public UsuarioDTO cadastrar(UsuarioDTO dto) {
		
		Usuario usuario = new Usuario();
		
		usuario.setNome(dto.getNome());
		usuario.setSobrenome(dto.getSobrenome());
		usuario.setEmail(dto.getEmail());
		usuario.setDataNascimento(dto.getDataNascimento());
		usuario.setSenha(dto.getSenha());
		usuario.setPerfil(perfilUsuario.USUARIO);
		
		usuario = repository.save(usuario);
		return new UsuarioDTO(usuario);
				
	}
	
	
	public UsuarioDTO autenticar(String email, String senha) {
		Optional<Usuario> usuario = repository.findByEmail(email);
		
		if(usuario.isPresent() && usuario.get().getSenha().equals(senha)) {
			return new UsuarioDTO(usuario.get());
		} else {
			return null;
		}
		
	}
	
	
}
