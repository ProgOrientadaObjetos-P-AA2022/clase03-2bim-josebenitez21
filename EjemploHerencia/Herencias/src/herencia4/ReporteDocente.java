/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Docente;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReporteDocente extends Reporte {

    double promedioSueldos;
    ArrayList<Docente> lista;
    String nombre;
    String apellido;
    int edad;
    double sueldo;

    public ReporteDocente(String a, String n, String ap, int e, double m) {
        super(a);
        nombre = n;
        apellido = ap;
        edad = e;
        sueldo = m;
    }

    public ReporteDocente(String a) {
        super(a);
    }

    public void setPromedioSueldos() {
        for (int i = 0; i < lista.size(); i++) {
            promedioSueldos = promedioSueldos / lista.size();
        }
    }

    public void setLista(ArrayList<Docente> a) {
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

    public void setSueldo(double a) {
        sueldo = a;
    }

    public double getPromedioSueldos() {
        return promedioSueldos;
    }

    public ArrayList<Docente> getLista() {
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

    public double getSueldo() {
        return sueldo;
    }

    @Override
    public String toString() {
        String cadena;
        String cadenaDocentes;
        cadenaDocentes = String.format("%s\n", "Reporte Docentes");
        for (int i = 0; i < lista.size(); i++) {
            cadenaDocentes = String.format("%s%s\n", cadenaDocentes,lista.get(i));
        }
        cadena = String.format("Nombre: %s\n"
                + "Apellido: %s\n"
                + "Edad: %d\n"
                + "Sueldo: %.2f\n"
                + "Promedio sueldos: %.2f",
                getNombre(),
                getApellido(),
                getEdad(),
                getSueldo(),
                getPromedioSueldos());
        return cadena;
    }

}
