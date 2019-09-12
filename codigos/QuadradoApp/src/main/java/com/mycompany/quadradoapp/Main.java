/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.quadradoapp;

/**
 *
 * @author dsm
 * y_pos
 * 3 *----------*
 *   |          |
 *   |  Q1      |
 * 2 |     *----*------*
 *   |     |Q4  |      |
 * 1 *-----*----*
 *         |    |      |
 *         |    |    Q2|
 * 0       *-----------*
 *   1     2    3      4     x_pos
 * Resposta
 *    Q3 = (2,2), (3,2), (3,1), (2,1)
 */
public class Main {
    public static void main(String[] args){
        /** primeiro quadrado **/
        Ponto p1 = new Ponto(1,3);
        Ponto p2 = new Ponto(3,3);
        Ponto p3 = new Ponto(3,1);
        Ponto p4 = new Ponto(1,1);
        Quadrado q1 = new Quadrado(p1,p2,p3,p4);
        
        /** segundo quadrado **/
        Ponto p5 = new Ponto(2,2);
        Ponto p6 = new Ponto(4,2);
        Ponto p7 = new Ponto(4,0);
        Ponto p8 = new Ponto(2,0);
        Quadrado q2 = new Quadrado(p5,p6,p7,p8);
        
        System.out.println("Meu primeiro quadrado tem coordenadas\n"+
                "\tp1: (" + q1.p1.x + ", " + q1.p1.y + ")\n" + 
                "\tp2: (" + q1.p2.x + ", " + q1.p2.y + ")\n" +
                "\tp3: (" + q1.p3.x + ", " + q1.p3.y + ")\n" + 
                "\tp4: (" + q1.p4.x + ", " + q1.p4.y + ")\n\n");
        
        System.out.println("Meu segundo quadrado tem coordenadas\n"+
                "\tp1: (" + q2.p1.x + ", " + q2.p1.y + ")\n" + 
                "\tp2: (" + q2.p2.x + ", " + q2.p2.y + ")\n" +
                "\tp3: (" + q2.p3.x + ", " + q2.p3.y + ")\n" + 
                "\tp4: (" + q2.p4.x + ", " + q2.p4.y + ")\n\n");
        
        /** interseccao entre os 2 quadrados **/
        Quadrado q3 = q1.realizaInterseccao(q2);
        
        System.out.println("Meu terceiro quadrado tem coordenadas\n"+
                "\tp1: (" + q3.p1.x + ", " + q3.p1.y + ")\n" + 
                "\tp2: (" + q3.p2.x + ", " + q3.p2.y + ")\n" +
                "\tp3: (" + q3.p3.x + ", " + q3.p3.y + ")\n" + 
                "\tp4: (" + q3.p4.x + ", " + q3.p4.y + ")\n\n");
        
    }
}
