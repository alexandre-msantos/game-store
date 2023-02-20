package com.generation.lojagames.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = ("tb_produto"))
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String marca;
    private String descricao;
    private Integer qntd;
    private BigDecimal preco;

    @ManyToOne
    @JsonIgnoreProperties(value = "produto")
    private Categoria categoria;

    public Produto() {
    }

    public Produto(Long id, String nome, String marca, String descricao, Integer qntd, BigDecimal preco) {
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.descricao = descricao;
        this.qntd = qntd;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setQntd(Integer qntd) {
        this.qntd = qntd;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
