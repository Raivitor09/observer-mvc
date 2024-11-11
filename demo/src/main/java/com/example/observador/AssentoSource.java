package com.example.observador;

import com.example.model.AssentoEvento;

public interface AssentoSource {
    void adicionarListener(AssentoListener listener);
    void removerListener(AssentoListener listener);
    void notificarListeners(AssentoEvento evento);
}