package org.una.CRUD.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.una.CRUD.domain.Produto;

@Repository
public interface ProdutoRepositoryJPA extends JpaRepository<Produto, Integer> {
}
