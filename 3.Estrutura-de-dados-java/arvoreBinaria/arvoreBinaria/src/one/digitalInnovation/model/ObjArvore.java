package one.digitalInnovation.model;

public abstract class ObjArvore<T> implements Comparable <T> {
     public abstract boolean equals(Object o);
     public abstract int hashcode();
     public abstract int compareTo(T o);
     public abstract String ToString(T o);









}
