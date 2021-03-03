import java.util.*;

public class ExemploList {
    public static void main(String[] args){

        List<String> nomes = new ArrayList<>();

        nomes.add("Thiago");
        nomes.add("Janaína");
        nomes.add("Luzia");
        nomes.add("Edgard");

        //imprime nomes na ordem de entrada
        System.out.println(nomes);
        //Saída: [Thiago, Janaína, Luzia, Edgard]

        //altera nome na posição [i]
        nomes.set(2, "Camilo");
        //Saída [Thiago, Janaína, Camilo, Edgard]

        //imprime lista com os nomes alterados
        System.out.println(nomes);
        //imprime [Camilo, Edgard, Janaína, Thiago]

        //ordena os nomes em ordem crescente
        Collections.sort(nomes);

        //imprime os nomes ordenados anteriormente
        System.out.println(nomes);

        //remove um elemento da lista
        nomes.remove(nomes.size() - 1);

        //imprime nomes após remoção
        System.out.println(nomes);
        //Imprime [Camilo, Edgard, Janaína]

        //Retorna quantos elementos tem na lista
        int tamanho = nomes.size();
        System.out.println("A lista de nome tem " + tamanho + " elementos");
        //Imprime //Imprime A lista de nome tem 3 elementos

        //testa se elemento <elemento> exista na lista
        boolean temNaLista = nomes.contains("Diego");
        System.out.println("O nome Diego existe na lista? Resposta: " + temNaLista);
        //Imprime O nome Diego existe na lista? Resposta: false

        //Retorna o número da posição de um índice da lista
        int posicao = nomes.indexOf("Janaína");
        System.out.println("O nome Janaína está na posição " + posicao + " na lista");
        //Imprime O nome Janaína está na posição 2 na lista


        //iterar dentro de uma lista / Collection
        for (String nome: nomes){
            System.out.println(nomes.indexOf(nome) + " " + nome);
        }
        /*
        Imprime
        0 Camilo
        1 Edgard
        2 Janaína
         */

        //outra forma de iterar os elementos de uma lista/Colletcion
        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()){
            System.out.println("> " + iterator.next());
        }
        /*
        Imprime
        > Camilo
        > Edgard
        > Janaína
         */
    }
}