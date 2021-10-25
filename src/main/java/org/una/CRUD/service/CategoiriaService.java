package org.una.CRUD.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.una.CRUD.domain.Categoria;
import org.una.CRUD.repository.CategoriaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CategoiriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Optional<Categoria> find (Integer id){
        return categoriaRepository.findById(id);
    }

    public List<Categoria> findAll(){
        return categoriaRepository.findAll();
    }

    public Categoria create(Categoria categoria){
        return categoriaRepository.create(categoria);
    }

    public Categoria updateById (Integer id, Categoria categoria){
        categoria.setId(id);
        return categoriaRepository.update(id, categoria);
    }

    public void deleteById(Integer id){
        categoriaRepository.delete(id);
    }
}
