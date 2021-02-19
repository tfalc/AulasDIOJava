import java.util.LinkedList;
import java.util.Queue;

public class ExemploFila {

    public static void main(String[] args){

        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Thiago");
        filaBanco.add("Janaína");
        filaBanco.add("Jairo");
        filaBanco.add("Suelani");
        filaBanco.add("Luzia");
        filaBanco.add("Edgard");

        System.out.println(filaBanco);

        //remove o item da fila no sentifo FIFO (First In First Out)
        String clienteASerAtendido = filaBanco.poll();
        System.out.println(clienteASerAtendido);
        System.out.println(filaBanco);

        //Retorna o primeiro elemento da fila sem remoção
        String primeiroCliente = filaBanco.peek();
        System.out.println(primeiroCliente);
        System.out.println(filaBanco);

        /* Diferenças entre PEEK e ELEMENT:
        PEEK: Retorna o primeiro item da fila e não o remove e se a fila estiver vazia, retorna NULL
        ELEMENT: Retorna o primeiro item da fila e não o remove e retorna erro se fila estiver vazia
         */

        //Faz teste de erro e lança o erro caso este ocorra
        //filaBanco.clear(); //zerar a fila
        String primeiroClienteOuErro = filaBanco.element(); //Exibe NoSuchElementException em caso de falha
        System.out.println(primeiroClienteOuErro);

        //iterar Fila
        for(String client: filaBanco){
            System.out.print(client + " ");
        }

    }
}
