package com.example.observador;

import com.example.model.AssentoEvento;

public interface AssentoListener {
    void statusAssentoAlterado(AssentoEvento evento);
}