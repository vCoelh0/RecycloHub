package com.a3.recyclohub.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.a3.recyclohub.dto.RankingDTO;
import com.a3.recyclohub.services.RankingService;

@RestController
@RequestMapping("/ranking")
public class RankingController {

	@Autowired
	private RankingService service;
	
	@GetMapping
	public List<RankingDTO> listarRanking(){
		return service.listarRanking();
	}
}
