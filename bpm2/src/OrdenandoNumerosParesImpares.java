package bpm2.src;/* ======================================================================================================================== */
// Desafio 1
// Ordenando Números Pares e Ímpares

/* Crie um programa onde você receberá valores inteiros não negativos como
entrada.

Ordene estes valores de acordo com o seguinte critério:

- Primeiro os Pares
- Depois os Ímpares
- Você deve exibir os pares em ordem crescente e na sequência os ímpares em
ordem decrescente.

- Entrada

A primeira linha de entrada contém um único inteiro positivo N (1 < N < 10000)
Este é o número de linhas de entrada que vem logo a seguir. As próximas N
linhas terão, cada uma delas, um valor inteiro não negativo.

- Saída

Exiba todos os valores lidos na entrada segundo a ordem apresentada acima.
Cada número deve ser impresso em uma linha, conforme exemplo de saída abaixo.
*/

import java.util.*;


public class OrdenandoNumerosParesImpares {


    public static void main(String args[]) throws Exception {
        Random random = new Random();
        List<Integer> listaNumeros = new ArrayList<>();
        List<Integer> listaPares = new ArrayList<>();
        List<Integer> listaImpar = new ArrayList<>();
        List<Integer> listaResultante = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            listaNumeros.add(random.nextInt(100));
        }
        System.out.println(listaNumeros);

        for (int i = 0; i < 20; i++) {

            if (listaNumeros.get(i) % 2 == 0) {
                listaPares.add(listaNumeros.get(i));
            } else {
                listaImpar.add(listaNumeros.get(i));
            }
        }
        //ordenação bubble sort par
        int auxPar;
        for (int i = 0; i < listaPares.size() - 1; i++) {
            for (int j = 0; j < listaPares.size() - 1; j++) {
                if (listaPares.get(j) > listaPares.get(j + 1)) {
                    auxPar = listaPares.get(j);
                    listaPares.set(j, listaPares.get(j + 1));
                    listaPares.set(j + 1, auxPar);

                }
            }
        }
        //ordenacao bubblesort impar
        int auxImpar;
        for (int i = 0; i < listaImpar.size() - 1; i++) {
            for (int j = 0; j < listaImpar.size() - 1; j++) {
                if (listaImpar.get(j) < listaImpar.get(j + 1)) {
                    auxImpar = listaImpar.get(j);
                    listaImpar.set(j, listaImpar.get(j + 1));
                    listaImpar.set(j + 1, auxImpar);

                }
            }
        }
        listaResultante.addAll(listaPares);
        listaResultante.addAll(listaImpar);

//        System.out.println("lista de pares ordenados de forma crescente" + listaPares);
//        System.out.println("lista de impares ordenados de forma descrescente" + listaImpar);
//        System.out.println("lista final " + listaResultante);
        listaResultante.forEach(System.out::println);

    }
}
