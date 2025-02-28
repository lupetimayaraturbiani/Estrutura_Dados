package projeto_revisao_ed;

public class VetorObjeto {
    public Object[] elementos;
    public int tamanho;

    //Contrutor
    public VetorObjeto(int capacidade) {
        this.elementos = new Object[capacidade];
        this.tamanho = 0;
    }

    //Métodos adicionar e adicionar em determinado espaço
    public void adiciona(Object elemento) throws Exception{
        this.aumentaCapacidade();
        this.elementos[this.tamanho] =elemento;
        this.tamanho ++;
    }

    public boolean adicionaInicio(int posicao, Object elemento) throws Exception{
        this.aumentaCapacidade();
        if (posicao >= 0 && posicao < tamanho) {
            for (int i = this.tamanho - 1; i >= posicao; i--) {
                this.elementos[i + 1] = this.elementos[i];
            }
            this.elementos[posicao] = elemento;
            this.tamanho ++;
        } else {
            throw new Exception("Posição inválida");
        }
        return true;
    }

    //Método que exibe os dados da classe(toString)
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[\n");

        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append("\n");
        }

        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }
        
        s.append("]");

        return s.toString();
    }

    public void aumentaCapacidade(){
        if (this.tamanho == this.elementos.length) {
            Object[] elementosNovos = new String[this.elementos.length * 2];
            for (int i = 0; i < elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    

    public int tamanho() {
        return this.tamanho;
    }

    

    public Object busca(int posicao) throws Exception{
        if (posicao >= 0 && posicao < tamanho) {
            return this.elementos[posicao];
        } else {
            throw new Exception("Posição inválida");
        }
    }

    public int buscaPorElemento(String elemento) {
        for (int i = 0; i < tamanho; i++) {
            if(elementos[i].equals(elemento)){
                return i;
            }
        }

        return -1;
    }

    public void remove(int posicao) throws Exception{
        if (posicao >= 0 && posicao < tamanho) {
            for (int i = posicao; i < this.tamanho - 1 ; i++) {
                this.elementos[i] = this.elementos[i+1];
            }
            this.elementos[tamanho] = null;
            this.tamanho --;
        } else {
            throw new Exception("Posição inválida");
        }
    }

    public int removeByElement(String elemento) throws Exception{
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elemento)) {
                this.remove(i);
                return 1;
            }
        }
        return -1;
    }
}
