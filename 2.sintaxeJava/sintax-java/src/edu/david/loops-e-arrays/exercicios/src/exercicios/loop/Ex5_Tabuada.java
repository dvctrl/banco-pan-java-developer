package exercicios.loop;

import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        int tabuada = scan.nextInt();

        for(int i = 1; i <= 10; i = i + 1){
            int conta = tabuada * i;
            System.out.println(tabuada + " x " + i + " = " + conta);
        }

    }
}
