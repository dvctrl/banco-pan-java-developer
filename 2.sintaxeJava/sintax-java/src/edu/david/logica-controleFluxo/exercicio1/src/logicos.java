public class logicos {
    public static void main(String [] args) {

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

/*operador 'e' -> &&*/
        System.out.println("B1 && B2 "+(b1&&b2));
        System.out.println("B1 && B3 "+(b1&&b3));
    /*operador 'ou' -> ||*/
        System.out.println("B2 || B3 "+(b2||b3));
        System.out.println("B2 || B3 "+(b2||b4));

    /*operador 'xor' -> ^ */
        System.out.println("B1 || B3 "+(b1^b3));
        System.out.println("B4 || B3 "+(b4^b1));
    /*Operador de negação !*/
        System.out.println(!b1);
        System.out.println(!b4);

        int i1 = 10;
        int i2 = 5;
        float f1 = 20f;
        float f2 = 50f;

        System.out.println("((i1 + i2) < (f2 - f1)) && true -> " + (((i1 + i2) < (f2 - f1)) && true));
        System.out.println("((i1 > i2) || (f2 < f1)) -> " + ((i1 > i2) || (f2 < f1)));


        double salarioMensal = 11893.589d;
        double mediaSalario = 10500d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        System.out.println((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes));

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        System.out.println(salarioBaixo && muitosDependentes);

        boolean recebeAuxilio = ((salarioBaixo) && (muitosDependentes));

        System.out.println("Recebera o auxilio: " + recebeAuxilio);


    }
}
