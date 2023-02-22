package org.util;

public class No {
    private String conteudo;
    private No proximoNo;

    public No(String conteudo) {
        this.proximoNo = null;
        this.conteudo = conteudo;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }

    public No getProximoNo() {
        return proximoNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo='" + conteudo + '\'' +
                '}';
    }
}