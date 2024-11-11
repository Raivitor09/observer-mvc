package com.example;

import com.example.controller.ControleOnibus;
import com.example.model.Onibus;
import com.example.view.PainelCentral;
import com.example.view.Quiosque;

public class Main {
    public static void main(String[] args) {
        Onibus onibus = new Onibus(10);

        PainelCentral painelCentral = new PainelCentral();
        Quiosque quiosque = new Quiosque();

        onibus.adicionarListener(painelCentral);
        onibus.adicionarListener(quiosque);

        ControleOnibus controle = new ControleOnibus(onibus);
        
        System.out.println("Reservando o assento 1:");
        controle.reservarAssento(1); 
        
        System.out.println("Tentando reservar o assento 1 novamente:");
        controle.reservarAssento(1); 

        System.out.println("Reservando o assento 15:");
        controle.reservarAssento(15); 
    }
}
