package com.a3.recyclohub.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.a3.recyclohub.dto.UsuarioDTO;
import com.a3.recyclohub.services.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioService service;
	
	@PostMapping
	public UsuarioDTO cadastrar(UsuarioDTO dto) {
		return service.cadastrar(dto);
	}
	
}
