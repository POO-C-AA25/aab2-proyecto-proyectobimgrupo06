package Modelo;

import java.time.*;

public abstract class Entrada {

    public String categoria;
    public double precio = 2.5;
    public LocalDateTime fechaHora;

    public Entrada() {
    }

    public Entrada(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public abstract void calcularPrecio(Visitante visitante);

    //Metodo que no va a cambiar
    public boolean verificarHora() {
        LocalDate inicio = LocalDate.of(2024, 8, 30);
        LocalDate fin = LocalDate.of(2024, 9, 8);
        LocalDate fecha = fechaHora.toLocalDate();
        LocalTime hora = fechaHora.toLocalTime();
        DayOfWeek diaSemana = fecha.getDayOfWeek();
        boolean esDiaValido = diaSemana == DayOfWeek.THURSDAY || diaSemana == DayOfWeek.FRIDAY || diaSemana == DayOfWeek.SATURDAY;
        if (!fecha.isBefore(inicio) && !fecha.isAfter(fin) && esDiaValido) {
            if (!hora.isBefore(LocalTime.of(17, 0))) {
                return true;
            }
        }
        LocalDate diaAnterior = fecha.minusDays(1);
        DayOfWeek diaSemanaAnterior = diaAnterior.getDayOfWeek();

        boolean esDiaAnteriorValido = diaSemanaAnterior == DayOfWeek.THURSDAY || diaSemanaAnterior == DayOfWeek.FRIDAY || diaSemanaAnterior == DayOfWeek.SATURDAY;

        if (!diaAnterior.isBefore(inicio) && !diaAnterior.isAfter(fin) && esDiaAnteriorValido) {
            if (hora.isBefore(LocalTime.of(2, 0))) {
                return true;
            }
        }
        return false;
    }
}

class EntradaNormal extends Entrada {

    public EntradaNormal(LocalDateTime fechaHora) {
        super(fechaHora);
    }

    @Override
    public void calcularPrecio(Visitante visitante) {
        double precioBase = verificarHora() ? 7.0 : 2.5;  
        double precioFinal = precioBase;
        double descuento = 0;

        if (visitante.discapacidad) {
            descuento = precioBase * 0.5;  // 50% descuento
            precioFinal = precioBase - descuento;
        }

        visitante.totalPagar += precioFinal;
        visitante.descuentoAplicado += descuento;
    }

}

class EntradaEventos extends Entrada {

    public EntradaEventos(LocalDateTime fechaHora) {
        super(fechaHora);
    }

    @Override
    public void calcularPrecio(Visitante visitante) {
        double precioBase = 7.0;  
        double precioFinal = precioBase;

        if (visitante.discapacidad) {
            precioFinal = precioBase;
        }

        visitante.totalPagar += precioFinal;
        visitante.descuentoAplicado += 0;
    }

}
