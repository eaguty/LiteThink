package com.reto1.repositories;
import com.reto1.entities.Estudiante;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;
import java.util.List;

@Repository
public class RepositorioEstudiante {

    private final List<Estudiante> estudiantes;

    // Constructor que inicializa y agrega 10 estudiantes
    public RepositorioEstudiante() {
        this.estudiantes = new ArrayList<>();
        agregarEstudiantesIniciales();
    }

    // Método para agregar estudiantes al repositorio
    private void agregarEstudiantesIniciales() {
        estudiantes.add(new Estudiante("Juan Pérez", "123456789", "juan.perez@example.com", 1L, 9.0));
        estudiantes.add(new Estudiante("Ana López", "987654321", "ana.lopez@example.com", 2L, 8.5));
        estudiantes.add(new Estudiante("Luis García", "456123789", "luis.garcia@example.com", 3L, 7.8));
        estudiantes.add(new Estudiante("Sofía Hernández", "321654987", "sofia.hernandez@example.com", 4L, 9.3));
        estudiantes.add(new Estudiante("Carlos Torres", "789123456", "carlos.torres@example.com", 5L, 8.9));
        estudiantes.add(new Estudiante("Elena Martínez", "654789123", "elena.martinez@example.com", 6L, 9.7));
        estudiantes.add(new Estudiante("Pedro Sánchez", "951753456", "pedro.sanchez@example.com", 7L, 8.2));
        estudiantes.add(new Estudiante("María Fernández", "852456123", "maria.fernandez@example.com", 8L, 7.5));
        estudiantes.add(new Estudiante("José Ramírez", "123789456", "jose.ramirez@example.com", 9L, 8.8));
        estudiantes.add(new Estudiante("Isabel Gutiérrez", "456987123", "isabel.gutierrez@example.com", 10L, 9.1));
    }


    // Método para obtener todos los estudiantes
    public List<Estudiante> obtenerTodosLosEstudiantes() {
        return new ArrayList<>(estudiantes);
    }

    // Método para agregar un nuevo estudiante
    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }
}