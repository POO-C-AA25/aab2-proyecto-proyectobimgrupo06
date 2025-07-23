package Vista;

import Vista.*;
import Controlador.GestionEstadistica;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("""
                             \n========= MENÚ PRINCIPAL =========
                               1. Realizar compra
                               2. Insertar evento
                               3. Imprimir estatistica en consola
                               0. Salir
                               ==================================
                               """);
            System.out.print("Seleccione una opción: ");

            opcion = teclado.nextInt();
            teclado.nextLine(); 
            switch (opcion) {
                case 1:
                    javax.swing.SwingUtilities.invokeLater(() -> {
                        new InterfazVisitantes().setVisible(true);
                    });
                    break;
                case 2:
                    javax.swing.SwingUtilities.invokeLater(() -> {
                        new InterfazEventos().setVisible(true);
                    });
                    break;
                case 3:
                    // Crear una instancia de la clase donde se guardan estadísticas
                    Modelo.Estadistica estadistica = new Modelo.Estadistica();

                    // Crear el gestor y calcular las estadísticas usando los datos acumulados
                    GestionEstadistica gestorEstadisticas = new GestionEstadistica();
                    gestorEstadisticas.calcularEstadisticas(
                            estadistica,
                            Controlador.GestionVisitantes.acumulacionVisitantes,
                            Controlador.GestionEventos.acumulacionEvento
                    );

                    // Imprimir la tabla en consola
                    gestorEstadisticas.imprimirEstadisticas(estadistica);
                    break;

                case 0:
                    System.out.println("Gracias por usar el sistema.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (opcion != 0);
    }
}
