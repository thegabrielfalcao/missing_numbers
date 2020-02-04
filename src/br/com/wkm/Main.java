package br.com.wkm;

import br.com.wkm.model.Argumentos;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Argumentos argumentos = new Argumentos(args);

        Set<Integer> inteiros = excluirNumerosRepetidos(argumentos.getArr());
        List<Integer> lista = criarListaComItensFaltantes(argumentos.getMinimo(), argumentos.getMaximo(), inteiros);

        System.out.println("Resultado: " + lista);
    }

    private static List<Integer> criarListaComItensFaltantes(int minimo, int maximo, Set<Integer> set) {

        List<Integer> inteiros = new ArrayList<>();

        inteiros.add(minimo);

        for (int contador = ++minimo ; maximo > contador ; contador++) {
            if (!set.contains(contador)) {
                inteiros.add(contador);
            }
        }

        inteiros.add(maximo);

        ordernarInteirosOrdemCrescente(inteiros);

        return inteiros;
    }

    private static void ordernarInteirosOrdemCrescente(List<Integer> inteiros) {
        Collections.sort(inteiros);
    }

    private static Set<Integer> excluirNumerosRepetidos(int[] arr) {
        Set<Integer> inteiros = new HashSet<Integer>();

        for (int contador = 0 ; arr.length > contador ; contador++) {
            inteiros.add(arr[contador]);
        }

        return inteiros;
    }
}
