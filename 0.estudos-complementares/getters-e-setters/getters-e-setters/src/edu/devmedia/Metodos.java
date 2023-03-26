package edu.devmedia;

public class Metodos {
    Ponto ponto = new Ponto();

    public double valor1;
    public double valor2;


    public double addX(double valor){
        Ponto novoValor = new Ponto();
        novoValor.setX(valor);
        valor1 = novoValor.getX();
        return valor1;
    }

    public double addY(double valor){
        Ponto novoValor = new Ponto();
        novoValor.setY(valor);
        valor2 = novoValor.getY();
        return valor2;
    }

    @Override
    public String toString() {

        String strRetorno = "";
        strRetorno += "[valor1= "+this.valor1+" || valor2= "+this.valor2+"]";

        return strRetorno;
    }
}
