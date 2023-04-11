package one.digitalInnovation;

public class Quadrilatero {
    public static void area(double lado){
        System.out.println("Área do quadrado: " + (lado * lado));
    }
    public static void area(double lado1, double lado2){
        System.out.println("Área do retangulo: " + lado1 * lado2);
    }
    public static void area(double basemaior, double basemenor, double altura){
        System.out.println("Área do trapézio: " + ((basemaior+basemenor)*altura)/2);
    }
    public static void area(float diagonal1, float diagonal2){
        System.out.println("Área do losango: " + (diagonal1 * diagonal2)/2);
    }

}
