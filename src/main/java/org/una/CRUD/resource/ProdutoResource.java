package org.una.CRUD.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.una.CRUD.domain.Produto;
import org.una.CRUD.service.ProdutoService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoResource {

    @Autowired
    private ProdutoService produtoService;

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public ResponseEntity<?> find (@PathVariable Integer id){
        Optional<Produto> objProduto = produtoService.find(id);
        return ResponseEntity.ok().body(objProduto);
    }

    @RequestMapping(value = "/find", method = RequestMethod.GET)
    public List<Produto> findAll(){
        List<Produto> produto = produtoService.findAll();
        return produto;
    }

    @RequestMapping(method = RequestMethod.POST)
    public Produto create (@RequestBody Produto produto){
        return produtoService.create(produto);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public Produto update (@PathVariable Integer id, @RequestBody Produto produto){
        produto.setId(id);
        return produtoService.updateById(id, produto);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void delete (@PathVariable Integer id){
        produtoService.deleteById(id);
    }
}


