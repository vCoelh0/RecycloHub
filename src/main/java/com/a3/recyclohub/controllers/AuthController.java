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
    public ResponseEntity<?> login(@RequestBody LoginDTO loginDto, HttpSession session) {
        UsuarioDTO usuarioDto = service.autenticar(loginDto.getEmail(), loginDto.getSenha());

        if (usuarioDto != null) {
            // Armazena apenas o ID do usuário na sessão
            session.setAttribute("usuarioId", usuarioDto.getId());
            return ResponseEntity.ok(usuarioDto); // Retorna os dados do usuário logado
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                    .body("Email ou senha inválidos.");
        }
    }


    @GetMapping("/usuario-logado")
    public ResponseEntity<?> getUsuarioLogado(HttpSession session) {
        Long usuarioId = (Long) session.getAttribute("usuarioId");

        if (usuarioId != null) {
            UsuarioDTO usuarioDto = service.buscarPorId(usuarioId);
            return ResponseEntity.ok(usuarioDto);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                    .body("Nenhum usuário logado.");
        }
    }

    
    @PostMapping("/logout")
    public ResponseEntity<?> logout(HttpSession session) {
        session.invalidate();
        return ResponseEntity.ok("Sessão encerrada com sucesso.");
    }
}
	

