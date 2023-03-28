package edu.loianeGroner;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada<Integer>();

        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(3);

        System.out.println(lista);
        System.out.println(lista.getTamanho());
    }
}
