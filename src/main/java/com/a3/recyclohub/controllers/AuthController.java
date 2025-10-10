package com.a3.recyclohub.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.a3.recyclohub.dto.LoginDTO;
import com.a3.recyclohub.dto.UsuarioDTO;
import com.a3.recyclohub.services.UsuarioService;

import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping("/auth")
public class AuthController {

	@Autowired
	private UsuarioService service;
	
	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody LoginDTO loginDto, HttpSession session){
		UsuarioDTO usuarioDto = service.autenticar(loginDto.getEmail(), loginDto.getSenha());
		
		if(usuarioDto != null) {
			session.setAttribute("Usuario Logado", usuarioDto);
			return ResponseEntity.ok(usuarioDto);
		} else {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Email ou senha invalidos");
		}
	}
	
	@GetMapping("/usuario-logado")
	public ResponseEntity<?> getUsuarioLogado(HttpSession session){
		UsuarioDTO usuarioDto = (UsuarioDTO) session.getAttribute("Usuario Logado");
		if(usuarioDto != null) {
			return ResponseEntity.ok(usuarioDto);
		} else {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Nenhum usuario logado");
		}
	}
	
	@PostMapping("/logout")
	public ResponseEntity<?> logout (HttpSession session){
		session.invalidate();
		return ResponseEntity.ok("Sessão encerrada com sucesso");
	}
	
}
