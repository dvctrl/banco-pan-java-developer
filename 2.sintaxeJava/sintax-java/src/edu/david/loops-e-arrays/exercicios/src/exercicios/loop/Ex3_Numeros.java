package exercicios.loop;

import java.util.Scanner;

public class Ex3_Numeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        int maior = 0;
        int soma=0;
        int i = 1;

        while (i <= 5){
            System.out.println(i + " Numero: ");
            numero = scan.nextInt();
            soma = numero + soma;
            if (numero > maior) maior = numero;
            i++;
        }

        System.out.println("Maior: " + maior);
        System.out.println("A media é : " + (soma/5));


    }
}
