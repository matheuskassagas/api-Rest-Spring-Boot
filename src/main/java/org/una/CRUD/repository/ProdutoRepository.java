package org.una.CRUD.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.una.CRUD.domain.Produto;

import java.util.List;
import java.util.Optional;

@Component
public class ProdutoRepository {

    @Autowired
    private ProdutoRepositoryJPA produtoRepositoryJPA;

    public Optional<Produto> findById (Integer id){
        return produtoRepositoryJPA.findById(id);
    }

    public List<Produto> findAll (){
        return produtoRepositoryJPA.findAll();
    }

    public Produto create(Produto produto){
        return produtoRepositoryJPA.save(produto);
    }

    public Produto update (Integer idCategoria, Produto produto){
        produto.setId(idCategoria);
        return produtoRepositoryJPA.save(produto);
    }

    public void delete(Integer id){
        produtoRepositoryJPA.deleteById(id);
    }
}
