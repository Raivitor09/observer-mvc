package com.example.model;

import com.example.observador.AssentoListener;
import com.example.observador.AssentoSource;
import java.util.ArrayList;
import java.util.List;

public class Onibus implements AssentoSource {
    private List<Assento> assentos;
    private List<AssentoListener> listeners;

    public Onibus(int totalAssentos) {
        assentos = new ArrayList<>();
        listeners = new ArrayList<>();
        for (int i = 1; i <= totalAssentos; i++) {
            assentos.add(new Assento(i));
        }
    }

    public boolean reservarAssento(int numeroAssento) {
        if (numeroAssento < 1 || numeroAssento > assentos.size()) {
            throw new IllegalArgumentException("Número do assento fora do intervalo: " + numeroAssento);
        }
        
        Assento assento = assentos.get(numeroAssento - 1);
        if ("reservado".equals(assento.getStatus())) {
            return false; // Retorna false se o assento já está reservado
        }
        
        assento.setStatus("reservado");
        notificarListeners(new AssentoEvento(this, assento));
        return true;
    }

    @Override
    public void adicionarListener(AssentoListener listener) {
        if (listener != null && !listeners.contains(listener)) {
            listeners.add(listener);
        }
    }

    @Override
    public void removerListener(AssentoListener listener) {
        listeners.remove(listener);
    }

    @Override
    public void notificarListeners(AssentoEvento evento) {
        for (AssentoListener listener : listeners) {
            listener.statusAssentoAlterado(evento);
        }
    }
}
