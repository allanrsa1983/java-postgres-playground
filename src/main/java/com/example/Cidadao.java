package com.example;

import java.time.LocalDate;

public class Cidadao {
    private LocalDate dataNascimento; 

    public Cidadao(LocalDate datanasc) {
        this.setDataNascimento(datanasc);
    } 

    public Cidadao() {
        this.setDataNascimento(LocalDate.now());
    }
    
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }


    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int calcularIdade() {
        return (LocalDate.now().getYear() - this.getDataNascimento().getYear()); 
    }

    //0 = não, 1 = opcional, 2 = obrigatório
    public int isEleitor() {
        int eleitor = 0;
        int idade = this.calcularIdade(); 

        if (idade < 16) {
            eleitor = 0; 
        } else if ((idade > 15 && idade < 18) || (idade > 70)) {
            eleitor = 1;
        } else {
            eleitor = 2; 
        }
        return eleitor; 
    

    } 
    public String toString() {
        String retorno = ""; 

        String ano = "" + this.getDataNascimento().getYear();
        String mes = "" + this.getDataNascimento().getMonthValue();
        String dia = "" + this.getDataNascimento().getDayOfMonth();
        
        retorno = dia+"/"+mes+"/"+ano; 
        
        return retorno;
    }


    public static void main(String[] args) {
        
    }
    
}
