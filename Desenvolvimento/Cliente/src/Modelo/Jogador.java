/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author leonardo
 */
public class Jogador {
    private final int id;
    private int qntVidas;
    private final String nome;
    private ArrayList<Carta> listaCartas;
    Scanner entrada;
    
    public Jogador(int id, int qntVidas, String nome) {
        this.id = id;
        this.qntVidas = qntVidas;
        this.nome = nome;
        this.listaCartas = new ArrayList<>();
        entrada = new Scanner(System.in);
    }

    public int getId() {
        return id;
    }

    public int getQntVidas() {
        return qntVidas;
    }

    public String getNome() {
        return nome;
    }
    
    public int InformaQntFaz(){
        int qntFaz = 0;
        System.out.println("Quantos faz?");
        qntFaz = entrada.nextInt();
        
        return qntFaz;
    }
    
    public void recebeMao(ArrayList<Carta> listaCartas){
        this.listaCartas = listaCartas;
    }
    
    public Carta realizaJogada(){
        int jogada = 0;
        System.out.println("Jogada: ");
        jogada = entrada.nextInt();
        
        return listaCartas.get(jogada);
    }
    
    public void perdeVida(){
      qntVidas--;
    }
    
    
}
