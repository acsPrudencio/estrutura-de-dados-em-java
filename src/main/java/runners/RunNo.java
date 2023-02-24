package runners;

import org.pilha.No;

import java.util.Objects;

public class RunNo {
    public static void main(String[] args) {
        No<String> n1 = new No<>("No1");

        No<String> n2 = new No<>("No2");
        n1.setRefNode(n2);

        No<String> n3 = new No<>("No3");
        n2.setRefNode(n3);

        No<String> n4 = new No<>("No4");
        n3.setRefNode(n4);

        imprimeListaEncadeada(n1);
    }

    public static void imprimeListaEncadeada(No<String> no){
        if (Objects.nonNull(no)){
            System.out.println(no);
        }
        if (Objects.nonNull(no.getRefNode())) {
            imprimeListaEncadeada(no.getRefNode());
        }
    }
}
