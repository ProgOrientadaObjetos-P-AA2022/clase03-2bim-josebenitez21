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

    public ReportePolicia(String a) {
        super(a);
    }

    public void establecerListaPolicia(ArrayList<Policia> lista) {
        this.lista = lista;
    }

    public ArrayList<Policia> obtenerListaPolicia() {
        return lista;
    }

    public void establecerPromediosEdades() {
        for (int i = 0; i < this.lista.size(); i++) {
            promedioEdades = promedioEdades + lista.get(i).getEdad();

        }
        promedioEdades = promedioEdades / lista.size();
    }

    public double obtenerPromedioEdades() {
        return promedioEdades;
    }

    @Override
    public String toString() {
        String cadenaPolicias = String.format("%s\n", "Lista Policias");
        for (int i = 0; i < lista.size(); i++) {
            cadenaPolicias = String.format("%s%s\n", cadenaPolicias,
                    lista.get(i));
        }
        cadenaPolicias = String.format("\nCodigo: %s\n"
                + "%s"
                + "El promedio de las edades es: %.2f\n",
                codigo, cadenaPolicias, obtenerPromedioEdades()
        );
        return cadenaPolicias;
    }

}
