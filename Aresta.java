public class Aresta {
    private Vertice inicio;
    private Vertice fim;
    float distancia = 0;

    public Aresta(Vertice inicio, Vertice fim, float distancia){
        this.inicio = inicio;
        this.fim = fim;
        this.distancia = distancia;
    }

    public Vertice gVerticeInicio(){
        return this.inicio;
    }

    public Vertice getVerticeFim(){
        return this.fim;
    }

    public float getDistancia(){
        return this.distancia;
    }
}
