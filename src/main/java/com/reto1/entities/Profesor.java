package com.reto1.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Profesor extends Persona{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Profesor(String nombre, String numeroCelular, String correoElectronico, Long id, int salario) {
        super(nombre, numeroCelular, correoElectronico);
        this.id = id;
        this.salario = salario;
    }

    public Profesor(Long id, int salario) {
        this.id = id;
        this.salario = salario;
    }

    int salario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }


}
