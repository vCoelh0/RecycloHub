package com.a3.recyclohub.entites;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private String sobrenome;
	
	@Column(unique = true)
	private String email; 
	
	private LocalDate dataNascimento;
	private String senha;
	
	@Enumerated(EnumType.STRING)
	private perfilUsuario perfil;
	private int pontosVerdes;
	
	
	
	// =============  CONSTRUTTORES, GETTERS E SETTERS =============

	public Usuario() {
		
	}	


	public Usuario(Long id, String nome, String sobrenome, String email, LocalDate dataNascimento, String senha,
			perfilUsuario perfil, int pontosVerdes) {
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.senha = senha;
		this.perfil = perfil;
		this.pontosVerdes = pontosVerdes;
	}


	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getSobrenome() {
		return sobrenome;
	}



	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public LocalDate getDataNascimento() {
		return dataNascimento;
	}



	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}



	public String getSenha() {
		return senha;
	}



	public void setSenha(String senha) {
		this.senha = senha;
	}



	public perfilUsuario getPerfil() {
		return perfil;
	}



	public void setPerfil(perfilUsuario perfil) {
		this.perfil = perfil;
	}



	public int getPontosVerdes() {
		return pontosVerdes;
	}



	public void setPontosVerdes(int pontosVerdes) {
		this.pontosVerdes = pontosVerdes;
	}
	
	
	
	
	
	
}
