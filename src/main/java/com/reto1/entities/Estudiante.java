package com.reto1.entities;

public class Estudiante extends Persona{

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

    public String listadoAsignaturas(){
        return "lista de asignaturas";
    }

    public String seminariosTiomadops() {
        return "Seminarios tomados";
    }
}
