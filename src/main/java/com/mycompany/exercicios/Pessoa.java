package com.mycompany.exercicios;

public class Pessoa {
    public String nome;
    public Integer idade;
    public Float Altura;
    
    public Pessoa(String nome,Integer idade,Float altura){
        this.nome = nome;
        this.idade = idade; 
        this.Altura = altura;
        
    }
    public String fazerAniversario(){
        this.idade += 1;
        return"\nParabéns! você está comemorando mais um ano de vida";
    }
    public String exibirDados (){
        return "\nNome:"+ this.nome + "\nIdade:" + this.idade + "\nAltura: " + this.Altura;
    }
}
