/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import Modelo.Carta;
import Modelo.Jogador;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author leonardo
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        Jogador j = new Jogador(0,3,"Leonardo");
        ArrayList<Carta> listaCartas = new ArrayList<>();
        
        listaCartas.add(Carta.E4);
        listaCartas.add(Carta.EA);
        
        j.informaQntFaz();
        j.recebeMao(listaCartas);
        System.out.println(j.realizaJogada());
        j.perdeVida();
        
        
    }
    
}
