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

    public ReporteEstudiante(String a) {
        super(a);
    }

    public void establecerListaEstudiante(ArrayList<Estudiante> lista) {
        this.lista = lista;
    }

    public ArrayList<Estudiante> obtenerListaEstudiante() {
        return lista;
    }

    public void establecerPromedioMatriculas() {
        for (int i = 0; i < lista.size(); i++) {
            promedioMatriculas = promedioMatriculas + lista.get(i).getMatricula();
        }
        promedioMatriculas = promedioMatriculas / lista.size();
    }

    public double obtenerPromedioMatriculas() {
        return promedioMatriculas;
    }

    @Override
    public String toString() {
        String cadenaEstudiante = String.format("%s\n", "Lista Estudiantes");
        for (int i = 0; i < lista.size(); i++) {
            cadenaEstudiante = String.format("%s%s\n", cadenaEstudiante,
                    lista.get(i));

        }
        cadenaEstudiante=String.format("\nCodigo: %s\n"
                + "%s"
                + "El promedio de matricula es: %.2f\n",
                codigo,
                cadenaEstudiante,
                obtenerPromedioMatriculas());
        return cadenaEstudiante;
    }

}
