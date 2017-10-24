package br.com.everton.numerosprimos;

import java.util.ArrayList;
import java.util.List;

public class NumerosPrimos {

    public static void main(String[] args) {
        List<Integer> primos = new ArrayList<>();

        primos.add(2); // primeiro número primo

        int numero = 3; // começa em 3... e pula de 2 em 2, pq o único número primo que é par é o 2

        System.out.print("Números primos... 2 ");

        int resto;
        double quociente;

        while (numero <= 5000) { // altere o 5000 para o número desejado... 
            for (Integer primo : primos) {
                resto = numero % primo;

                if (resto == 0) {
                    break; // não é primo
                }

                quociente = (double) numero / primo;

                if (quociente < primo) { // primo!
                    System.out.print(numero + " ");

                    primos.add(numero);

                    break;
                }
            }

            numero += 2; // apenas números ímpares
        }
    }

}
