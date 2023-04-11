package one.digitalInnovation;

public class Quadrilateros {

    public static String area(double lado){
        return "a área do quadrado é " + (lado * lado);
    }
    public static String area(double lado1, double lado2){
        return "a área do retangulo é " + (lado1 * lado2);
    }
    public static String area(double basemaior, double basemenor, double altura){
        return "a área do trapezio é " + ((basemaior*basemenor)*altura)/2;
    }
}
