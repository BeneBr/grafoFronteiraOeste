public class App {
    
    public static void main(String args[]){
        Grafo grafo = new Grafo();
        grafo.addVertice("Alegrete");
        grafo.addVertice("Rosario do Sul");
        grafo.addVertice("Manoel Viana");
        grafo.addVertice("Uruguaiana");
        grafo.addVertice("Barra do Quarai");
        grafo.addVertice("Itaqui");
        grafo.addVertice("São Borja");
        grafo.addVertice("Maçambara");
        grafo.addVertice("Santiago");
        grafo.addVertice("São Francisco de Assis");
        grafo.addAresta("Alegrete", "Rosario do Sul", 105f);
        grafo.addAresta("Alegrete", "Manoel Viana", 45.8f);
        grafo.addAresta("Alegrete", "Uruguaiana", 144f);
        grafo.addAresta("Uruguaiana", "Barra do Quarai", 71.9f);
        grafo.addAresta("Uruguaiana", "Itaqui", 104f);
        grafo.addAresta("Itaqui", "São Borja", 90.3f);
        grafo.addAresta("São Borja", "Maçambara", 68.1f);
        grafo.addAresta("Alegrete", "Maçambara", 104f);
        grafo.addAresta("São Borja", "Santiago", 143f);
        grafo.addAresta("Santiago", "São Francisco de Assis", 54.1f);
        grafo.addAresta("Manoel Viana", "São Francisco de Assis", 44.3f);
        grafo.buscaProfundidadeGrafo("São Francisco de Assis");
    }
}
