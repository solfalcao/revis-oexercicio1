package br.com.revisaoexercicio1;

import java.util.ArrayList;
import java.util.List;

public class IntegerSet {

    List<Integer>conjuntos = new ArrayList<>();

    public List<Integer> uniao (List<Integer> conjuntoNovo){
        List<Integer> novoConjuntoCompleto = new ArrayList<>();

        novoConjuntoCompleto.addAll(conjuntoNovo);
        novoConjuntoCompleto.addAll(conjuntoNovo);

        return novoConjuntoCompleto;
    }

    public List<Integer> intersecao(List<Integer> novoConjunto){
        List<Integer> conjuntoComNumerosIguais = new ArrayList<>();

        for (Integer numeroNovoConjunto : novoConjunto){

            for(Integer numeroConjuntoClasse : this.conjuntos){

                if (numeroNovoConjunto.equals(numeroConjuntoClasse)){
                    conjuntoComNumerosIguais.add(numeroNovoConjunto);
                }
            }
        }
        return conjuntoComNumerosIguais;
    }

    public List<Integer> diferenca (List<Integer> novoConjunto){
        List<Integer> conjuntoComNumerosDiferentes = new ArrayList<>();

        for (Integer numeroConjuntoNovo : novoConjunto){

            if (!this.conjuntos.contains(numeroConjuntoNovo)){
                conjuntoComNumerosDiferentes.add(numeroConjuntoNovo);
            }
        }
        return conjuntoComNumerosDiferentes;
    }

    public void inserir (Integer numero) {
        if (numero <= 50 && numero >= 0) {

            this.conjuntos.add(numero);

        } else {
            System.out.println("Número não permitido");
        }

    }

    public void remover (Integer numero){
        this.conjuntos.remove (numero);
    }

    public void converteConjunto (List<Integer> novoConjunto){

        for (Integer numeroNovoConjunto : novoConjunto){

            String numero = Integer.toString()
        }
    }


    }