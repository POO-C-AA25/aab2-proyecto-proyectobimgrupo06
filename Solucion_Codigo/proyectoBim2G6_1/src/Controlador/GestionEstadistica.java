package Controlador; //Indica el paquete al que pertenece el archivo 

//Improta las utilidades y clases del paquete modelo
import Modelo.*; //* sirve para indicar que vamos a utilizar TODO lo del paquete
import java.util.ArrayList;//Importa utilidades de la lista dinamica


public class GestionEstadistica {
    
    //Metodo para calcular las estadisticas en base a los visitantes y eventos registrados en memoria
    public void calcularEstadisticas(Estadistica estadistica, ArrayList<Visitante> visitantes, ArrayList<Evento> eventos) {
        
        //Cada visitante registrado
        estadistica.totalVisitantes = visitantes.size();
        
        //Se inicializa en 0 la cantidad de personas discapacitadas para posteriormente calcular en base a un valor boolean
        estadistica.totalPersonasDiscapacitadas = 0;
        
        //Se inicializan los valores en 0 para evitar errores 
        estadistica.ingresosTotales = 0;
        estadistica.descuentosTotales = 0;

        //Se recorre la lista de visitantes
        for (Visitante v : visitantes) {
            
            //Si discapcidad = true se aumentan las personas con discapacidad en 1
            if (v.discapacidad) {
                estadistica.totalPersonasDiscapacitadas++;
            }
            
            //Se acumulan los valores
            estadistica.ingresosTotales += v.totalPagar;
            estadistica.descuentosTotales += v.descuentoAplicado;
        }
        
        //Se invoca el metodo desde la misma clase
        calcularAsistencias(eventos, visitantes);
        
        //Se invocan los metodos ya realizados
        estadistica.eventoMayorAsistencia = obtenerEventoMayorAsistencia(eventos);
        estadistica.eventoMenorAsistencia = obtenerEventoMenorAsistencia(eventos);
    }
    
    //Este metodo se ocupo en el proyecto del primer bim
    
    //Calcula las asistencias de cada evento en base al artista de cada evento y el atributo artista de la clase visitante
    public void calcularAsistencias(ArrayList<Evento> eventos, ArrayList<Visitante> visitantes) {
        
        //Se inicializan los valores en 0 para evitar calculos incorrectos
        for (Evento evento : eventos) {
            evento.cantidadVisitantes = 0;
        }
        
        //Se recorren los arreglos y se comparan los String
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
    
    //Evento mayor asistencia
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

    //Evento menor asistencia
    public Evento obtenerEventoMenorAsistencia(ArrayList<Evento> eventos) {
        Evento menor = null;
        
        //Da el valor a min del maximo valor que puede obtener un int en java 
        int min = Integer.MAX_VALUE; //2,147,483,647

        for (Evento e : eventos) {
            if (e.cantidadVisitantes < min) {
                min = e.cantidadVisitantes;
                menor = e;
            }
        }
        return menor;
    }
    
    //SE imprime las estadisticas obtenidas y guardadas en el objeto de clase estadistica 
    public void imprimirEstadisticas(Estadistica estadistica) {
        
        System.out.println("                 ESTADÍSTICAS GENERALES DEL EVENTO");
        System.out.println("________________________________________________________________________");

        System.out.printf("%10d%n", "Total de visitantes:", estadistica.totalVisitantes);
        System.out.printf("%10d%n", "Total personas con discapacidad:", estadistica.totalPersonasDiscapacitadas);
        System.out.printf("$2f%n", "Ingresos totales:", estadistica.ingresosTotales);
        System.out.printf("$2f%n", "Descuentos aplicados:", estadistica.descuentosTotales);

        System.out.println("________________________________________________________________________");

        if (estadistica.eventoMayorAsistencia != null) {
            System.out.println("EVENTO CON MAYOR ASISTENCIA:");
            System.out.printf("%s%n", "Artista", estadistica.eventoMayorAsistencia.nombreArtista);
            System.out.printf("%s%n", "Día presentación", estadistica.eventoMayorAsistencia.diaPresentacion);
            System.out.printf("%d personas%n", "Cantidad de asistentes", estadistica.eventoMayorAsistencia.cantidadVisitantes);
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
