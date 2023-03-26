package edu.devmedia;

public class Ponto {
    private double x;
    private double y;
    private String descricao;
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Ponto{" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}
