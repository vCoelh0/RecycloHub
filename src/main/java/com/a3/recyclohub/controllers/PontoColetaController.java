package com.a3.recyclohub.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.a3.recyclohub.dto.PontoColetaDTO;
import com.a3.recyclohub.services.PontoColetaService;

@RestController
@RequestMapping("/ponto-coleta")
public class PontoColetaController {

	@Autowired
	private PontoColetaService service;

	@PostMapping
	public PontoColetaDTO cadastrar(@RequestBody PontoColetaDTO dto) {
		return service.cadastrar(dto);
	}
	
	@DeleteMapping("/{id}")
	public void deletar(@PathVariable Long id) {
		service.deletar(id);
	}
	
	@GetMapping
	public List<PontoColetaDTO> listar(){
		return service.listar();
	}
	
	
}
