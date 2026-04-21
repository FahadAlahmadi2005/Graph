/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algorithms1;

/**
 *
 * @author fhad4
 * @param <E>
 */
public class Graph <E>{
    
    private final int[][] adjacencyMatrix;
    private final int vertice;
    private int countEdge = 0;
    
    public Graph(int vertice){
        
        this.vertice = vertice;
        adjacencyMatrix = new int [vertice][vertice];
    }
    
    public void addEdge(int start, int end){
        
        adjacencyMatrix[start][end] = 1;
        countEdge++;
    }
    
    public void printGraph(){
        
        for(int i = 0; i < vertice; i++){
            
            for (int j = 0; j < vertice; j++){
                
                System.out.print(adjacencyMatrix[i][j] + "  ");
            }
            
            System.out.println();
        }
    }
    
    public void numberOfVertices(){
        
        System.out.println("The number of vertices is: " + vertice);
    }
    
    public void displayInDegree(){
        
        int inDegree;
        
        for(int j = 0; j < vertice; j++){
            
            inDegree = 0;
            
            for(int i = 0; i < vertice; i++){
               
                inDegree += adjacencyMatrix[i][j];
            }
            
            System.out.printf("The in-degree of the vertix %d is % d\n", j, inDegree);
        }
    }
    
    public void displayOutDegree(){
        
        int inDegree;
        
        for(int i = 0; i < vertice; i++){
            
            inDegree = 0;
            
            for(int j = 0; j < vertice; j++){
               
                inDegree += adjacencyMatrix[i][j];
            }
            
            System.out.printf("The out-degree of the vertix %d is % d\n", i, inDegree);
        }
    }
    
      public void displaySourceVertices(){
        
        System.out.println("The source Vertices are :"); 
        int inDegree;
        
        for(int j = 0; j < vertice; j++){
            
            inDegree = 0;
            
            for(int i = 0; i < vertice; i++){
               
                inDegree += adjacencyMatrix[i][j];
            }
            
            if(inDegree == 0){
                
                System.out.println(j);
            }
        }
    }
      
      public void displaySinksVertices(){
        
        System.out.println("The sink vertices are: ");  
        int outDegree;
        
        for(int i = 0; i < vertice; i++){
            
            outDegree = 0;
            
            for(int j = 0; j < vertice; j++){
               
                outDegree += adjacencyMatrix[i][j];
            }
            
           if(outDegree == 0){
                
                System.out.println(i);
            }
        }
    }
      
      public void displaySlingVertices(){
          
        System.out.println("The sling vertices are: ");
          
        for(int i = 0; i < vertice; i++){
              
            if(adjacencyMatrix[i][i] == 1){
                  
                System.out.println(i);
            }
        }
    }
      
      public void DisplayConnectedGraph(){        

         int NumberOfConnectedVertices = 0;
         
         for(int i = 0; i < vertice; i++){
             
             for (int j = 0; j < vertice; j++){ 
                 
             if (adjacencyMatrix[i][j] == 1 || adjacencyMatrix[j][i] == 1){
                 
                 NumberOfConnectedVertices++;
             }
           }
         }
         
         if(NumberOfConnectedVertices < (Math.pow(vertice, 2))){
             
             System.out.println("The Graph is not connected");
         }else {
             
             System.out.println("The Graph is connected");
         }
    }
     
     public void DisplayCompleteGraph(){        
        
         int NumberOfConnectedVertices = 0;
         
         for(int i = 0; i < vertice; i++){
             
             for(int j = 0; j < vertice; j++){ 
                 
             if (adjacencyMatrix[i][j] == 1){
                 
                NumberOfConnectedVertices++;
             }
           }
         }
         if (NumberOfConnectedVertices < (Math.pow(vertice, 2))){
             
             System.out.println("The Graph is not complete");
         }else {
             
             System.out.println("The Graph is complete");
         }
    }
      
      public void BFS(int start){
          
          boolean[] visited = new boolean[vertice];
          Queue queue = new Queue();
          
          visited[start] = true;
          queue.graphEnqueue(start);
          
          while(!queue.empty()){
              
              int visit = (int) queue.graphDequeue();
              System.out.println(visit);
              
              for(int i = 0; i < vertice; i++){
              
              if(adjacencyMatrix[visit][i] == 1 && !visited[i]){
                  
                  visited[i] = true;
                  queue.graphEnqueue(i);
              }
            }
        }
    }
      
      public void DFS(int start){
          
          boolean[] visited = new boolean[vertice];
          DFS(start, visited);
      }
              
      private void DFS(int visit, boolean[] visited){
          
          visited[visit] = true;
          System.out.println(visit);
          
          for(int i = 0; i < vertice; i++){
              
              if(adjacencyMatrix[visit][i] == 1 && !visited[i]){
                  
                  DFS(i, visited);
              }
          }
      }
      
      public void numberOfEdges(){
          
          System.out.println("The number of edges is: " + countEdge);
      }
}
