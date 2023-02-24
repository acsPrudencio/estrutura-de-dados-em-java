package runners;

import org.pilha.No;
import org.pilha.Pilha;

import java.util.Objects;

public class RunPilha {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<Integer>();

        System.out.println("A pilha estar vazia? " + pilha.isEmpty());
        pilha.push(new No<>(1));
        pilha.push(new No<>(2));
        pilha.push(new No<>(3));
        pilha.push(new No<>(4));
        pilha.push(new No<>(5));
        System.out.println("A pilha estar vazia? " + pilha.isEmpty());
        imprimeListaEncadeada(pilha.getRefNoInicial());

    }
    public static void imprimeListaEncadeada(No<Integer> item){
        if (Objects.nonNull(item)){
            System.out.println(item);
        }
        if (Objects.nonNull(item.getRefNode())) {
            imprimeListaEncadeada(item.getRefNode());
        }
    }
}
