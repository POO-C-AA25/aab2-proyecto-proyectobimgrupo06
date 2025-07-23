package Controlador;

import Modelo.Evento;
import java.util.ArrayList;

public class GestionEventos {

    public static ArrayList<Evento> acumulacionEvento = new ArrayList<>();

    public GestionEventos() {
        acumulacionEvento = new ArrayList<>();
    }

    public void insertarEvento(ArrayList<Evento> eventosPresentables, String nombreArtista, String diaPresentacion) {
        eventosPresentables.add(new Evento(nombreArtista, diaPresentacion));
    }

    public String imprimirEvento() {
        if (acumulacionEvento.isEmpty()) {
            return "No hay eventos registrados";
        } else {
            for (Evento evento : acumulacionEvento) {
                return evento.toString();
            }
        }
        return "";
    }
}
