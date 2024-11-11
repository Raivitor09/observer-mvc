package com.example.model;

public class Assento {
    private int numero;
    private String status;

    public Assento(int numero) {
        this.numero = numero;
        this.status = "disponível";
    }

    public int getNumero() { 
        return numero; 
    }

    public String getStatus() { 
        return status; 
    }

    public void setStatus(String status) { 
        if(status.equals("disponível") || status.equals("reservado") || status.equals("indisponível")) {
            this.status = status;
        } else {
            throw new IllegalArgumentException("Status inválido: " + status); 
        }
    }
}
