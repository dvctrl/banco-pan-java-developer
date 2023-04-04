package one.digitalInnovation.model;

import java.util.Objects;

public class Obj extends ObjArvore<Obj> {
    Integer meuValor;
    public Obj(Integer meuValor){
        this.meuValor = meuValor;
    }
    @Override
    public boolean equals(Object o) {
        return false;
    }

    @Override
    public int hashcode() {
        return 0;
    }

    @Override
    public int compareTo(Obj outro) {
        int i = 0;
        if(this.meuValor > outro.meuValor){
            i = 1;
        }else if(this.meuValor < outro.meuValor){
            i = -1;
        }
        return i;
    }

    @Override
    public String ToString(Obj o) {
        return null;
    }

    @Override
    public String toString() {
        return meuValor.toString();
    }
}
