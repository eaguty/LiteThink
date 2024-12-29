package com.reto1.services;

import com.reto1.entities.Estudiante;
import com.reto1.repositories.RepositorioEstudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ServiceEstudiante {

    @Autowired
    private RepositorioEstudiante repositorioEstudiante;

    // Constructor que inicializa el repositorio
    public ServiceEstudiante(RepositorioEstudiante repositorioEstudiante) {
        this.repositorioEstudiante = repositorioEstudiante;
    }

    // Método para listar todos los estudiantes
    public List<Estudiante> listarTodosLosEstudiantes() {
        return repositorioEstudiante.obtenerTodosLosEstudiantes();
    }

    public Optional<Estudiante> filtrarPorId(Long id) {
        return repositorioEstudiante.obtenerTodosLosEstudiantes()
                .stream()
                .filter(estudiante -> estudiante.getNumeroEstudiante().equals(id))
                .findFirst();
    }

    // Método para filtrar estudiantes por nombre
    public List<Estudiante> filtrarPorNombre(String nombre) {
        return repositorioEstudiante.obtenerTodosLosEstudiantes()
                .stream()
                .filter(estudiante -> estudiante.getNombre().equalsIgnoreCase(nombre))
                .collect(Collectors.toList());
    }

    // Método para filtrar estudiantes por número de celular
    public List<Estudiante> filtrarPorNumeroCelular(String numeroCelular) {
        return repositorioEstudiante.obtenerTodosLosEstudiantes()
                .stream()
                .filter(estudiante -> estudiante.getNumeroCelular().equals(numeroCelular))
                .collect(Collectors.toList());
    }

    // Método para ordenar estudiantes por promedio de notas (de mayor a menor)
    public List<Estudiante> ordenarPorPromedioNotas() {
        return repositorioEstudiante.obtenerTodosLosEstudiantes()
                .stream()
                .sorted((e1, e2) -> Double.compare(e2.getPromedioNotas(), e1.getPromedioNotas()))
                .collect(Collectors.toList());
    }

}
