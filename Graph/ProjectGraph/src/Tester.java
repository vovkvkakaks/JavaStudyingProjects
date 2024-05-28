import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Tester {

    static class Pair<T, U> {
        public final T first;
        public final U second;

        public Pair(T first, U second) {
            this.first = first;
            this.second = second;
        }
    }
	public static void main(String[] args) {
		 Graph graph1 = generateRandomGraph(10);
	        Graph graph2 = generateRandomGraph(10);
	        Graph graph3 = generateRandomGraph(10);

	        // Test and print connected components for each graph
	        System.out.println("Connected Components for Graph 1:");
	        System.out.println(graph1.components());

	        System.out.println("Connected Components for Graph 2:");
	        System.out.println(graph2.components());

	        System.out.println("Connected Components for Graph 3:");
	        System.out.println(graph3.components());
	    }
    private static Graph generateRandomGraph(int vertices) {
        Graph randomGraph = new Graph();
        for (int i = 0; i < vertices; i++) {
            randomGraph.addVertex();
        }
        Random random = new Random();
        Set<Pair> addedEdges = new HashSet<>();

        for (int i = 0; i < vertices * 2; i++) {
            int v = random.nextInt(vertices);
            int w = random.nextInt(vertices);
            while (v == w || addedEdges.contains(new Pair(v, w)) || addedEdges.contains(new Pair(w, v)) || randomGraph.isEdge(v, w)) {
                v = random.nextInt(vertices);
                w = random.nextInt(vertices);
            }
            addedEdges.add(new Pair(v, w));
            randomGraph.addEdge(v, w);
        }

        return randomGraph;
    }
}

