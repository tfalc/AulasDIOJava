import java.util.HashMap;
import java.util.Map;

public class ExemploMap {
    public static void main(String[] args) {
        //inicia mapa
        Map<String, Integer> campeoesMundiaisFifa = new HashMap<>();

        //Adiciona seleções ao mapa
        campeoesMundiaisFifa.put("Brasil", 5);
        campeoesMundiaisFifa.put("Alemanha", 4);
        campeoesMundiaisFifa.put("Itália", 4);
        campeoesMundiaisFifa.put("Uruguai", 2);
        campeoesMundiaisFifa.put("Argentina", 2);
        campeoesMundiaisFifa.put("França", 2);
        campeoesMundiaisFifa.put("Inglaterra", 1);
        campeoesMundiaisFifa.put("Espanha", 1);

        System.out.println(campeoesMundiaisFifa);

        //Atualiza o valor para a chave Brasil
        campeoesMundiaisFifa.put("Brasil", 6);

        //Retorna Argentina
        System.out.println("Quantos títulos a Argentina tem? Resposta: " + campeoesMundiaisFifa.get("Argentina"));

        //Retorna se existe ou não um campeão França
        System.out.println("França tem título? Resposta: " + campeoesMundiaisFifa.containsKey("França"));

        //Remove o campeão França
        campeoesMundiaisFifa.remove("França");

        //Retorna se existe ou não um campeão França
        System.out.println("França está entre os campeões? Resposta: " + campeoesMundiaisFifa.containsKey("França"));

        //Retorna se existe ou não um hexacampeão
        System.out.println("Existe algum hexacampeão? Resposta: " + campeoesMundiaisFifa.containsValue(6));

        //Retorna o tamanho do mapa
        System.out.println("O tamanho do mapa é: " + campeoesMundiaisFifa.size());

        //Navegar nos registros do mapa
        for (Map.Entry<String, Integer> entry: campeoesMundiaisFifa.entrySet()){
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }

        //Naveger nos registros do mapa
        for(String key: campeoesMundiaisFifa.keySet()){
            System.out.println(key + " -- " + campeoesMundiaisFifa.get(key));
        }

        //imprime mapa
        System.out.println(campeoesMundiaisFifa);
        System.out.println(campeoesMundiaisFifa.get(3));

        //Verifica se o mapa contem a chave Estados Unidos
        System.out.println("Estados Unidos está entre os campeões? Resposta: " + campeoesMundiaisFifa.containsKey("Estados Unidos"));

        //Verificar se o mapa contem o valor 5
        System.out.println("Existe algum pentacampeão? Resposta: " + campeoesMundiaisFifa.containsValue(5));

        //Verifica o tamanho antes e depois de limpar o mapa
        System.out.println("Tamanho do mapa antes da limpeza: " + campeoesMundiaisFifa.size());
        campeoesMundiaisFifa.clear();
        System.out.println("Tamanho do mapa após a limpeza: " + campeoesMundiaisFifa.size());

        Map<String, String> estado = new HashMap<>();
        estado.put("RS","Porto Alegre");
        estado.put("PB","João Pessoa");
        estado.put("TO","Palmas");
        estado.put("RJ","Rio de Janeiro");

        estado.put("GO", null);
        estado.put("RO", null);
        System.out.println(estado);
        System.out.println(estado.get("SC")); //retorna null
        System.out.println(estado.get("Rio de Janeiro")); //retorna null
        System.out.println(estado.put("AM", "Manaus")); //Adiciona ao final do map
        //System.out.println(estado.set("RJ", "Búzios")); // Erro de Compilação

    }
}
