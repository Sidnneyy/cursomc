package com.sidney.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sidney.cursomc.domain.Produtos;

@Repository
public interface ProdutoRepository extends JpaRepository<Produtos, Integer> {

}
