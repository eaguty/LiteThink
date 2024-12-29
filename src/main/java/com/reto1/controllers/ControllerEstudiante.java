package com.reto1.controllers;

import com.reto1.entities.Estudiante;
import com.reto1.services.ServiceEstudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/estudiantes")
public class ControllerEstudiante {

    @Autowired
    private ServiceEstudiante serviceEstudiante;

    @GetMapping
    public List<Estudiante> listarTodosLosEstudiantes() {
        return serviceEstudiante.listarTodosLosEstudiantes();
    }

    // Endpoint para filtrar estudiantes por nombre
    @GetMapping("/filtro/nombre")
    public List<Estudiante> filtrarPorNombre(@RequestParam String nombre) {
        return serviceEstudiante.filtrarPorNombre(nombre);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Estudiante> obtenerEstudiantePorId(@PathVariable Long id) {
        Optional<Estudiante> estudiante = serviceEstudiante.filtrarPorId(id);
        return estudiante.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Endpoint para filtrar estudiantes por número de celular
    @GetMapping("/filtro/celular")
    public List<Estudiante> filtrarPorNumeroCelular(@RequestParam String numeroCelular) {
        return serviceEstudiante.filtrarPorNumeroCelular(numeroCelular);
    }

    // Endpoint para ordenar estudiantes por promedio de notas
    @GetMapping("/ordenar")
    public List<Estudiante> ordenarPorPromedioNotas() {
        return serviceEstudiante.ordenarPorPromedioNotas();
    }
}
