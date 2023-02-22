package org.util;

import java.util.Objects;

public class RunNo {
    public static void main(String[] args) {
        No n1 = new No("No1");

        No n2 = new No("No2");
        n1.setProximoNo(n2);

        No n3 = new No("No3");
        n2.setProximoNo(n3);

        No n4 = new No("No4");
        n3.setProximoNo(n4);

//        while (true){
//            System.out.println(n1);
//        }


    }

//    public static boolean imprimeProximoNo(No no){
//        if (Objects.isNull(no.getProximoNo())){
//            return false;
//        }
//        System.out.println();
//        return true;
//    }
}
