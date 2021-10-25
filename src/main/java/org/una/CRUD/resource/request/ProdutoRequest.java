package org.una.CRUD.resource.request;

public class ProdutoRequest {

    private Integer idCategoria;
    private String nome;
    private String descricao;
    private Double preco;

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
}
