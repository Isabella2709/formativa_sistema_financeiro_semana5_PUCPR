package main;

import modelo.Financiamento;
import util.InterfaceUsuario;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Financiamento> listaDeFinanciamento = new ArrayList<>();
        InterfaceUsuario obj = new InterfaceUsuario();


        obj.pedirTaxaJuros();


        Financiamento financiamento = new Financiamento(250000, 48, 7.8);


        financiamento.mostraDados();


        listaDeFinanciamento.add(financiamento);


        for (Financiamento f : listaDeFinanciamento) {
            System.out.println(f);
        }
    }
}
