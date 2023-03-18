package projetoReferencia;

public class Main {
    public static void main(String[] args) {
        int intA = 1;
        int intB = intA;

        System.out.println("intA: "+intA+"\nintB: "+intB);
        intA = 2;
        System.out.println("intA: "+intA+"\nintB: "+intB);

        MeuObj ObjA = new MeuObj(1);
        MeuObj ObjB = ObjA;

        System.out.println("objA: "+ObjA+"\nObjB: "+ObjB);
        ObjA.setNum(2);
        System.out.println("objA: "+ObjA+"\nObjB: "+ObjB);



    }





}