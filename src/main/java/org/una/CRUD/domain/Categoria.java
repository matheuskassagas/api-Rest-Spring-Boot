package org.una.CRUD.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Categoria implements Serializable {
    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String descricao;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "categoria")
    private List<Produto> produtos = new ArrayList<>();

    public Categoria(){}

    public Categoria(Integer id, String nome, String descricao, List<Produto> produtos) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.produtos = produtos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Categoria categoria = (Categoria) o;
        return getId().equals(categoria.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
