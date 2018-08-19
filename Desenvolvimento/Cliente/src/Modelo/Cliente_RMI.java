/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author raissa
 */
public interface Cliente_RMI extends Remote{
    public int informaQntFaz();
    
    public void recebeMao(ArrayList<Carta> listaCartas);
    
    public void recebeListaQntVidas(ArrayList<Integer> listaQntVidas);
    
    public void recebeListaQntFaz(ArrayList<Integer> listaQntFaz);
    
    public void recebeJogadasRealizadas(ArrayList<Carta> listaJogadas);
    
    public Carta realizaJogada();
    
    public void perdeVida();
}
