package com.example.DAO.exceptions;

public class ProdutoInexistenteException extends Exception {

    public ProdutoInexistenteException() {
        super("Produto não encontrado no repositório"); 
    } 
    
}
