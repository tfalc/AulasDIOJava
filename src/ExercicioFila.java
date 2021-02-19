/*
Crie uma lista e execute as seguintes operações:
- Adicione 5 nomes: Juliana, Pedro, Carlos, Larissa e João
- Navegue na fila exibindo cada nome no console
- Retorne o primeiro item da fila sem removê-lo
- Retorne o primeiro item da fila removendo este
- Adicione um novo nome: Daniel. Verifique a posição que o mesmo assumiu na fila
- Retorne o tamanho da fila
- Verifique se a fila está vazia
- Verifique se o nome Carlos está na lista
 */

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class ExercicioFila {

    public static void main(String[] args) {

        Queue<String> umaFila = new LinkedList<>();

//- Adicione 5 nomes: Juliana, Pedro, Carlos, Larissa e João
        umaFila.add("Juliana");
        umaFila.add("Pedro");
        umaFila.add("Carlos");
        umaFila.add("Larissa");
        umaFila.add("João");

//- Navegue na fila exibindo cada nome no console
        System.out.println(umaFila);
//- Retorne o primeiro item da fila sem removê-lo
        String primeiroNome = umaFila.peek();
        System.out.println(primeiroNome);

//- Retorne o primeiro item da fila removendo este
        String nomeRemovido = umaFila.poll();
        System.out.println(nomeRemovido);

//- Adicione um novo nome: Daniel. Verifique a posição que o mesmo assumiu na fila
        umaFila.add("Daniel");
        System.out.println(umaFila.); //Confirma posição de Daniel no fim da FILA

//- Retorne o tamanho da fila
        System.out.println(umaFila.size());

//- Verifique se a fila está vazia
        System.out.println("A fila está vazia? Resposta: " + umaFila.isEmpty());

//- Verifique se o nome Carlos está na lista
        boolean temCarlos = umaFila.contains("Carlos");
        System.out.printf("Carlos está na fila? Resposta %s", temCarlos);


        
    }
}
