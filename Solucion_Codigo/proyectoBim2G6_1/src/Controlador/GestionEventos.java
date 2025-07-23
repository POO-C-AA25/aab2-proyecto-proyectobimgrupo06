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

    public void imprimirEvento() {
        if (acumulacionEvento.isEmpty()) {
            System.out.println("No hay eventos registrados.");
        } else {
            System.out.println("Lista de eventos:");
            for (Evento evento : acumulacionEvento) {
                System.out.println(evento);
            }
        }
    }
}
