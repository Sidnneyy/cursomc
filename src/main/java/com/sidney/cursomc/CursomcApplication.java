package com.sidney.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sidney.cursomc.domain.Categorias;
import com.sidney.cursomc.domain.Produtos;
import com.sidney.cursomc.repositories.CategoriaRepository;
import com.sidney.cursomc.repositories.ProdutoRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner{

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private ProdutoRepository produtoReposistory;
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categorias cat1 = new Categorias(null, "Sala");
		Categorias cat2 = new Categorias(null, "Quarto");
		Categorias cat3 = new Categorias(null, "Galpão");
		
		Produtos p1 = new Produtos(null, "Computador", 2000.00);
		Produtos p2 = new Produtos(null, "Impressora", 800.00);
		Produtos p3 = new Produtos(null, "Mouse", 80.00);
		
		cat1.getProdutos().addAll(Arrays.asList(p1,p2,p3));
		cat2.getProdutos().addAll(Arrays.asList(p2));
		
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1,cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		produtoReposistory.saveAll(Arrays.asList(p1,p2,p3));
	}

}
