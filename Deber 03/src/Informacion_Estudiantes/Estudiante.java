package Informacion_Estudiantes;
import java.util.Scanner;
import java.util.Date;

public class Estudiante {
    private String nombreCompleto;
    private String cedula;
    private Date fecha;
    private String[] materias;

    public Estudiante() {
    }

    Estudiante(String nombreCompleto, String cedula) {
        this.nombreCompleto = nombreCompleto;
        this.cedula = cedula;
        this.fecha = fecha;

    }

    //set
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setMaterias(String[] materias) {
        this.materias = materias;
    }

    //get
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getCedula() {
        return cedula;
    }

    public Date getFecha() {
        return fecha;
    }

    public String[] getMaterias() {
        return materias;
    }
}






