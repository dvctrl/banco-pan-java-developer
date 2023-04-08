package one.DigitalInovattion;

public class Calculadora {
    String operacao = "";
    public int soma(int n1, int n2){
        operacao = "soma";
        return n1 + n2;
    }
    public int subtacao(int n1, int n2){
        operacao = "subtração";
        return n1 - n2;
    }
    public int multiplicacao(int n1, int n2){
        operacao = "multiplicação";
        return n1 * n2;
    }
    public int divisao(int n1, int n2){
        operacao = "Divisão";
        if(n1 == 0 || n2 == 0){
            throw new ArithmeticException("O valor da "+operacao+" é invalido, pois não há divisão por 0.");
        }else {
            return n1 / n2;
        }

    }

    public void imprimir (Integer metodo){
        System.out.println("o resultado da "+ operacao +" é " + metodo);
    }

}
