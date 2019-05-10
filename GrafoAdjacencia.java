class GrafoAdjacencia{
    private String nome;
    private boolean[][] matriz;
    private Vertice[] vertices;

    GrafoAdjacencia(String nome, boolean[][] matriz, Vertice[] vertices){
        this.nome= nome;
        this.matriz = matriz;
        this.vertices = vertices;
    }

    //criaDeJson
    //Metodo de leitura de Json para implementar
    //Esse metodo deve ler um arquivo json no mesmo diretorio
    //E apartir dele retornar um objeto do tipo GradoAdjacencia
    // static GrafoAdjacencia criarDeJson(String nomeArquivo)

    //adicionaAresta
    //Metodo que adiciona uma aresta entre dois vertices ao grafo
    //public void adicionaAresta(int[2] aresta)

    //removeAresta
    //Metodo que remove uma aresta entre dois vertices do grafo
    //public void removeAresta(int[2] aresta)

    //adicionaVertice
    //Metodo que adiciona um vertice ao grafo
    //public void adicionaVertice(Vertice vertice)
    //public void adicionaVertice(Vertice vertice, int[] arestas)

    //removeVertice
    //Metodo que remove um vertice especifico do grafo
    //public void removeVertice(int indexDeVertice)
    
}