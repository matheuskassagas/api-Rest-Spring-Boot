package org.una.CRUD.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.una.CRUD.domain.Produto;
import org.una.CRUD.resource.request.ProdutoRequest;
import org.una.CRUD.service.ProdutoService;

import java.util.List;
import java.util.Optional;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping(value= "/produtos")
public class ProdutoResource {

    @Autowired
    private ProdutoService produtoService;

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public ResponseEntity<?> find(@PathVariable Integer id){
        Optional<Produto> obj = produtoService.find(id);
        return ResponseEntity.ok().body(obj);
    }

    @RequestMapping(value = "/find", method = RequestMethod.GET)
    public List<Produto> findAll (){
        List<Produto> produtos = produtoService.findAll();
        return produtos;
    }

    @RequestMapping(method = RequestMethod.POST)
    public Produto create (@RequestBody ProdutoRequest produtoRequest) throws Exception {
        return produtoService.create(produtoRequest);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public Produto update (@PathVariable Integer idCategoria, @RequestBody ProdutoRequest produtoRequest) throws Exception {
        produtoRequest.setIdCategoria(idCategoria);
        produtoRequest = (ProdutoRequest) produtoService.updateById(idCategoria, produtoRequest);
        return produtoRequest;
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id){
        produtoService.deleteById(id);
    }


}



