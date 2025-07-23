package Controlador;

import Modelo.Estadistica;
import Modelo.Visitante;
import Modelo.Evento;
import java.util.ArrayList;

public class GestionEstadistica {

    public void calcularEstadisticas(Estadistica estadistica, ArrayList<Visitante> visitantes, ArrayList<Evento> eventos) {
        estadistica.totalVisitantes = visitantes.size();

        estadistica.totalPersonasDiscapacitadas = 0;
        estadistica.ingresosTotales = 0;
        estadistica.descuentosTotales = 0;

        for (Visitante v : visitantes) {
            if (v.discapacidad) {
                estadistica.totalPersonasDiscapacitadas++;
            }
            estadistica.ingresosTotales += v.totalPagar;
            estadistica.descuentosTotales += v.descuentoAplicado;
        }

        calcularAsistencias(eventos, visitantes);
        estadistica.eventoMayorAsistencia = obtenerEventoMayorAsistencia(eventos);
        estadistica.eventoMenorAsistencia = obtenerEventoMenorAsistencia(eventos);
    }

    public void calcularAsistencias(ArrayList<Evento> eventos, ArrayList<Visitante> visitantes) {
        for (Evento evento : eventos) {
            evento.cantidadVisitantes = 0;
        }

        for (Visitante visitante : visitantes) {
            if (visitante.eventoAsistido != null && visitante.cantEntradasEventos > 0) {
                for (Evento evento : eventos) {
                    if (evento.nombreArtista.equalsIgnoreCase(visitante.eventoAsistido)) {
                        evento.cantidadVisitantes += visitante.cantEntradasEventos;
                    }
                }
            }
        }
    }

    public Evento obtenerEventoMayorAsistencia(ArrayList<Evento> eventos) {
        Evento mayor = null;
        int max = 0;

        for (Evento e : eventos) {
            if (e.cantidadVisitantes > max) {
                max = e.cantidadVisitantes;
                mayor = e;
            }
        }
        return mayor;
    }

    public Evento obtenerEventoMenorAsistencia(ArrayList<Evento> eventos) {
        Evento menor = null;
        int min = Integer.MAX_VALUE;

        for (Evento e : eventos) {
            if (e.cantidadVisitantes < min) {
                min = e.cantidadVisitantes;
                menor = e;
            }
        }
        return menor;
    }

    public void imprimirEstadisticas(Estadistica estadistica) {
        
        System.out.println("                 ESTADÍSTICAS GENERALES DEL EVENTO");
        System.out.println("________________________________________________________________________");

        System.out.printf("%-35s %10d%n", "Total de visitantes:", estadistica.totalVisitantes);
        System.out.printf("%-35s %10d%n", "Total personas con discapacidad:", estadistica.totalPersonasDiscapacitadas);
        System.out.printf("%-35s $%10.2f%n", "Ingresos totales:", estadistica.ingresosTotales);
        System.out.printf("%-35s $%10.2f%n", "Descuentos aplicados:", estadistica.descuentosTotales);

        System.out.println("________________________________________________________________________");

        if (estadistica.eventoMayorAsistencia != null) {
            System.out.println("EVENTO CON MAYOR ASISTENCIA:");
            System.out.printf("%s%n", "Artista", estadistica.eventoMayorAsistencia.nombreArtista);
            System.out.printf("  %-20s: %s%n", "Día presentación", estadistica.eventoMayorAsistencia.diaPresentacion);
            System.out.printf("  %-20s: %d personas%n", "Cantidad de asistentes", estadistica.eventoMayorAsistencia.cantidadVisitantes);
        }

        System.out.println("________________________________________________________________________");

        if (estadistica.eventoMenorAsistencia != null) {
            System.out.println("EVENTO CON MENOR ASISTENCIA:");
            System.out.printf("%s%n", "Artista", estadistica.eventoMenorAsistencia.nombreArtista);
            System.out.printf("%s%n", "Día presentación", estadistica.eventoMenorAsistencia.diaPresentacion);
            System.out.printf("%d personas%n", "Cantidad de asistentes", estadistica.eventoMenorAsistencia.cantidadVisitantes);
        }
        System.out.println("");
    }

}
