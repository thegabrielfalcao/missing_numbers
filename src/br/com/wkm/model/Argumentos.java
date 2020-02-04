package br.com.wkm.model;

import java.util.Arrays;

public class Argumentos {

    private static final int NUMERO_MINIMO_ARGUMENTOS = 3;
    private static final int VALOR_MINIMO_DEFAULT = 1;
    private static final int VALOR_MAXIMO_DEFAULT = 50;
    private static final int POSICAO_MEMORIA_PRIMEIRO_ELEMENTO = 2;
    private Integer minimo;
    private Integer maximo;
    private int[] arr;

    public Argumentos(String[] argumentos) {

        try {
            if ((isNumeroArgumentosValido(argumentos)) && !isPrimeiroArgumentoMaiorSegundoArgumento(argumentos)) {
                minimo = Integer.parseInt(argumentos[0]);
                maximo = Integer.parseInt(argumentos[1]);
                arr = new int[argumentos.length];

                for (int contador = POSICAO_MEMORIA_PRIMEIRO_ELEMENTO ; contador < argumentos.length ; contador ++) {
                    arr[contador - POSICAO_MEMORIA_PRIMEIRO_ELEMENTO] = Integer.parseInt(argumentos[contador]);
                }

                return;
            }

            throw new IllegalArgumentException("Argumentos não passados ou inválidos, setando valores default");

        } catch (Exception ex) {
            minimo = VALOR_MINIMO_DEFAULT;
            maximo = VALOR_MAXIMO_DEFAULT;
            int[] arr = { 32, 47, 41, 7, 47, 9, 36, 32, 20, 15 , 11, 9, 6, 37, 9, 39, 45, 29, 29, 19, 28, 21, 50, 19, 43 };
            this.arr = Arrays.copyOf(arr, 25);

            System.out.println("Argumentos não passados ou inválidos, setando os valores default abaixo:");
            System.out.println("Mínimo: " + VALOR_MINIMO_DEFAULT);
            System.out.println("Máximo: " + VALOR_MAXIMO_DEFAULT);
            System.out.println("Array: " + "32, 47, 41, 7, 47, 9, 36, 32, 20, 15 , 11, 9, 6, 37, 9, 39, 45, 29, 29, 19, 28, 21, 50, 19, 43");
            System.out.println();
        }
    }

    private boolean isPrimeiroArgumentoMaiorSegundoArgumento(String[] argumentos) {
        return Integer.parseInt(argumentos[0]) > Integer.parseInt(argumentos[1]);
    }

    private boolean isNumeroArgumentosValido(String[] argumentos) {
        return argumentos.length >= NUMERO_MINIMO_ARGUMENTOS;
    }

    public Integer getMinimo() {
        return minimo;
    }

    public Integer getMaximo() {
        return maximo;
    }

    public int[] getArr() {
        return arr;
    }
}
