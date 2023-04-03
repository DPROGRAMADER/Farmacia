package org.example;

import java.time.LocalDate;

public class AntiinflamatorioTipo4 extends Medicamentos{

    private Double valorDescuento=0.010;
    private Double CostoUnitarioPorUnidad=4000.0;
    private Double DescuentoCompra=300.0;

    public AntiinflamatorioTipo4(String nombre, Double precioUnitarioSinIva, String registroINVIMA, String fabricante, LocalDate fechaVencimiento, LocalDate fechaFabricacion) {
        super(nombre, precioUnitarioSinIva, registroINVIMA, fabricante, fechaVencimiento, fechaFabricacion);
    }

    @Override
    public Double calcularCostoUnitario(Integer cantidad) {
        if(cantidad<1){
            System.out.println("error la cantidad debe ser mayor o igual a 1");
            return null;
        }else{
            this.CostoUnitarioPorUnidad=CostoUnitarioPorUnidad*cantidad;
        }
        return CostoUnitarioPorUnidad;
    }

    @Override
    public Double calcularDescuentoCompra() {
        this.DescuentoCompra=this.CostoUnitarioPorUnidad*this.valorDescuento;
        return DescuentoCompra;
    }

    public Double calcularValorCompraTotal() {
        Double total=this.CostoUnitarioPorUnidad-this.DescuentoCompra;
        return total;

    }
}

