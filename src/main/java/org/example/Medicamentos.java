package org.example;

import java.time.LocalDate;

public abstract class Medicamentos {

    private String nombre;
    private Double precioUnitarioSinIva;
    private String registroINVIMA;
    private String fabricante;
    private LocalDate fechaVencimiento;
    private LocalDate fechaFabricacion;

    public abstract Double calcularCostoUnitario(Integer cantidad);
    public abstract Double calcularDescuentoCompra();
    public abstract Double calcularValorCompraTotal();

    public Medicamentos(String nombre, Double precioUnitarioSinIva, String registroINVIMA, String fabricante, LocalDate fechaVencimiento, LocalDate fechaFabricacion) {
        this.nombre = nombre;
        this.precioUnitarioSinIva = precioUnitarioSinIva;
        this.registroINVIMA = registroINVIMA;
        this.fabricante = fabricante;
        this.fechaVencimiento = fechaVencimiento;
        this.fechaFabricacion = fechaFabricacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecioUnitarioSinIva() {
        return precioUnitarioSinIva;
    }

    public void setPrecioUnitarioSinIva(Double precioUnitarioSinIva) {
        this.precioUnitarioSinIva = precioUnitarioSinIva;
    }

    public String getRegistroINVIMA() {
        return registroINVIMA;
    }

    public void setRegistroINVIMA(String registroINVIMA) {
        this.registroINVIMA = registroINVIMA;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public LocalDate getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(LocalDate fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }
}
