
package com.example;

public class Produto {
    
    private Long id;
    private String nome;
    private Marca marca;
    private double preco;
    
    public Produto(Long id, String nome, Marca marca, double preço) {
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
    }

    public Produto () {
        this.setId(0L);
        this.setNome("ÏNDEFINIDO");
        this.setMarca(new Marca());
        this.setPreco(0.00);
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
    public Marca getMarca() {
        return marca;
    }
    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    } 




}
