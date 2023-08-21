package com.example;

public class Marca {
    private Long marca_id;
    private String nome_marca;
    
    
    
    public Marca(Long marca_id, String nome_marca) {
        this.marca_id = marca_id;
        this.nome_marca = nome_marca;       
    }

    public Marca () {
        this.setMarca_id(0L);
        this.setNome_marca("");
    }
    public Long getMarca_id() {
        return marca_id;
    }
    public void setMarca_id(Long marca_id) {
        this.marca_id = marca_id;
    }
    
    public String getNome_marca() {
        return nome_marca;
    }
    public void setNome_marca(String nome_marca) {
        this.nome_marca = nome_marca;
    }
    


}
