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
public class Queue <E>{

    SLL_Tail queue = new SLL_Tail();
    
    public boolean empty(){
        
        return queue.empty();
    }
    
    public void enqueue(E data){
        
        queue.insertLast(data);
        queue.displayList();
        queue.countNodes();
        queue.displayCount();
        System.out.println("");
    }
    
     public void dequeue(){
        
        queue.deleteFirst();
        queue.displayList();
        queue.countNodes();
        queue.displayCount();
        System.out.println("");
    }
     
     private E dequeueReverse(){
     
         SingleNode oldTail = queue.tail;
         queue.deleteLast();
         return (E)oldTail.data;
     }
     
      public void first(){
        
        queue.dispalyFirst();
    }
      
      public void size(){
        
        queue.displayList();
        queue.countNodes();
        queue.displayCount();
    } 
      
      public void reverseQueue(){
          
          Queue temp = new Queue();
          
          while(!queue.empty()){
              
              temp.enqueue(dequeueReverse());
          }
      }
      
       public void treeEnqueue(E data){
        
        queue.insertLast(data);
    }
    
        public E treeDequeue(){

           E data = (E) queue.head.data;
           queue.deleteFirst();
           return data;
    } 
        
         public void graphEnqueue(E data){
        
        queue.insertLast(data);
    }
        
        public E graphDequeue(){

           E data = (E) queue.head.data;
           queue.deleteFirst();
           return data;
    }
}
