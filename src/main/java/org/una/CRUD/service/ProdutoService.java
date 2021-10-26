package org.una.CRUD.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.una.CRUD.domain.Categoria;
import org.una.CRUD.domain.Produto;
import org.una.CRUD.repository.CategoriaRepository;
import org.una.CRUD.repository.ProdutoRepository;
import org.una.CRUD.resource.request.ProdutoRequest;

import java.util.List;
import java.util.Optional;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Optional<Produto> find (Integer id){
        return produtoRepository.findById(id);
    }

    public List<Produto> findAll(){
        return produtoRepository.findAll();
    }

    public Produto create (ProdutoRequest produtoRequest) throws Exception {
        Optional<Categoria> categoria = categoriaRepository.findById(produtoRequest.getIdCategoria());
        if(categoria.isEmpty()){
            throw new Exception("Id not found");
        }
        Produto produto = new Produto(produtoRequest.getNome(), produtoRequest.getDescricao(), produtoRequest.getPreco(), categoria.get());
        return produtoRepository.create(produto);
    }

    public Produto updateById(Integer idCategoria, ProdutoRequest produtoRequest) throws Exception{
        Optional<Categoria> categoria = categoriaRepository.findById(produtoRequest.getIdCategoria());
        if(categoria.isEmpty()){
            throw new Exception("Id not found");
        }
        Produto produto = new Produto(produtoRequest.getNome(), produtoRequest.getDescricao(), produtoRequest.getPreco(), categoria.get());
        return produtoRepository.update(idCategoria, produto);
    }

    public void deleteById(Integer id){
        produtoRepository.delete(id);
    }
}
