
package com.mycompany.exercicios;
import java.time.LocalDate;

public class Veiculos {
    public String marca;
    public String modelo;
    public Integer anoFabricacao;
    public Double quilometragem;
   
    public Veiculos(String marca, String modelo, Integer anoFabricacao, Double quilometragem){
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.quilometragem = quilometragem;
    }
   
    public Integer calcularTempo(){
        return LocalDate.now().getYear() - this.anoFabricacao;
    }
   
    public String registrarViagem(Double distancia){
        if(distancia >0){
            this.quilometragem += distancia;
            return"\nViagem adicionada com sucesso!";
        }else{
            return "\nDistância inválida!";
        }
    }
   
    public String exibirDados(){
       
    }
   
}