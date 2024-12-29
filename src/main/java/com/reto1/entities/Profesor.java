package com.reto1.entities;



public class Profesor extends Persona{

    int salario;

    public Profesor(String nombre, String numeroCelular, String correoElectronico, int salario) {
        super(nombre, numeroCelular, correoElectronico);
        this.salario = salario;
    }

    public Profesor(int salario) {
        this.salario = salario;
    }

    public Profesor() {}

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "salario=" + salario +
                '}';
    }

    public String materiasDictadas(){
        return "Lista de materias";
    }
}
