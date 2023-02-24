package org.pilha;

public class No<T> {
    private T conteudo;
    private No<T> refNode = null;

    public No(T conteudo) {
        this.refNode = null;
        this.conteudo = conteudo;
    }
    public No(){}

    public void setRefNode(No refNode) {
        this.refNode = refNode;
    }

    public No<T> getRefNode() {
        return refNode;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo='" + conteudo + '\'' +
                '}';
    }
}