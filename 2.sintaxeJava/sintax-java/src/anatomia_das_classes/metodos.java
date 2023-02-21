package anatomia_das_classes;

public class metodos {
    public static void main(String[] args) {
        String primeiroNome = "David";
        String segundoNome = "Santos";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome); //chamada do metodo e seus parametros;
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "resultado do metodo " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
