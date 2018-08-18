/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author leonardo
 */
public class Round {
    private final int numero;
    private final int qntCartas;
    private final int qntJogadores;
    private ArrayList<Integer> listaQntFaz;

    public Round(int numero, int qntJogadores) {
        this.numero = numero;
        this.qntJogadores = qntJogadores;
        this.qntCartas = calculaQntCartas();
    }

    private int calculaQntCartas() {
        if(40/this.qntJogadores <= this.numero){
            return this.numero;
        }else{
            
            return (40/this.qntJogadores);
        }            
    }
    
    private void recebeQntFaz(ArrayList<Integer> listaQntFaz){
        this.listaQntFaz = listaQntFaz;    
    }
    
    private ArrayList<Integer> retornaQntFez(){
        
        ArrayList<Integer> listaQntFez = new ArrayList<>();
        
        return listaQntFez;    
    }
}
