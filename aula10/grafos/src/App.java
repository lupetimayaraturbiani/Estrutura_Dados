public class App {
    public static void main(String[] args) throws Exception {
        Grafo<String> grafo = new Grafo<String>();

        grafo.adicionaVertice("Paulo");;
        grafo.adicionaVertice("Lorenzo");
        grafo.adicionaVertice("Cleusa");
        grafo.adicionaVertice("Kleber");
        grafo.adicionaVertice("Claudia");

        grafo.adicionaAresta(2.0, "Paulo", "Lorenzo");
        grafo.adicionaAresta(3.0, "Lorenzo", "Kleber");
        grafo.adicionaAresta(1.0, "Kleber", "Cleusa");
        grafo.adicionaAresta(1.0, "Paulo", "Cleusa");
        grafo.adicionaAresta(2.0, "Claudia", "Lorenzo");
        grafo.adicionaAresta(3.0, "Claudia", "Paulo");

        grafo.buscaEmLargura();
    }
}
