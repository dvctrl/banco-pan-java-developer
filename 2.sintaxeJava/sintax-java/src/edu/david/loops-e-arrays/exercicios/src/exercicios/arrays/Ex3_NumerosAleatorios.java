package exercicios.arrays;

import java.util.Random;

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for(int i = 0; i < numerosAleatorios.length; i++){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }
        System.out.println("\nNumeros aleatorios: ");
        for (int numero : numerosAleatorios){
            System.out.print(numero + " ");

        }
        System.out.println("\nsucessores: ");
        for (int sucessores : numerosAleatorios){
            System.out.print((sucessores + 1) + " ");
        }
        System.out.println("\nantesucessores: ");
        for (int antesucessores : numerosAleatorios){
            System.out.print((antesucessores - 1) + " ");
        }

    }
}
