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
public interface Comunicacao_RMI extends Remote{
    void addCliente(Cliente_RMI cliente) throws RemoteException;

    void setX(double valor) throws RemoteException;

    void setY(double valor) throws RemoteException;
}
