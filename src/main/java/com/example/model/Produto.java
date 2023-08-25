
package com.example.model;

public class Produto {
    
    private int id;
    private String nome;
    private Marca marca;
    private double preco;
    
    public Produto(int id, String nome, Marca marca, double preco) {
        this.setId(id);
        this.setNome(nome);
        this.setMarca(marca);
        this.setPreco(preco);
    }

    public Produto () {
        this.setId(0);
        this.setNome("ÏNDEFINIDO");
        this.setMarca(new Marca());
        this.setPreco(0.00);
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
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

    public String toString() {
        String retorno = "";

        retorno = "ID: "+ this.getId() + " - " + "NOME: "+ this.getNome() + " - " 
                        + "MARCA: "+this.getMarca().getMarca_id()+ " - " + "PREÇO: "+ this.getPreco(); 

        return retorno; 
    }


}
