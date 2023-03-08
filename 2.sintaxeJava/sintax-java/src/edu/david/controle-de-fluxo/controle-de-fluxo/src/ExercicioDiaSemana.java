import java.util.Scanner;

public class ExercicioDiaSemana {

    public static void main(String[] args) {

        switchSemana ();
        swithFerias();

    }

    private static void switchSemana() {
        int domingo = 1;
        int segunda = 2;
        int terca = 3;
        int quarta = 4;
        int quinta = 5;
        int sexta = 6;
        int sabado = 7;

        String dia;

        System.out.print("Informe em qual dia da semana estamos meu chapinha =>  ");
        Scanner qualDia = new Scanner(System.in);
        dia = qualDia.next();

        switch (dia){
            case("domingo"):
                System.out.println("Domingo é o dia da semana " + domingo);
                break;
            case("segunda"):
                System.out.println("Segunda é o dia da semana " + segunda);
                break;
            case("terça"):
                System.out.println("Terça é o dia da semana " + terca);
                break;
            case("quarta"):
                System.out.println("quarta é o dia da semana " + quarta);
                break;
            case("quinta"):
                System.out.println("quinta é o dia da semana " + quinta);
                break;
            case("sexta"):
                System.out.println("sexta é o dia da semana " + sexta);
                break;
            case("sabado"):
                System.out.println("sabado é o dia da semana " + sabado);
                break;
            default:
                System.out.println("O dia " + dia + " é um valor invalido \n" +
                        "se esforça mais ai, chapinha!");
        }

    }
    private static void swithFerias() {
        int num;
        System.out.println("Agora vamos para outro exemplo \n" +
                "informe um número inteiro de 1 à 5 =>  ");
        Scanner qualNum= new Scanner(System.in);
        num = qualNum.nextInt();

        switch (num){
            case(1):
                System.out.println("correto!");
                break;
            case(2):
                System.out.println("correto!");
                break;
            case(3):
                System.out.println("correto!");
                break;
            case(4):
                System.out.println("errado!");
                break;
            case(5):
                System.out.println("talvez!");
                break;
            default:
                System.out.println("Valor informado invalido.");

        }

    }

}

