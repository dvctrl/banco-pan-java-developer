package com.dioInovationOne;

public class ListaCircular <T>{

    public No<T> cabeca;
    public No<T> calda;
    public int tamanhoLista;

    public int size(){
        return this.tamanhoLista;
    }
    public boolean isEmpty(){
        return this.tamanhoLista == 0 ? true : false;
    }
}
