package Modelo;

public class Evento {

    public String nombreArtista;
    public String diaPresentacion;
    public int cantidadVisitantes;

    public Evento() {
    }

    public Evento(String nombreArtista, String diaPresentacion) {
        this.nombreArtista = nombreArtista;
        this.diaPresentacion = diaPresentacion;
    }
    
    @Override
    public String toString() {
        return "Evento: " 
                + "\nNombre del artista: " + nombreArtista 
                + "\nDia de la presentacion: " + diaPresentacion 
                + "\nCantidad de visitantes: " + cantidadVisitantes 
                + "\n";
    }

}
