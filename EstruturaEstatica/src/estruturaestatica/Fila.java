package estruturaestatica;

public class Fila<T> extends EstruturaEstatica<T> {
    public Fila(){
        super();
    }

    public Fila(int capacidade){
        super(capacidade);
    }

    public void enfileira(T elemento){
        this.adiciona(elemento);
    }

    public T espiar(){
        if(this.estaVazia()){
            return null;
        }
        return this.elementos[0];
    }

    public T desemfileira(){
        if(this.estaVazia()){
            return null;
        }

        //Já temos um método para remover na classe pai porém precisa 
        //a posição e para isso vamos criar uma contante
        final int POS = 0;

        T elementoRemovido = this.elementos[POS];
        this.remove(POS);
        return elementoRemovido;
    } 
}
