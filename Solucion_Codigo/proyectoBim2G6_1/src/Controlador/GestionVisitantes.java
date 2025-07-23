package Controlador;

import Modelo.Entrada;
import Modelo.Visitante;
import java.util.ArrayList;

public class GestionVisitantes {

    public static ArrayList<Visitante> acumulacionVisitantes = new ArrayList<>();

    public GestionVisitantes() {
        acumulacionVisitantes = new ArrayList<>();
    }

    // Método para insertar visitante
    public void insertarVisitante(ArrayList<Visitante> listaVisitantes, boolean discapacidad, int entradasN, int entradasE, String evento) {
        Visitante v = new Visitante(discapacidad, entradasN, entradasE, evento);

        v.ingresarEntradas(entradasN, entradasE);
        calcularPago(v);
        listaVisitantes.add(v);
        acumulacionVisitantes.add(v);
    }

    public String obtenerTextoVisitantes() {
        if (acumulacionVisitantes.isEmpty()) {
            return "No hay visitantes registrados.";
        }

        for (Visitante v : acumulacionVisitantes) {
            v.toString();
            return v.toString();
        }

        return null;
    }

    public void calcularPago(Visitante visitante) {
        visitante.totalPagar = 0;
        visitante.descuentoAplicado = 0;

        for (Entrada entrada : visitante.entradas) {
            entrada.calcularPrecio(visitante);
        }
    }

}
