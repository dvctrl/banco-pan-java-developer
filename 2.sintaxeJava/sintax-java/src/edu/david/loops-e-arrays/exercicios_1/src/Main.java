import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        whileNome();

    }

    private static void whileNome() {
        String nomeAluno;
        String i = "0";


        while(nomeAluno.equals(i)){
            System.out.println("Por favor novamente seu nome => ");
            Scanner gravaNome = new Scanner(System.in);
            nomeAluno = gravaNome.next();

            System.out.println("Por favor aluno, insira sua idade => ");
            Scanner gravaIdade = new Scanner(System.in);
            int idade = gravaIdade.nextInt();
        }
        System.out.println("---programa finalizado---");
    }
}