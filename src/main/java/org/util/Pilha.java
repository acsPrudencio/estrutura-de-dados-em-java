package org.util;

public class Pilha<T> {

    private No<T> refNoInicial;

    public Pilha(){
        this.refNoInicial = null;
    }

    public boolean isEmpty(){
        if (refNoInicial == null){
            return true;
        }
        return false;
    }

    public No<T>  top(){
        return refNoInicial;
    }

    public void push(No<T>  newNode){
        No<T> aux = refNoInicial;
        refNoInicial = newNode;
        refNoInicial.setRefNode(aux);
    }
    public No pop(No<T>  node){
        if (!this.isEmpty()){
            No<T> noPoped = refNoInicial;
            refNoInicial = refNoInicial.getRefNode();
            return noPoped;
        }
        return null;
    }

    @Override
    public String toString() {
        return "Pilha{" +
                "refNoInicial=" + refNoInicial +
                '}';
    }

    public No<T> getRefNoInicial() {
        return refNoInicial;
    }
}
