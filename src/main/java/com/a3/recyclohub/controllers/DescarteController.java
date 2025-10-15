package com.a3.recyclohub.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.a3.recyclohub.dto.DescarteDTO;
import com.a3.recyclohub.services.DescarteService;

import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping("/descarte")
public class DescarteController {

	@Autowired
	DescarteService service;
	
	
	@PostMapping
	public ResponseEntity<DescarteDTO> cadastrar(@RequestBody DescarteDTO dto, HttpSession session){
		
		Long usuarioId = (Long) session.getAttribute("usuarioId");
		if(usuarioId == null) {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
		}
		
		DescarteDTO novoDescarte = service.cadastrar(dto, usuarioId);
		return ResponseEntity.status(HttpStatus.CREATED).body(novoDescarte);
	}
	
	
}
