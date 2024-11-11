package com.example.model;

import java.util.EventObject;

public class AssentoEvento extends EventObject {
    private final Assento assento;

    public AssentoEvento(Object source, Assento assento) {
        super(source);
        this.assento = assento;
    }

    public Assento getAssento() { return assento; }
}
