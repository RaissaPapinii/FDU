/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author raissa
 */
public interface Cliente_RMI extends Remote{
    void recebeNumero(String numero) throws RemoteException;
}
