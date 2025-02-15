package projeto_revisao_ed;
public class Vetor {
    public String[] elementos;
    public int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public void adiciona(String elemento) throws Exception{
        if(this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("O vetor já está cheio, não é possível adicionar novos elementos");
        }
    }

    public int tamanho() {
        return this.tamanho;
    }
}
