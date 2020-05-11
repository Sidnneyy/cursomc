package com.sidney.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sidney.cursomc.domain.Categorias;

@Repository
public interface CategoriaRepository extends JpaRepository<Categorias, Integer>{

}
