package com.a3.recyclohub.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.a3.recyclohub.dto.RankingDTO;
import com.a3.recyclohub.entites.repositories.UsuarioRespository;

@Service
public class RankingService {

	@Autowired
	private UsuarioRespository repository;
	
	public List<RankingDTO> listarRanking(){
		return repository.findRanking();
	}
	
}
