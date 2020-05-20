package com.mycompany.builder;


public class ProdutoBuilder {

    private long id;
    private String titulo;
    private String descricao;
    private String marca;
    private String modelo;
    private String categoria;

    public ProdutoBuilder() {
    }

    public ProdutoBuilder id(long id) {
        this.id = id;
        return this;
    }

    public ProdutoBuilder titulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public ProdutoBuilder descricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public ProdutoBuilder marca(String marca) {
        this.marca = marca;
        return this;
    }

    public ProdutoBuilder modelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public ProdutoBuilder setCategoria(String categoria) {
        this.categoria = categoria;
        return this;
    }

    public Produto createProduto() {
        return new Produto(id, titulo, descricao, marca, modelo, categoria);
    }
    
}
