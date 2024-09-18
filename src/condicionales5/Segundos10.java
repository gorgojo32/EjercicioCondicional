/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package condicionales5;

/**
 *
 * @author jpber
 */
public class Segundos10 {
    public static void main(String[] args) {
        // 11. Determinar si un proyecto cumple con los estándares ambientales
        double emisionesCO2 = 150; // en toneladas
        double usoAgua = 50000; // en m³
        double residuosSolidos = 200; // en toneladas

        if (emisionesCO2 <= 100 && usoAgua <= 40000 && residuosSolidos <= 150) {
            System.out.println("El proyecto cumple con los estándares ambientales.");
        } else {
            System.out.println("El proyecto no cumple con los estándares ambientales.");
        }

        // 12. Calcular la pensión de jubilación
        int añosDeServicio = 35;
        double salarioPromedio = 3000000; // en COP
        double contribucion = 0.1 * salarioPromedio;
        double pensionJubilacion = añosDeServicio * contribucion;

        System.out.println("La pensión de jubilación es: " + pensionJubilacion + " COP");

        // 13. Clasificar una inversión según el riesgo
        double inversion = 50000000; // en COP
        double volatilidad = 12; // en porcentaje
        String clasificacionRiesgo;

        if (volatilidad < 5) {
            clasificacionRiesgo = "bajo";
        } else if (volatilidad >= 5 && volatilidad <= 15) {
            clasificacionRiesgo = "medio";
        } else {
            clasificacionRiesgo = "alto";
        }

        System.out.println("La inversión tiene un riesgo: " + clasificacionRiesgo);

        // 14. Verificar si un proyecto de construcción cumple con normativas locales
        int numeroPisos = 10;
        boolean materialesResistentesFuego = true;
        boolean soportaTerremotos = true;
        boolean cumpleNormativas;

        if (numeroPisos == 10 && materialesResistentesFuego && soportaTerremotos) {
            cumpleNormativas = true;
            System.out.println("El proyecto de construcción cumple con las normativas locales.");
        } else {
            cumpleNormativas = false;
            System.out.println("El proyecto de construcción no cumple con las normativas locales.");
        }

        // 15. Calcular el costo total de un paquete de servicios
        double costoInternet = 150000; // en COP
        double costoCable = 120000; // en COP
        double costoTelefono = 90000; // en COP
        double descuento = 0.15;

        double costoTotalServicios = (costoInternet + costoCable + costoTelefono) * (1 - descuento);

        System.out.println("El costo total del paquete de servicios es: " + costoTotalServicios + " COP");

        // 16. Evaluar si una persona es elegible para adoptar una mascota
        boolean historialAdopcionPositivo = true;
        boolean entornoAdecuado = true;
        double ingresoMensual = 2500000; // en COP

        if (historialAdopcionPositivo && entornoAdecuado && ingresoMensual > 2000000) {
            System.out.println("La persona es elegible para adoptar una mascota.");
        } else {
            System.out.println("La persona no es elegible para adoptar una mascota.");
        }

        // 17. Calcular los impuestos de importación
        double valorProducto1 = 1000000; // en COP
        double valorProducto2 = 10000000; // en COP
        double tarifaImpuesto1 = 0.05;
        double tarifaImpuesto2 = 0.15;

        double impuestoProducto1 = valorProducto1 * tarifaImpuesto1;
        double impuestoProducto2 = valorProducto2 * tarifaImpuesto2;

        System.out.println("Los impuestos de importación del producto 1 son: " + impuestoProducto1 + " COP");
        System.out.println("Los impuestos de importación del producto 2 son: " + impuestoProducto2 + " COP");

        // 18. Determinar la eficiencia energética de un edificio
        double consumoAnual = 150000; // en kWh
        double energiaSolar = 0.5 * consumoAnual;
        double ahorroEnergetico = 0.2 * consumoAnual;

        double consumoFinal = consumoAnual - energiaSolar - ahorroEnergetico;

        System.out.println("El consumo final de energía del edificio es: " + consumoFinal + " kWh");

        // 19. Calcular la bonificación de un vendedor
        double ventas = 100000000; // en COP
        double tasaBonificacion1 = 0.05;
        double tasaBonificacion2 = 0.1;
        double bonificacion;

        if (ventas <= 50000000) {
            bonificacion = ventas * tasaBonificacion1;
        } else {
            bonificacion = 50000000 * tasaBonificacion1 + (ventas - 50000000) * tasaBonificacion2;
        }

        System.out.println("La bonificación del vendedor es: " + bonificacion + " COP");

        // 20. Evaluar el impacto social de una nueva política
        int personasBeneficiadas = 10000;
        int personasAfectadas = 1000;
        double costoImplementacion = 5000000000.0; // en COP

        if (personasBeneficiadas > personasAfectadas && costoImplementacion <= 5000000000.0) {
            System.out.println("La política tiene un impacto social positivo.");
        } else {
            System.out.println("La política no tiene un impacto social positivo.");
        }
    }
}
