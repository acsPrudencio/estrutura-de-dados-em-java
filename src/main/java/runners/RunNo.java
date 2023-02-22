package runners;

import org.util.No;

import java.util.Objects;

public class RunNo {
    public static void main(String[] args) {
        No<String> n1 = new No<>("No1");

        No<String> n2 = new No<>("No2");
        n1.setProximoNo(n2);

        No<String> n3 = new No<>("No3");
        n2.setProximoNo(n3);

        No<String> n4 = new No<>("No4");
        n3.setProximoNo(n4);

        imprimeListaEncadeada(n1);
    }

    public static void imprimeListaEncadeada(No<String> no){
        if (Objects.nonNull(no)){
            System.out.println(no);
        }
        if (Objects.nonNull(no.getProximoNo())) {
            imprimeListaEncadeada(no.getProximoNo());
        }
    }
}
