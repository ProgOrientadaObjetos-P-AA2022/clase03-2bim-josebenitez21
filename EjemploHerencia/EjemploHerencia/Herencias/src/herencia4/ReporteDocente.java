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

    public ReporteDocente(String a) {
        super(a);
    }

    public void establecerPromedioSueldo() {
        for (int i = 0; i < lista.size(); i++) {
            promedioSueldos = promedioSueldos + lista.get(i).getSueldo();

        }
        promedioSueldos = promedioSueldos / lista.size();
    }

    public double obtenerPromedioSueldo() {
        return promedioSueldos;
    }
    public void establecerListaDocentes(ArrayList<Docente> lista){
        this.lista=lista;
    }
    public ArrayList<Docente> obtenerListaDocentes(){
        return lista;
    }

    @Override
    public String toString() {
        String cadenaDocentes =String.format("%s\n","Lista Docentes");
        for (int i = 0; i < lista.size(); i++) {
            cadenaDocentes= String.format("%s%s\n", cadenaDocentes,
                    lista.get(i));
        }
         cadenaDocentes=String.format("\nCodigo: %s\n"+"%s"+
                 "El promedio de sueldos es: %.2f\n", codigo,
                 cadenaDocentes,
                 obtenerPromedioSueldo()
        );
        return cadenaDocentes;
    }
     

}
