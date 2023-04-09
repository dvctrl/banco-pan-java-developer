package one.DigitalInovattion;

import javax.swing.*;
import javax.swing.JOptionPane.*;
import java.text.Format;

public class Emprestimo {
    //formula de calculo de juros J=CxIxT

    private double valorEmprestimo = 0;
    private int parcelasEmprestimo = 0;
    private double taxasEmprestimo = 0.05;


    private double getValorEmprestimo(double valor){
        valor = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do emprestimo"));
        valorEmprestimo = valor;
        return valorEmprestimo;
    }
    private int getParcelasEmprestimo(int parcelas){
        parcelas = Integer.parseInt(JOptionPane.showInputDialog("Em quantas parcelas deseja pagar esse valor?"));
        parcelasEmprestimo = parcelas;
        return parcelasEmprestimo;
    }

    public double emprestimo(){
        JOptionPane.showMessageDialog(null,"Bem vindo ao meu emprestimo.com!\n" +
                "preencha os campos abaixo para obter as informações!");
        getValorEmprestimo(this.valorEmprestimo);
        getParcelasEmprestimo(this.parcelasEmprestimo);

        double juros = valorEmprestimo * taxasEmprestimo * parcelasEmprestimo;
        double valorEmprestimoFinal = juros + valorEmprestimo;

        int mensagem = JOptionPane.showConfirmDialog(null,"O valor final do emprestimo é " + String.format("%.2f",valorEmprestimoFinal));
        return mensagem;
    }
}
