package com.dioInovationOne;

public class Main {
    public static void main(String[] args) {
        ListaCircular <String> minhaListaCircular = new ListaCircular<>();

        minhaListaCircular.add("c1");
        minhaListaCircular.add("c2");
        minhaListaCircular.add("c3");

        for(int i = 0; i < 20; i++){
            System.out.println(minhaListaCircular.get(i));
        }

    }
}
