package Modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Visitante {

    public boolean discapacidad;
    public int cantEntradasNormales;
    public int cantEntradasEventos;
    public int cantidadTotalEntradas;
    public double totalPagar;
    public double descuentoAplicado;
    public String eventoAsistido;
    public  ArrayList<Entrada> entradas;

    public Visitante() {
    }

    public Visitante(boolean discapacidad, int cantEntradasNormales, int cantEntradasEventos, String eventoAsistido) {
        this.discapacidad = discapacidad;
        this.cantEntradasNormales = cantEntradasNormales;
        this.cantEntradasEventos = cantEntradasEventos;
        this.cantidadTotalEntradas = cantEntradasNormales + cantEntradasEventos;
        this.eventoAsistido = eventoAsistido;
        this.entradas = new ArrayList<>();
    }
    
    public void ingresarEntradas(int cantEntradasN, int cantEntradasE){
        LocalDateTime fechaHoraActual = LocalDateTime.now();

        if(cantEntradasN > 0){
            for (int i = 0; i < cantEntradasN; i++) {
                
                EntradaNormal nuevaEntrada = new EntradaNormal(fechaHoraActual);
                
                entradas.add(nuevaEntrada);
            }
        }
        
        if(cantEntradasE > 0){
            for (int i = 0; i < cantEntradasE; i++) {
                EntradaEventos nuevaEntradaEv = new EntradaEventos(fechaHoraActual);
                
                entradas.add(nuevaEntradaEv);
            }
        }
    }

    @Override
    public String toString() {
        return "\nVisitante:" 
                + "\nDiscapacidad: " + discapacidad 
                + "\nCantidad de entradas normales: " + cantEntradasNormales 
                + "\nCantidad de entradas para eventos: " + cantEntradasEventos 
                + "\nCantidad total de entradas: " + cantidadTotalEntradas 
                + "\nTotal a pagar: " + totalPagar 
                + "\nDescuento aplicado: " + descuentoAplicado 
                + "\nEvento asistido: " + eventoAsistido 
                + "\n";
    }
  
}
