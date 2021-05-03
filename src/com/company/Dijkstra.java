package com.company;

public class Dijkstra {


    public void dijkstra(int[][] graph, int source) {

        int count = graph.length;
        boolean[] visitedVertex = new boolean[count];
        int[] distance = new int[count];

        for (int i = 0; i < count; i++) {
            visitedVertex[i] = false;
            distance[i] = Integer.MAX_VALUE;
        }

        //For self distance is zero
        distance[source] = 0;

        for (int i = 0; i < count; i++) {

            // find the min distance between neighbouring vertex
            int u = findMinDistance(distance, visitedVertex);
            visitedVertex[u] = true;

            // update all neighbouring vertex distances, not visited before, is reachable, has less distance
            for(int v = 0; v < count; v++){
                if(!visitedVertex[v] && graph[u][v] != Integer.MAX_VALUE && distance[u] + graph[u][v] < distance[v]){
                    distance[v] = distance[u] + graph[u][v];
                }
            }
        }

        for (int i = 0; i < distance.length; i++) {
            System.out.println(String.format("Distance from %s to %s is %s", source, i, distance[i]));
        }
    }

    private int findMinDistance(int[] distance, boolean[] visitedVertex) {
        int minDistance = Integer.MAX_VALUE;
        int minDistanceVertex = -1;
        for (int i = 0; i < distance.length; i++) {
            if (!visitedVertex[i] && distance[i] < minDistance) {
                minDistance = distance[i];
                minDistanceVertex = i;
            }
        }

        return minDistanceVertex;
    }

    public int[][] getGraph() {

        int max = Integer.MAX_VALUE;

        return new int[][]{
                {max, 4, max, max, max, max, max, 8, max},
                {4, max, 8, max, max, max, max, 11, max},
                {max, 8, max, 7, max, 4, max, max, 2},
                {max, max, 7, max, 9, 14, max, max, max},
                {max, max, max, 9, max, 10, max, max, max},
                {max, max, 4, 15, 10, max, 2, max, max},
                {max, max, max, max, max, 2, max, 1, 6},
                {8, 11, max, max, max, max, 1, max, 7},
                {max, max, 2, max, max, max, 6, 7, max}
        };

    }
}
