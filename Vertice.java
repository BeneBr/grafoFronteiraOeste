import java.util.ArrayList;

public class Vertice {
    String nomeCidade;
    int grauVertice = 0;
    ArrayList<Aresta> arestas;

    public Vertice(String nomeCidade){
        this.nomeCidade = nomeCidade;
        arestas = new ArrayList<Aresta>();
    }
    
    public String getNomeCidade(){
        return this.nomeCidade;
    }

    public void addAresta(Aresta aresta){
        this.grauVertice++;
        this.arestas.add(aresta);
    }

    public ArrayList<Aresta> getArestas(){
        return this.arestas;
    }

    public ArrayList<Vertice> getVerticesAdjacentes(){
        ArrayList<Vertice> verticesAdjacentes = new ArrayList<Vertice>();
        for(int i=0; i< arestas.size();i++){
            verticesAdjacentes.add(arestas.get(i).getVerticeFim());
        }
        return verticesAdjacentes;
    }
}
