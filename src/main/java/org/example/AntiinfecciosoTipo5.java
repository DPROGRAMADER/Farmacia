package org.example;

import java.time.LocalDate;

public class AntiinfecciosoTipo5 extends Medicamentos{


    private Double costoUnitarioPorUnidad=4000.0;

    public AntiinfecciosoTipo5(String nombre, Double precioUnitarioSinIva, String registroINVIMA, String fabricante, LocalDate fechaVencimiento, LocalDate fechaFabricacion) {
        super(nombre, precioUnitarioSinIva, registroINVIMA, fabricante, fechaVencimiento, fechaFabricacion);
    }
    @Override
    public Double calcularCostoUnitario(Integer cantidad) {
        if (cantidad < 1) {
            System.out.println("Error: la cantidad debe ser mayor o igual a 1");
            return null;
        } else {
            this.costoUnitarioPorUnidad = costoUnitarioPorUnidad * cantidad;
        }
        return costoUnitarioPorUnidad;
}

    @Override
    public Double calcularDescuentoCompra() {
        return 0.0; // No hay descuento aplicable para el tipo 5
    }

    public Double calcularValorCompraTotal() {
        return this.costoUnitarioPorUnidad;

    }
}

