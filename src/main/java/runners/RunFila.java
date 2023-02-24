package runners;

import org.fila.Fila;
import org.fila.No;

public class RunFila {
    public static void main(String[] args) {

        Fila<String> minhaFila = new Fila<>();

        minhaFila.enqueue("primeiro");
        minhaFila.enqueue("segundo");
        minhaFila.enqueue("terceiro");
        minhaFila.enqueue("quarto");
        minhaFila.enqueue("quinto");


        System.out.println("Removendo elemento: " + minhaFila.dequeue());
        minhaFila.enqueue("sexto");

        System.out.println("##################");
        System.out.println("Primeiro elemento da fila: " + minhaFila.first());

        System.out.println("##################");
        System.out.println("Todos os elementos da fila: " + minhaFila.first());
        System.out.println(minhaFila);

    }
}
