package com.dioInovationOne;

public class ListaCircular <T>{

    public No<T> cabeca;
    public No<T> cauda;
    public int tamanhoLista;

    public ListaCircular() {
        this.cauda = null;
        this.cabeca = null;
        this.tamanhoLista = 0;
    }

    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);
            if(this.tamanhoLista == 0){
                this.cabeca = novoNo;
                this.cauda = this.cabeca;
                this.cabeca.setProximoNo(cauda);
            }else{
                novoNo.setProximoNo(this.cauda);
                this.cabeca.setProximoNo(novoNo);
                this.cauda = novoNo;
            }
            this.tamanhoLista++;
    }
    public void remove(int index){
        if(index >= this.tamanhoLista)
            throw new IndexOutOfBoundsException("O índice maior que o tamanho da lista");

        No<T> noAuxiliar = cauda;
        if(index == 0){ //estou na cauda
            this.cauda = this.cauda.getProximoNo();
            this.cabeca.setProximoNo(cauda);
        }else if(index == 1){
            this.cauda.setProximoNo(this.cauda.getProximoNo().getProximoNo());
        }else{
            for(int i = 0; i < index-1; i++){
                noAuxiliar = noAuxiliar.getProximoNo();
            }
            noAuxiliar.setProximoNo(noAuxiliar.getProximoNo().getProximoNo());
        }
        this.tamanhoLista--;
    }
    public int size(){
        return this.tamanhoLista;
    }
    private No<T> getNo(int index) {
        if(this.isEmpty()){
            throw new IndexOutOfBoundsException("a lista esta vazia");
        }
        if(index == 0){
            return this.cauda;
        }
        No<T> noAuxiliar = this.cauda;
        for(int i = 0; (i<index) && (noAuxiliar != null);i++){
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noAuxiliar;
    }

    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    public boolean isEmpty(){
        return this.tamanhoLista == 0 ? true : false;
    }

    @Override
    public String toString() {
        String strRetorno = "";

        No<T> noAuxiliar = cauda;
        for(int i = 0; i < size(); i++){
            strRetorno += "[No{conteudo = "+noAuxiliar.getConteudo()+"}] --->";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        strRetorno += this.size() != 0 ? "(Retorna ao inicio)" : "[]";
        return strRetorno;
    }
}
