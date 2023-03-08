import java.util.Scanner;

public class Atividade_Calendario {
    public static void main(String[] args) {

       int jan =1,fev=2,mar=3,abr=4,mai=5,jun=6,jul=7,ago=8,set=9,oct=10,nov=11,dez=12;
       int mes;


        System.out.print("Informe em qual mês estamos meu chapinha =>  ");
        Scanner qualMes = new Scanner(System.in);
        mes = qualMes.nextInt();


        if(mes == jan){
            System.out.println("Você esta em janeiro!");
        }else if (mes == fev){
            System.out.println("Voce esta em fevereiro!");
        }else if (mes == mar){
            System.out.println("Voce esta em março!");
        }else if (mes == abr){
            System.out.println("Voce esta em abril!");
        }else if (mes == mai){
            System.out.println("Voce esta em maio!");
        }else if (mes == jun){
            System.out.println("Voce esta em junho!");
        }else if (mes == jul){
            System.out.println("Voce esta em julho!");
        }else if (mes == ago){
            System.out.println("Voce esta em agosto!");
        }else if (mes == set){
            System.out.println("Voce esta em setembro!");
        }else if (mes == oct){
            System.out.println("Voce esta em outubro!");
        }else if (mes == nov){
            System.out.println("Voce esta em novembro!");
        }else if (mes == dez){
            System.out.println("Voce esta em dezembro!");
        }else {
            System.out.println("Chapinha, o número " + mes + " não é um mês valido!! " +
            "\nse esforça ai e digita de novo!");
        }

        if(mes==jan || mes == jul || mes == dez){
            System.out.println("Opa, você também esta de férias!!");
        }


    }
}