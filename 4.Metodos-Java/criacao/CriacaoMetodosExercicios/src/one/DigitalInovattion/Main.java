package one.DigitalInovattion;

public class Main {
    public static void main(String[] args) {
        Calculadora metodo = new Calculadora();
        Mensagem hora = new Mensagem();


        metodo.imprimir(metodo.soma(1,2));
        metodo.imprimir(metodo.subtacao(1,2));
        metodo.imprimir(metodo.multiplicacao(2,2));
        metodo.imprimir(metodo.divisao(2,2));

        System.out.println("------- exercicio 2 -------");

        System.out.println(hora.mensagem());


    }
}
