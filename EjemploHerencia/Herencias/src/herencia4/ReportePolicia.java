/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Policia;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReportePolicia extends Reporte {

    double promedioEdades;
    ArrayList<Policia> lista;
    String nombre;
    String apellido;
    int edad;
    String rango;

    public ReportePolicia(String a, String n, String ap, int e, String m) {
        super(a);
        nombre = n;
        apellido = ap;
        edad = e;
        rango = m;
    }

    public ReportePolicia(String a) {
        super(a);
    }

    public void setPromedioEdades(double a) {
        promedioEdades = a;
    }

    public void setLista(ArrayList<Policia> a) {
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

    public void setRango(String a) {
        rango = a;
    }

    public double getPromedioEdades() {
        return promedioEdades;
    }

    public ArrayList<Policia> getLista() {
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

    public String getRango() {
        return rango;
    }

}
