/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import java.util.ArrayList;
import herencia2.Estudiante;

/**
 *
 * @author reroes
 */
public class ReporteEstudiante extends Reporte {

    double promedioMatriculas;
    ArrayList<Estudiante> lista;
    String nombre;
    String apellido;
    int edad;
    double matricula;

    public ReporteEstudiante(String a, String n, String ap, int e, double m) {
        super(a);
        nombre = n;
        apellido = ap;
        edad = e;
        matricula = m;
    }

    public ReporteEstudiante(String a) {
        super(a);
    }

    public void setPromedioMatriculas(double a) {
        promedioMatriculas = promedioMatriculas;
    }

    public void setLista(ArrayList<Estudiante> a) {
        lista = a;
    }

    public void setNombre(String a) {
        nombre = a;
    }

    public void setApellido(String a) {
        apellido = a;
    }

    public void setEdad(int a) {
        edad = a;
    }

    public void setMatricula(double a) {
        matricula = a;
    }

    public double getPromedioMatriculas() {
        return promedioMatriculas;
    }

    public ArrayList<Estudiante> getLista() {
        return lista;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public double getMatricula() {
        return matricula;
    }

}
