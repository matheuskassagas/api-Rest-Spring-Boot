package org.una.CRUD.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.una.CRUD.domain.Categoria;
import org.una.CRUD.service.CategoiriaService;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

    @Autowired
    private CategoiriaService categoriaService;

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public ResponseEntity<?> find (@PathVariable Integer id){
        Optional<Categoria> objCategoria = categoriaService.find(id);
        return ResponseEntity.ok().body(objCategoria);
    }

    @RequestMapping(value = "/find", method = RequestMethod.GET)
    public List<Categoria> findAll(){
        List<Categoria> categorias = categoriaService.findAll();
        return categorias;
    }

    @RequestMapping(method = RequestMethod.POST)
    public Categoria create (@RequestBody Categoria categoria){
        return categoriaService.create(categoria);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public Categoria update (@PathVariable Integer id, @RequestBody Categoria categoria){
        categoria.setId(id);
        return categoriaService.updateById(id, categoria);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void delete (@PathVariable Integer id){
        categoriaService.deleteById(id);
    }
}
