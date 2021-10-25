package org.una.CRUD.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.una.CRUD.domain.Produto;
import org.una.CRUD.repository.ProdutoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Optional<Produto> find (Integer id){
        return produtoRepository.findById(id);
    }

    public List<Produto> findAll(){
        return produtoRepository.findAll();
    }

    public Produto create (Produto produto){
        return produtoRepository.create(produto);
    }

    public Produto updateById(Integer id, Produto produto){
        produto.setId(id);
        return produtoRepository.update(id, produto);
    }

    public void deleteById(Integer id){
        produtoRepository.delete(id);
    }
}
