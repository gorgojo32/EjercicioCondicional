/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package condicionales5;

/**
 *
 * @author jpber
 */
public class Primeros10 {
    public static void main(String[] args) {
         // 1. Determinar si una persona es elegible para un préstamo hipotecario
        int edad = 30;
        double ingresoAnual = 60000000; // en COP
        int puntuacionCrediticia = 750;

        if (edad > 25 && ingresoAnual > 50000000 && puntuacionCrediticia > 700) {
            System.out.println("Es elegible para un préstamo hipotecario.");
        } else {
            System.out.println("No es elegible para un préstamo hipotecario.");
        }

        // 2. Calcular el costo total de un viaje de 500 km
        int distancia = 500; // en km
        int pasajeros = 4;
        String medioTransporte = "coche";
        double costoPorKm = 0;

        if (medioTransporte.equals("coche")) {
            costoPorKm = 1500;
        } else if (medioTransporte.equals("autobus")) {
            costoPorKm = 900;
        } else if (medioTransporte.equals("avion")) {
            costoPorKm = 3000;
        }

        double costoTotal = distancia * costoPorKm;

        if (pasajeros > 3) {
            costoTotal *= 0.9; // Aplicar un 10% de descuento
        }

        System.out.println("El costo total del viaje es: " + costoTotal + " COP");

        // 3. Verificar si un estudiante es elegible para una beca
        double promedio = 90;
        int actividadesExtracurriculares = 3;
        double ingresosFamiliares = 25000000; // en COP

        if (promedio >= 85 && actividadesExtracurriculares >= 3 && ingresosFamiliares < 30000000) {
            System.out.println("El estudiante es elegible para una beca.");
        } else {
            System.out.println("El estudiante no es elegible para una beca.");
        }

        // 4. Clasificar un usuario
        boolean inicioSesion = true;
        String rol = "admin";
        String clasificacionUsuario;

        if (!inicioSesion) {
            clasificacionUsuario = "visitante";
        } else if (rol.equals("admin")) {
            clasificacionUsuario = "administrador";
        } else {
            clasificacionUsuario = "usuario registrado";
        }

        System.out.println("El usuario es: " + clasificacionUsuario);

        // 5. Evaluar si una inversión es viable
        double capitalDisponible = 150000000; // en COP
        double tasaRetorno = 12; // en porcentaje
        double riesgosAsociados = 15; // en porcentaje

        if (capitalDisponible > 100000000 && tasaRetorno >= 10 && riesgosAsociados < 20) {
            System.out.println("La inversión es viable.");
        } else {
            System.out.println("La inversión no es viable.");
        }

        // 6. Calcular el salario neto de un empleado
        double salarioBruto = 4000000; // en COP
        double impuestos = salarioBruto * 0.2;
        double seguridadSocial = salarioBruto * 0.05;
        double otrosDescuentos = 200000; // en COP
        double salarioNeto = salarioBruto - impuestos - seguridadSocial - otrosDescuentos;

        System.out.println("El salario neto es: " + salarioNeto + " COP");

        // 7. Asignar una prioridad a un ticket de soporte
        String urgencia = "alta";
        String impacto = "alto";
        String prioridad;

        if (urgencia.equals("critica") || (urgencia.equals("alta") && impacto.equals("alto"))) {
            prioridad = "alta";
        } else if (urgencia.equals("alta") || impacto.equals("medio")) {
            prioridad = "media";
        } else {
            prioridad = "baja";
        }

        System.out.println("La prioridad del ticket es: " + prioridad);

        // 8. Determinar si una persona es elegible para un seguro de salud premium
        edad = 30;
        boolean tieneEnfermedadesCronicas = false;
        boolean fuma = false;

        if (edad == 30 && !tieneEnfermedadesCronicas && !fuma) {
            System.out.println("Es elegible para un seguro de salud premium.");
        } else {
            System.out.println("No es elegible para un seguro de salud premium.");
        }

        // 9. Evaluar la rentabilidad de un proyecto
        double ingresosProyectados = 200000000; // en COP
        double costosIniciales = 50000000; // en COP
        double costosOperativosAnuales = 30000000; // en COP
        int años = 5;

        double costosTotales = costosIniciales + (costosOperativosAnuales * años);

        if (ingresosProyectados > costosTotales) {
            System.out.println("El proyecto es rentable.");
        } else {
            System.out.println("El proyecto no es rentable.");
        }

        // 10. Calcular la tarifa de impuestos de una propiedad
        String tipoPropiedad = "residencial";
        double valorPropiedad = 250000000; // en COP
        double tasaImpuestos;

        if (tipoPropiedad.equals("residencial")) {
            tasaImpuestos = 0.012;
        } else {
            tasaImpuestos = 0.02;
        }

        double impuestosPropiedad = valorPropiedad * tasaImpuestos;

        System.out.println("Los impuestos de la propiedad son: " + impuestosPropiedad + " COP");
    }
}
