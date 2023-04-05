package one.digitalInovattion;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Carro> stackCarro = new Stack<>();

        stackCarro.push(new Carro("ford"));
        stackCarro.push(new Carro("fiat"));
        stackCarro.push(new Carro("chevrolet"));

        System.out.println(stackCarro);
        System.out.println(stackCarro.pop());
        System.out.println(stackCarro);
        System.out.println(stackCarro.peek());
        System.out.println(stackCarro);
        System.out.println(stackCarro.empty());


    }
}
