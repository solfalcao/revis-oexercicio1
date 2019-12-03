package br.com.revisaoexercicio1;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        IntegerSet conjunto = new IntegerSet ();

        List<Integer> conjuntoNovo = new ArrayList<>();

        conjuntoNovo.add(1);
        conjuntoNovo.add(45);
        conjuntoNovo.add(0);
        conjuntoNovo.add(2);

        System.out.println("Inserção");

        conjunto.inserir(24);
        conjunto.inserir(4);


    }
}
