package com.example.view;

import com.example.model.AssentoEvento;
import com.example.observador.AssentoListener;
import com.example.model.Assento;

public class PainelCentral implements AssentoListener {
    @Override
    public void statusAssentoAlterado(AssentoEvento evento) {
        Assento assento = evento.getAssento();
        String cor;
        
        switch (assento.getStatus()) {
            case "disponível":
                cor = "verde";
                break;
            case "reservado":
                cor = "amarelo";
                break;
            case "indisponível":
                cor = "vermelho";
                break;
            default:
                cor = "desconhecido";
                break;
        }
        
        System.out.println("Painel Central: Assento " + assento.getNumero() + " está " + cor);
    }
    

}
