/*
1 - Crie uma lista e execute as seguintes operações:

- Adicione 5 nomes: Juliana, Pedro, Carlos, Larissa e João;
- Navegue na lista exibindo cada nome no console;
- Substitua o nome Carlos por Roberto;
- Retorne o nome da posição 1;
- Remova o nome da posição 4;
- Remova o nome João;
- Retorne a quantidade de itens na lista;
- Verifique se o nome Juliano existe na lista;
- Crie uma nova lista com os nomes Ismael  e Rodrigo. Adicione todos os itens da nova lista
na primeira lista criada.
- Ordene os itens da lista por ordem alfabética.
- Verifique se a lista está vazia.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExercicioLista {
    public static void main(String[] args){

        //criar lista
        List<String> nomes = new ArrayList<>();

        //adicionar nomes
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        //exibir nomes no console
        for(String nome: nomes){
            System.out.println(nome);
        }

        //substituir o nome Carlos por Roberto;
        nomes.set(2, "Roberto");
        System.out.println("Alterado nome Carlos por: " + nomes.get(2));

        //Retornar o nome da posição 1
        System.out.println("O nome na posição [1] é: " + nomes.get(1));

        //Remover nome da posição 4
        nomes.remove(4);
        System.out.println("Removido o nome da posição [4] com sucesso!");
        System.out.println(nomes);

        //Remover o nome João
        nomes.remove("João");
        System.out.println("O nome João foi removido com sucesso!");
        for(String nome: nomes){
            System.out.println(nomes);
        }

        //Retornar a quantidade de itens na lista
        System.out.println("O tamanho atual da lista é : " + nomes.size());

        //Verificar se o nome "Juliano" existe na lista
        boolean temNome = nomes.contains("Juliano");
        System.out.println("O nome Juliano existe na lista? Resposta: " + temNome);

        //Crie uma nova lista com os nomes Ismael  e Rodrigo. Adicione todos os itens da nova lista
        //na primeira lista criada.
        List<String> nomesNovos = new ArrayList<>();
        nomesNovos.add("Ismael");
        nomesNovos.add("Rodrigo");

        nomes.addAll(nomesNovos);
        System.out.println(nomes);

        //Ordene os itens da lista por ordem alfabética.
        Collections.sort(nomes);
        System.out.println("Lista ordenada em ordem alfabética " + nomes);

//        Verifique se a lista está vazia.
        boolean isEmpty = nomes.isEmpty();
        System.out.println("A lista está vazia? Resposta: " + isEmpty);


    }
}
