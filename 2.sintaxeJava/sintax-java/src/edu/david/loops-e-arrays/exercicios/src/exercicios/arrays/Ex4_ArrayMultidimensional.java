package exercicios.arrays;

import java.util.Random;

public class Ex4_ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();
//primeira abertura é a linha e a segunda a coluna
        int[][] m = new int[4][4];

        for (int i = 0; i < m.length; i++){
            for(int j = 0; j <m[i].length; j++){
                m[i][j] = random.nextInt(9);
            }
        }
        System.out.println("matriz: ");
    for(int[] linha : m){
        for(int coluna : linha){
            System.out.print(coluna + " ");
        }
        System.out.println();
    }
    }

}
