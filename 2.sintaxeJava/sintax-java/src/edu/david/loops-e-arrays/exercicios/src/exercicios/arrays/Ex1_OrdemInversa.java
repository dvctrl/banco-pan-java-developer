package exercicios.arrays;

import java.util.ArrayList;
import java.util.Arrays;


public class Ex1_OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {-5,-6,22,90,50,8};

        System.out.println("vetor: ");
        for (int i = (vetor.length-1); i >=  0; i --){
            System.out.print(vetor[i]+" ");
        }
        System.out.println("\nvetor: ");
        int count = 0;
        while(count <= vetor.length-1){
            System.out.print(vetor[count]+",");
            count++;
        }
    }
}
