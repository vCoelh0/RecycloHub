package com.a3.recyclohub.dto;

import java.time.LocalDate;

import com.a3.recyclohub.entites.Usuario;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class UsuarioDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private String sobrenome;
	private String email; 
	private LocalDate dataNascimento;
	private String senha;
	
	
	
	// =============  CONSTRUTTORES, GETTERS E SETTERS =============

	public UsuarioDTO() {
		
	}
	
	public UsuarioDTO(Long id, String nome, String sobrenome, String email, LocalDate dataNascimento, String senha) {
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.senha = senha;
	}
	
	public UsuarioDTO(Usuario entity) {
		id = entity.getId();
		nome = entity.getNome();
		sobrenome = entity.getSobrenome();
		email = entity.getEmail();
		dataNascimento = entity.getDataNascimento();
		senha = entity.getSenha();			
	}
	
	
	public Long getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public String getEmail() {
		return email;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public String getSenha() {
		return senha;
	}
	
	
	
}
