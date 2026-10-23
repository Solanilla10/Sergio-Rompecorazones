package es.plaiaundi.ed.calculadora;

/**
 * Punto de entrada: muestra una demostracion de cada operacion.
 */
public class Main {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println("=== Calculadora del equipo ===");
        System.out.println("7 + 5 = " + calc.sumar(7, 5));
        System.out.println("7 - 5 = " + calc.restar(7, 5));
    }
}
