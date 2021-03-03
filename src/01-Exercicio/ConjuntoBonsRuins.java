/*
# Desafio
Nesse algoritmo você deverá descobrir se um conjunto de palavras é bom ou ruim. Por definição,
um conjunto é bom quando nenhuma palavra desse conjunto é um prefixo de outra palavra. Caso contrário,
é considerado um conjunto ruim.

Por exemplo, {dbc, dae, dbcde} é um conjunto ruim, pois dbc é um prefixo de dbcde.
Quando duas palavras são idênticas, definimos como uma sendo prefixo da outra.

## Entrada
A entrada contém vários casos de teste. A primeira linha de cada caso de teste terá um inteiro N (1 ≤ N ≤ 10⁵),
que representa a quantidade de palavras no conjunto. Segue então N linhas, cada uma tendo uma palavra de no máximo
100 letras minúsculas. A entrada termina quando N = 0 e não deve ser processada.

## Saída
Para cada caso de teste, você deverá imprimir "Conjunto Bom", ou "Conjunto Ruim", conforme explicado acima.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class ConjuntoBonsRuins {
    public static void main(String[] args) {
        //Inicialização de variáveis e listas
        int N = 0;
        int limit = (int) Math.pow(10, 5);
        Scanner qtdPalavras = new Scanner(System.in);
        ArrayList<String> palavras = new ArrayList<>();
        boolean isRuim = false;
        final String grupoRuim = "Conjunto Ruim";
        final String grupoBom = "Conjunto Bom";
        String estadoGrupo = grupoBom;
        //Fim da inicialização de variáveis e listas

        //Leitura da quantidade de itens do conjunto
        System.out.println("Insira a quantidade de linhas do conjunto: ");
        N = Integer.parseInt(qtdPalavras.nextLine());

        //Condicional para saber se número de linhas é menor ou igual a zero, o que não é permitido
        while (true) {
            if (N <= 0) {
                System.out.println("Favor insira número acima de zero!");
                break;
            } else { //Loop para leitura das palavras
                System.out.println("Insira o primeiro conjunto de letras: ");
                //Testar se palavra tem mais de 100 caracteres
                for (int i = 0; i < N; i++) {
                    palavras.add(qtdPalavras.nextLine().toLowerCase()); //lê as palavras
                }
            }
            //Testar se palavra tem as mesmas letras no começo ou no final

            for (int i = 0; i < palavras.size(); i++) {
                for (int j = 0; j < palavras.size(); j++) {
                    String comparaPalavra = palavras.get(j);
                    int cemPalavra = palavras.get(i).length(); //pega o tamanho de uma palavra de um índice
                    if (cemPalavra > limit) { //início do teste lógico se a palavra é maior que o limite
                        isRuim = true;
                        estadoGrupo = grupoRuim;
                        break;
                    }
                    if (comparaPalavra.startsWith(palavras.get(j)) || comparaPalavra.endsWith(palavras.get(j))) { //Compara as strings da lista
                        isRuim = true;
                        estadoGrupo = grupoRuim;
                    }
                }
            }
            if (isRuim) {
                break;
            }
            System.out.println(estadoGrupo);
            palavras = new ArrayList<>();
            estadoGrupo = grupoBom;
        }
        qtdPalavras.close();
    }
}
