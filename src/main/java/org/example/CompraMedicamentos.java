package org.example;

import java.time.LocalDate;

public class CompraMedicamentos {
    public static void main(String[] args) {

        AnalgesicosTipo1 analgesico = new AnalgesicosTipo1("ibuprofeno", 3000.0, "123456", "Bayer", LocalDate.of(2023, 3, 12), LocalDate.of(2023, 10, 9));
        AntiacidosTipo2 antiacido = new AntiacidosTipo2("Mylanta", 10000.0, "789012", "Pfizer", LocalDate.of(2023, 4, 2).plusYears(1), LocalDate.of(2023, 4, 2));
        AntialergénicosTipo3 antialergenico = new AntialergénicosTipo3("Loratadina", 12000.0, "345678", "Johnson & Johnson", LocalDate.of(2023, 4, 2), LocalDate.of(2023, 4, 2));
        AntiinflamatorioTipo4 antiinflamatorio = new AntiinflamatorioTipo4("Diclofenaco", 15000.0, "901234", "Novartis", LocalDate.of(2023, 4, 2), LocalDate.of(2023, 4, 2));
        AntiinfecciosoTipo5 antiinfeccioso = new AntiinfecciosoTipo5("Amoxicilina", 5000.0, "567890", "Roche", LocalDate.of(2023, 4, 2), LocalDate.of(2023, 4, 2));

        double costoAnalgesico = analgesico.calcularCostoUnitario(5);
        double descuentoAnalgesico = analgesico.calcularDescuentoCompra();
        double precioTotalAnalgesico = analgesico.calcularValorCompraTotal();
        System.out.println("Costo del analgésico: " + costoAnalgesico);
        System.out.println("Descuento del analgésico: " + descuentoAnalgesico);
        System.out.println("Precio total del analgésico: " + precioTotalAnalgesico);

        double costoAntiacido = antiacido.calcularCostoUnitario(9);
        double descuentoAntiacido = antiacido.calcularDescuentoCompra();
        double precioTotalAntiacido = antiacido.calcularValorCompraTotal();
        System.out.println("Costo del antiácido: " + costoAntiacido);
        System.out.println("Descuento del antiácido: " + descuentoAntiacido);
        System.out.println("Precio total del antiácido: " + precioTotalAntiacido);

        double costoAntialergenico = antialergenico.calcularCostoUnitario(5);
        double descuentoAntialergenico = antialergenico.calcularDescuentoCompra();
        double precioTotalAntialergenico = antialergenico.calcularValorCompraTotal();
        System.out.println("Costo del antialergénico: " + costoAntialergenico);
        System.out.println("Descuento del antialergénico: " + descuentoAntialergenico);
        System.out.println("Precio total del antialergénico: " + precioTotalAntialergenico);

        double costoAntiinflamatorio = antiinflamatorio.calcularCostoUnitario(10);
        double descuentoAntiinflamatorio = antiinflamatorio.calcularDescuentoCompra();
        double precioTotalAntiinflamatorio = antiinflamatorio.calcularValorCompraTotal();
        System.out.println("Costo del antiflamatorio: " + costoAntiinflamatorio);
        System.out.println("Descuento del antiflamatorio: " + descuentoAntiinflamatorio);
        System.out.println("Precio total del antiflamatorio: " + precioTotalAntiinflamatorio);

        double costoAntiinfeccioso = antiinfeccioso.calcularCostoUnitario(5);
        double descuentoAntiinfeccioso = antiinfeccioso.calcularDescuentoCompra();
        double precioTotalAntiinfeccioso = antiinfeccioso.calcularValorCompraTotal();
        System.out.println("Costo del antiinfeccioso: " + costoAntiinfeccioso);
        System.out.println("Precio total del antiinfeccioso: " + precioTotalAntiinfeccioso);
    }
}
