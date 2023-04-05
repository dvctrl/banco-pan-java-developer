package one.digitalInovattion;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("ford"));
        listaCarros.add(new Carro(""));
        listaCarros.add(new Carro("aston martin"));
        listaCarros.add(new Carro("volvo"));

        System.out.println(listaCarros);

        System.out.println(listaCarros.contains(new Carro("ford")));
        System.out.println(new Carro("ford").hashCode());
        System.out.println(new Carro("ford1").hashCode());
        System.out.println(new Carro("aston martin").hashCode());
         Carro carro1 = new Carro("ford");
         Carro carro2 = new Carro("ford");

        System.out.println(carro1.equals(carro2));
    }
}
