package com.reto1.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Estudiante extends Persona{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numeroEstudiante;
    private double promedioNotas;

    public Estudiante(String nombre, String numeroCelular, String correoElectronico, Long numeroEstudiante, double promedioNotas) {
        super(nombre, numeroCelular, correoElectronico);
        this.numeroEstudiante = numeroEstudiante;
        this.promedioNotas = promedioNotas;
    }

    public Estudiante(Long numeroEstudiante, double promedioNotas) {
        this.numeroEstudiante = numeroEstudiante;
        this.promedioNotas = promedioNotas;
    }

    public Long getNumeroEstudiante() {
        return numeroEstudiante;
    }

    public void setNumeroEstudiante(Long numeroEstudiante) {
        this.numeroEstudiante = numeroEstudiante;
    }

    public double getPromedioNotas() {
        return promedioNotas;
    }

    public void setPromedioNotas(double promedioNotas) {
        this.promedioNotas = promedioNotas;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "numeroEstudiante=" + numeroEstudiante +
                ", promedioNotas=" + promedioNotas +
                '}';
    }
}
