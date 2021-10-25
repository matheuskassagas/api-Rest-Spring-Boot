package org.una.CRUD.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.una.CRUD.domain.Categoria;

import java.util.List;
import java.util.Optional;

@Component
public class CategoriaRepository {

    @Autowired
    private CategoriaRepositoryJPA categoriaRepositoryJPA;

    public Optional<Categoria> findById(Integer id){
        return categoriaRepositoryJPA.findById(id);
    }

    public List<Categoria> findAll(){
        return categoriaRepositoryJPA.findAll();
    }

    public Categoria create (Categoria categoria){
        return categoriaRepositoryJPA.save(categoria);
    }

    public Categoria update (Integer id, Categoria categoria){
        categoria.setId(id);
        return categoriaRepositoryJPA.save(categoria);
    }

    public void delete(Integer id){
        categoriaRepositoryJPA.deleteById(id);
    }
}
