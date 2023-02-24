package org.fila;

import java.util.Objects;

public class Fila<T> {

    private No<T> refNoEntradaFila;

    public Fila(){
        this.refNoEntradaFila = null;
    }

    public void enqueue(T obj){
        No novoNo = new No(obj);
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public boolean isEmpty(){
        return Objects.isNull(refNoEntradaFila) ? true : false;
    }

    public T first(){
        if (!isEmpty()){
            No primeiroNo = refNoEntradaFila;
            while (true){
                if (Objects.nonNull(primeiroNo.getRefNo())){
                    primeiroNo = primeiroNo.getRefNo();
                }else {
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    public T dequeue(){
        if (!isEmpty()){
            No primeiroNo = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila;
            while (true){
                if (Objects.nonNull(primeiroNo.getRefNo())){
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                }else {
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    @Override
    public String toString() {
        String retorno = "";
        No noAuxiliar = refNoEntradaFila;

        if (Objects.nonNull(refNoEntradaFila)){
            while (true){
                retorno += "No{Conteúdo=" + noAuxiliar.getObject() + "}]\n";
                if (Objects.nonNull(noAuxiliar.getRefNo())){
                    noAuxiliar = noAuxiliar.getRefNo();
                }else {
                    retorno += "null";
                    break;
                }
            }
        }else {
            retorno = "null";
        }


        return retorno;
    }
}
