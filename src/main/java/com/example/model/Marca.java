package com.example.model;

public class Marca {
    private int marca_id;
    private String nome_marca;
    
    
    
    public Marca(int marca_id, String nome_marca) {
        this.marca_id = marca_id;
        this.nome_marca = nome_marca;       
    }

    public Marca () {
        this.setMarca_id(0);
        this.setNome_marca("");
    }
    public int getMarca_id() {
        return marca_id;
    }
    public void setMarca_id(int marca_id) {
        this.marca_id = marca_id;
    }
    
    public String getNome_marca() {
        return nome_marca;
    }
    public void setNome_marca(String nome_marca) {
        this.nome_marca = nome_marca;
    }
    


}
