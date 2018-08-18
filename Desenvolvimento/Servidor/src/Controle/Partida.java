/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.Jogador;
import Modelo.Round;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author leonardo
 */
public class Partida {
    private final String nome;
    private final String senha;
    private final int qntJogadores;
    private final ArrayList<Jogador> listaJogadores;
    private Round round;
    private int numeroRound;
    Scanner entrada;
            
    public Partida(String nome, String senha, int qntJogadores) {
        this.nome = nome;
        this.senha = senha;
        this.qntJogadores = qntJogadores;
        this.listaJogadores = new ArrayList<>();
        this.numeroRound = 0;
        
        entrada = new Scanner(System.in);
    }
    
    public void criaJogador(){
        Jogador j;
        String nomeJogador;
        int idJogador  = 0;
        
        idJogador = listaJogadores.size();
        
        System.out.println("Nome do Jogador: ");
        nomeJogador = entrada.next();
        
        j = new Jogador(idJogador, 3, nomeJogador);
        listaJogadores.add(j);
    }
    
    public void retiraVida(int idJogador){
        listaJogadores.get(idJogador).perdeVida();
    }
    
    
}
