public class classePublica {
    // variavel da classe conta(saldo)
    double saldo = 20.0;

    public void sacar (Double valor){
        //variavel local do método (valor)

        double novoSaldo = saldo - valor;
    }

    public void imprimirSaldo(){
        System.out.println(saldo);
        // somente o metodo sacar conhece o novoSaldo
//      System.out.println(novoSaldo);
    }
    public double calcularDividaExponencial(){
            //variável local de método
            double valorParcela = 50.0;
            double valorMontante = 0.0; // começando a variável com valor zero
            for(int x=1; x<=5; x++) {//x variável de escopo de fluxo
                //esta variável será reiniciada a cada execução for
                double valorCalculado = valorParcela * x;
                valorMontante = valorMontante + valorCalculado;
            }
            //escopo de fluxo
            //x e valorCalculado nunca estarão disponíveis fora do for

            return valorMontante;
        }
    }


