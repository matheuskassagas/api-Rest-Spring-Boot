package org.una.CRUD.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.una.CRUD.domain.Categoria;

@Repository
public interface CategoriaRepositoryJPA extends JpaRepository <Categoria, Integer> {
}
