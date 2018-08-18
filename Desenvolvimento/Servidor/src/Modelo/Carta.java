/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author leonardo
 */
public enum Carta {
    C4(4),C5(5),C6(6),CQ(8),CJ(9),CK(10),CA(11),C2(12),C3(13),C7(16),
    E4(4),E5(5),E6(6),E7(7),EQ(8),EJ(9),EK(10),E2(12),E3(13),EA(15),
    O4(4),O5(5),O6(6),OQ(8),OJ(9),OK(10),OA(11),O2(12),O3(13),O7(14),
    P5(5),P6(6),P7(7),PQ(8),PJ(9),PK(10),PA(11),P2(12),P3(13),P4(17);
    
    public int valorCarta;
    Carta(int valor) {
        valorCarta = valor;
    }
}
