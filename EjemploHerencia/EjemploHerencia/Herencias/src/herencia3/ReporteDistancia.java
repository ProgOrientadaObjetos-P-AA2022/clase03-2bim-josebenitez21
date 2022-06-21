/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia3;

import java.util.ArrayList;

public class ReporteDistancia extends Reporte {

    private ArrayList<EstudianteDistancia> lista;
    private double totalMatriculaDistancia;

    public ReporteDistancia(String nombre, String carrera, String ciclo) {
        super(nombre, carrera, ciclo);

    }

    public void establecerLista(ArrayList<EstudianteDistancia> listado) {
        lista = listado;
    }

    public void establecerTotalMatriculasDistancia() {

        for (int i = 0; i < lista.size(); i++) {
            totalMatriculaDistancia = totalMatriculaDistancia
                    + lista.get(i).obtenerMatriculaDistancia();
        }
    }

    public ArrayList<EstudianteDistancia> obtenerLista() {
        return lista;
    }

    public double obtenerTotalMatriculasDistancia() {
        return totalMatriculaDistancia;
    }

    @Override
    public String toString() {
        String listaEstudiante = String.format("%s\n", "Lista Estudiantes");

        for (int i = 0; i < lista.size(); i++) {
            listaEstudiante = String.format("%s%s\n", listaEstudiante,
                    lista.get(i));

        }

        String cadena = String.format("%s\nCarrera: %s \n"
                + "Ciclo: %s\n\n"
                + "%s"
                + "El total matricula es: %.2f\n",
                nombre,
                carrera,
                ciclo,
                listaEstudiante,
                obtenerTotalMatriculasDistancia());
//        cadena=String.format("%s Lista de Estudiantes\n", cadena);
//        for (int i = 0; i < lista.size(); i++) {
//            cadena=String.format("%s\n ", cadena);
//            
//            
//        }

        return cadena;
    }

}
