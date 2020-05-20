/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum1;

/**
 *
 * @author ASUS
 */
public class Graph {
    int vertex;
    LinkedLists list[];
    
    public Graph(int vertex){
        this.vertex = vertex;
        list = new LinkedLists[vertex];
        for (int i=0; i<vertex; i++){
            list[1] = new LinkedLists();
        }
    }
    public void addEdge(int source, int destination){
        //add edge
        list[source].addFirst(destination);
        
        //add back edge (for undirected)
        list[destination].addFirst(vertex);
    }
    public void degree(int source)throws Exception{
        //degree undirected graph
        System.out.println("degree vertex "+source +" : "+list[source].size());
        
        //degree directed graph
            //inDegree
        int k, totalIn = 0,totalOut= 0;
        for(int i=0; i<vertex; i++){
            for(int j=0; j<list[i].size(); j++){
                if(list[i].get(j)==source) 
                ++totalIn;
            }
            for(k = 0; k < list[source].size(); k++){
                list[source].get(k);
            }
            totalOut = k;
        }
        System.out.println("Indegree dari vertex "+ source +" : "+totalIn);
        System.out.println("Outdegree dari vertex "+ source +" : "+totalOut);
        System.out.println("Degree vertex "+source+" : "+(totalIn+totalOut));
    }
    public void removeEdge(int source, int destination)throws Exception{
        for (int i=0; i<list[source].size(); i++){
            if(list[source].get(i) == destination){
                list[source].remove(i);
            }
        }
        for (int j=0; j<list[destination].size(); j++){
            if (list[destination].get(j)== source){
                list[destination].remove(j);
            }
        }
    }
    public void removeAllEdges(){
        for (int i=0; i<vertex; i++){
            list[i].clear();
        }
        System.out.println("Graph berhasil dikosongkan");
    }
    public void printGraph()throws Exception{
        for (int i=0; i<vertex; i++){
            if(list[i].size()>0){
                System.out.println("Vertex " + i + " Terhubung dengan: ");
                for(int j=0; j<list[i].size(); j++){
                    System.out.println(list[i].get(j) + " ");
                }
                System.out.println("");
            }
        }
        System.out.println(" ");
    }
}