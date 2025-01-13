/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoescuela;

/**
 *
 * @author equipo
 */
import java.io.Serializable;
//Esta interfaz permite que la instancia de la clase sea convertida a una secuencia de bytes, lo cual es necesario para la serialización/deserialización.

public class SolicitudEstudiante implements Serializable {
    private String nombre;
    private String matricula;
    private String semestre;
    private String carrera;
    private String deporteSeleccionado;
    private String tallerCursoSeleccionado;

    public SolicitudEstudiante(String nombre, String matricula, String semestre, String carrera,
            String deporteSeleccionado, String tallerCursoSeleccionado) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.semestre = semestre;
        this.carrera = carrera;
        this.deporteSeleccionado = deporteSeleccionado;
        this.tallerCursoSeleccionado = tallerCursoSeleccionado;
    }

    // Métodos getter y setter para acceder a los atributos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getDeporteSeleccionado() {
        return deporteSeleccionado;
    }

    public void setDeporteSeleccionado(String deporteSeleccionado) {
        this.deporteSeleccionado = deporteSeleccionado;
    }

    public String getTallerCursoSeleccionado() {
        return tallerCursoSeleccionado;
    }

    public void setTallerCursoSeleccionado(String tallerCursoSeleccionado) {
        this.tallerCursoSeleccionado = tallerCursoSeleccionado;
    }
}
