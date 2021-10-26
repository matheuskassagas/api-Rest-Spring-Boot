package org.una.CRUD.resource.request;

import org.una.CRUD.domain.Produto;

public class ProdutoRequest extends Produto {

    private Integer idCategoria;
    private String nome;
    private String descricao;
    private Double preco;

    public ProdutoRequest(){}

    public ProdutoRequest(Integer idCategoria, String nome, String descricao, Double preco) {
        this.idCategoria = idCategoria;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
