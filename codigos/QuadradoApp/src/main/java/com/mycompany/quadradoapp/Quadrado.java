/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.quadradoapp;

/**
 *
 * @author User
 */
public class Quadrado {

    public Ponto p1,p2,p3,p4;

    Quadrado(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }
    
    Quadrado(){
        //nothing
    }

    Quadrado realizaInterseccao(Quadrado q2) {
        Quadrado novo = new Quadrado();
        
        Ponto p1 = q2.p1;
        Ponto p2 = new Ponto(this.p2.x, q2.p1.y);
        Ponto p3 = this.p3;
        Ponto p4 = new Ponto(q2.p1.x, this.p3.y);
        
        novo.p1 = p1;
        novo.p2 = p2;
        novo.p3 = p3;
        novo.p4 = p4;
        
        return novo;
    }
}
