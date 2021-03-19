import java.util.ArrayList;
import java.util.Random;

public class Grafo {
    private ArrayList<Vertice> vertices;
    private ArrayList<Aresta> arestas;
    
    public Grafo(){
        vertices = new ArrayList<Vertice>();
        arestas = new ArrayList<Aresta>();
    }

    public void addVertice(String nomeCidade){
        Vertice verticeEncontrado = buscarVertice(nomeCidade);
        if(verticeEncontrado == null){
            Vertice novoVertice = new Vertice(nomeCidade);
            this.vertices.add(novoVertice);
        }else{
            System.out.println("Vertice: " + nomeCidade + " ja esta no Grafo");
        }
    }

    public void addAresta(String nomeCidadeInicio, String nomeCidadeFim, float distancia){
        Vertice inicio = buscarVertice(nomeCidadeInicio);
        Vertice fim = buscarVertice(nomeCidadeFim);
        if(inicio == null || fim == null){
            System.out.println("Um dos vertices não esta presente no grafo");
        }else{
            Aresta arestaInicioFim = new Aresta(inicio, fim, distancia);
            Aresta arestaFimInicio = new Aresta(fim, inicio, distancia);
            inicio.addAresta(arestaInicioFim);
            fim.addAresta(arestaFimInicio);
            this.arestas.add(arestaInicioFim);
            this.arestas.add(arestaFimInicio);
        }
    }
    public void showVertices(){
        for(int i=0;i<this.vertices.size(); i++){
            System.out.println(this.vertices.get(i).getNomeCidade());
        }
    }

    public void showVerticesAdjacentes(String nomeCidade){
        Vertice verticeEncontrado = buscarVertice(nomeCidade);
        if(verticeEncontrado == null){
            System.out.println("Vertice não esta no grafo");
        }else{
            ArrayList<Vertice> verticesAdjacentes = verticeEncontrado.getVerticesAdjacentes();
            for(int i=0; i<verticesAdjacentes.size(); i++){
                System.out.println(verticesAdjacentes.get(i).getNomeCidade());
            }
        }
    }

    private Vertice buscarVertice(String nomeCidade){
        Vertice verticeEncontrado = null;
        for(int i=0; i<vertices.size(); i++){
            if(vertices.get(i).getNomeCidade() == nomeCidade){
                verticeEncontrado = vertices.get(i);
            }
        }
        return verticeEncontrado;
    }
    

    public void buscaProfundidadeGrafo(String nomeCidade){
        int visitado[] = new int[this.vertices.size()];
        Vertice verticeEncontrado = buscarVertice(nomeCidade);
        int indiceVerticeInicial = this.vertices.indexOf(verticeEncontrado);
        int i, contador = 1;
        for(i=0;i<this.vertices.size(); i++){
            visitado[i] = 0;
        }
        buscaProfundidade(indiceVerticeInicial, visitado, contador);
        for(i=0;i<visitado.length; i++){
            System.out.println("A Profundidade da Origem até: " + this.vertices.get(i).getNomeCidade() + " é:" + visitado[i]);
        }
    }

    public void buscaProfundidade(int inicial, int visitado[], int contador){
        int i;
        visitado[inicial] = contador; 
        System.out.println(this.vertices.get(inicial).getNomeCidade());
        for(i=0;i<this.vertices.get(inicial).getArestas().size();i++){
            Vertice vertice = this.vertices.get(inicial).getArestas().get(i).getVerticeFim();
            int indiceVertice = this.vertices.indexOf(vertice);
            if(visitado[indiceVertice] == 0){
                buscaProfundidade(indiceVertice, visitado, contador+1);
            }
        }
    }
    
}
