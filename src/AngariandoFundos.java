/*
#ANGARIANDO FUNDOS
Uma politica de prestígio visando a presidência no próximo ano está planejando um evento para angariar fundos para sua
campanha. Ela possui uma lista de pessoas abastadas no país e quer convidá-los de uma forma a maximizar seus fundos.

Algumas vezes os ricos e abastados tem comportamentos fúteis e não gostam da ideia de alguém mais rico ou bonito do que
eles existir. Toda vez que alguém assim encontra uma pessoa rigorosamente mais bonita, mas não rigorosamente mais rica,
então uma discussão começa. Similarmente, se eles encontram uma pessoa que é rigorosamente mais rica mas não
rigorosamente mais bonita uma discussão também começa. Essas duas situações são as únicas causas possíveis de
discussões entre dois indivíduos. Assim, duas pessoas nunca discutirão caso uma seja estritamente mais bonita e
mais rica que a outra. Também não ocorrem discussões quando ambas as pessoas são igualmente ricas e igualmente bonitas.

Como a nossa presidenciável gostaria de garantir o máximo de dinheiro possível, discussões devem ser evitadas a q
ualquer custo, pois poderiam arruinar a campanha ou o evento. Dado as características de algumas pessoas abastadas
no país, você deve encontrar uma lista de convidados que maximize as doações enquanto garanta que nenhuma discussão
ocorra no evento.

## Entrada
A primeira linha contem um inteiro N (1 ≤ N ≤ 10^5 ) representando o número possível de convidados. Cada uma das
 próximas N linhas descreve um possível candidato com três inteiros B, F e D (1 ≤ B, F, D ≤ 10^9 ), indicando
 respectivamente seu nivel de beleza, sua fortuna e quanto esta pessoa doaria caso fosse convidada.

## Saída
Imprima uma única linha contendo um inteiro que indica a soma máxima de doações possíveis para uma lista de
convidados que não gere discussão alguma durante o evento.

Exemplos de Entrada	Exemplos de Saída
┌───────────┬───────────┬──┬───────────┬───────────┬──┬───────────┬───────────┐
│ Exemplo 1 │ Resultado │  │ Exemplo 2 │ Resultado │  │ Exemplo 3 │ Resultado │
├───────────┼───────────┼──┼───────────┼───────────┼──┼───────────┼───────────┤
│         4 │        60 │  │         3 │         9 │  │         3 │        25 │
│    1 2 50 │           │  │     3 3 3 │           │  │    2 8 13 │           │
│    2 1 50 │           │  │     5 5 3 │           │  │    1 4 12 │           │
│    2 2 30 │           │  │     2 2 3 │           │  │    2 1 16 │           │
│    1 1 30 │           │  │           │           │  │           │           │
└───────────┴───────────┴──┴───────────┴───────────┴──┴───────────┴───────────┘

 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AngariandoFundos {

    public static void main(String[] args) {
        int fund = 0;
        int contador = 0;

        System.out.println("Digite a quantidade de convidados: "); //requisitar a quantidade de convidados
        Scanner sc = new Scanner(System.in);
        int nConvidado = Integer.parseInt(sc.nextLine());
        if (nConvidado < 1) {
            System.out.println("Quantidade de convidados não pode ser negativa. Repita o processo.");
        } else if (nConvidado > (10 ^ 5)) {
            System.out.println("Quantidade de convidados excede a capacidade do evento.");
        } else {
            int[][] a = new int[nConvidado][4];
        }


        List<String> contaRiqueza = new ArrayList<>();

        while (nConvidado > contador) {
            System.out.println("Digite, separado por espaço, os dados do próximo convidado: ");
            String s = sc.nextLine();
            contaRiqueza.add(s);
            contador++;
        }
        System.out.println("Estes são os dados dos possíveis candidatos! " + "\n" + contaRiqueza.stream()
                .peek(System.out::println)
        .map(listaConvidado -> listaConvidado.concat(", ")
        .concat(String.valueOf(listaConvidado.length())))
        .collect(Collectors.groupingBy(listaConvidado -> listaConvidado.substring(listaConvidado.indexOf(",") + 1))));
        System.out.println("Este é o total de doações conforme a quantidade de candidatos que foram chamados: " + fund);
    }
}