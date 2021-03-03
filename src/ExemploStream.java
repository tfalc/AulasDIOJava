import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStream {
    public static void main(String[] args) {
        //Cria a coleção de alunos
        List<String> estudantes = new ArrayList<>();

        //Adiciona estudantes à coleção
        estudantes.add("Pedro");
        estudantes.add("Thays");
        estudantes.add("Marcelo");
        estudantes.add("Carla");
        estudantes.add("Juliana");
        estudantes.add("Thiago");
        estudantes.add("Rafael");

        //Retorna a contagem de elementos do stream
        System.out.println("Contagem: " + estudantes.stream().count());

        //Retorna o elemento com maior numero de letras
        System.out.println("Maior numero de letras: " + estudantes
                .stream()
                .max(Comparator.comparingInt(String::length)));

        //Retorna o elemento com menor numero de letras
        System.out.println("Menor numero de letras: " + estudantes
                .stream()
                .min(Comparator.comparingInt(String::length)));

        //Retorna os elementos que tem a letra R no nome
        System.out.println(("Com letra R no nome: " + estudantes
                .stream()
                .filter((estudante) -> estudante
                        .toLowerCase()
                        .contains("r"))
                .collect(Collectors.toList())));

        //Retorna uma nova coleção, com os nomes concatenados a quantidade de letra de cada nome
        System.out.println("Retornando uma nova coleção com a quantidade de letras: " + estudantes.stream().
                map(estudante -> estudante
                        .concat(" - ")
                        .concat(String.valueOf(estudante.length())))
                .collect(Collectors.toList()));

        //Retorna somente os 3 primeiros elementos da coleção
        System.out.println("Retorna os 3 primeiros: " + estudantes.stream().limit(3).collect(Collectors.toList()));

        //Exibe cada elemento no console e depois retorna a mesma coleção
        System.out.println("Retorna os elementos novamente: ");
        estudantes.stream().forEach(System.out::println);

        //Retorna true se todos os elementos possuem a letra W no nome
        System.out.println("Todos os elementos tem W no nome? " + estudantes.stream()
                .allMatch((elemento) -> elemento.contains("W")));

        //Retorna true se algum dos elementos possuem a letra a minúscula no nome
        System.out.println("Tem algum elemento com a letra A em minúsculo? " + estudantes.stream()
                .anyMatch((elemento) -> elemento.contains("a")));
        System.out.println("EXERCICIO: " + estudantes.stream().count());

        //Retorna o primeiro elemento da coleção, se existir exibe no console
        System.out.println("Retorna o primeiro elemento da coleção: ");
        estudantes.stream().findFirst().ifPresent(System.out::println);

        //Exemplo de operação encadeada
        System.out.println("Operação encadeada: ");
        System.out.println(estudantes.stream().peek(System.out::println)
                .map(estudante ->
                        estudante.concat(" - ").concat(String.valueOf(estudante.length())))
                .peek(System.out::println)
                .filter((estudante) ->
                        estudante.toLowerCase().contains("r"))
                //.collect(Collectors.toList())); //cria lista
                //.collect(Collectors.joining(", "))); //lista ordenada
                // .collect(Collectors.toSet())); //lista não ordenada
                .collect(Collectors.groupingBy(estudante ->
                        estudante.substring(estudante.indexOf("-") + 1)))); //agrupa gerando chave de grupo

        /*
        EXERCICIO

        Utilize uma lista com um objeto complexo (Estudante, por exemplo) e realize as seguintes operaçõe:
        1- Transforme cada estudante em uma string com os atributos do objeto
        2- Conte a quantidade de estudantes tem na coleção
        3- Filtre estudantes com idade igual ou superior a 18 anos
        4- Exibe cada elemento no console
        5- Retorne estudantes com nome que possua a letra B
        6- Retorne se existe ao menos um estudante com a letra D no nome
        7- Retorne o estudante mais velho (maior idade) da coleção. Retorne o mais novo também.
         */


    }

    public static void printarSoma(int... numeros) {
        int soma;
        if (numeros.length > 0) {
            soma = 0;
            for (var numero = 0; numero < numeros.length; numero++) {
                soma += numeros[numero];
            }

            System.out.println("A soma e ::: " + soma);
        }
    }
}