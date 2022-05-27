/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.dfs;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class DFS {
    
static class Graph{
    int vertices;
    LinkedList<Integer> adjList[];
        private boolean[] visited;
    
    Graph(int vertics){
        this.vertices=vertices;
        adjList = new LinkedList[vertices];
        for(int i = 0;i<vertices;i++){
            adjList[i]= new LinkedList<>();
        }
    }
    void addEdge(int source, int destination){
        adjList[source].addFirst(destination);
    }
    void DFS(int startVertex){
        boolean visited[] = new boolean[vertices];
        dfsRecursion(startVertex);
    }
    void dfsRecursion(int start){
        visited[start]= true;
        System.out.print(start+" ");
        for(int i = 0;i<adjList[start].size();i++){
            int dest = adjList[start].get(i);
            if(visited[dest])
                dfsRecursion(dest);
        }
    }

        
}

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        System.out.println("Enter number of Vertices:");
        int v = s.nextInt();
        Graph g = new Graph(v);
        for(int i =0;i<v;i++){
        int  source = s.nextInt();
        int destination = s.nextInt();
        g.addEdge(source,destination);
    }   
        g.DFS(0);
    }
}
