package bpm2.src;
/* ======================================================================================================================== */
// Desafio 3
// Sequência de Fibonacci (Recursividade)

    /*
    A Sequência de Fibonacci tem como primeiros termos os números 0 e 1 e, a seguir,
    cada termo subsequente é obtido pela soma dos dois termos predecessores:
    0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...

    Fibonacci(0) = 0
    Fibonacci(1) = 1
    Fibonacci(n) = Fibonacci(n-1) + Fibonacci(n-2)

    - Entrada

    O arquivo de entrada contém um valor inteiro N.

    - Saída

    Imprima o valor relativo ao N número da sequência de Fibonacci, exemplo:

    N = 0  => saída "Fib = 0"
    N = 1  => saída "Fib = 1"
    N = 3  => saída "Fib = 2"
    M = 29 => saída "Fib = 514229"

     */

import java.util.Scanner;

public class Fibbonacci {

    public static void main(String args[])  {
        Scanner input = new Scanner(System.in);
        int n;

        n = input.nextInt();

        System.out.println("Fib = " + fibonacci(n));
    }

    public static int fibonacci(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        return fibonacci(x - 1) + fibonacci(x - 2);
    }
}

