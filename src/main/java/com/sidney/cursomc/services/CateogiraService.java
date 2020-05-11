package com.sidney.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sidney.cursomc.domain.Categorias;
import com.sidney.cursomc.repositories.CategoriaRepository;

@Service
public class CateogiraService {
	
	@Autowired
	private CategoriaRepository repo;
	

	public Categorias buscar(Integer id) {
		Optional<Categorias> obj = repo.findById(id);
		return obj.orElse(null);
	}
	
}
