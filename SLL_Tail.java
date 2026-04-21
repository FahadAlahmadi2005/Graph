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
public class SLL_Tail <E> {
    
   
    SingleNode head = null;
    SingleNode tail = null;
    
    public boolean empty(){
    
        return head == null;
    }
    
    public void insertFirst(E data){
    
        SingleNode newNode = new SingleNode(data);
        
        if(empty()){
        
            head = tail = newNode;
        }else{
        
            newNode.next = head;
            head = newNode;
        }
    }
    
    public void insertLast(E data){
    
        SingleNode newNode = new SingleNode(data);
        
        if(empty()){
        
            insertFirst(data);
            return;
        }
        
        tail.next = newNode;
        tail = newNode;
        newNode.next = null;
    }
    
    public void insert(E data){
    
        insertLast(data);
    }
    
    public void insertInBetween(E Data, E data1, E data2){

        SingleNode newNode = new SingleNode(Data);
        SingleNode cur = head;
        
        if(empty()){
        
            System.out.println("The list is empty!");
              return;
        }
        
        while(cur.next != null){

           if(cur.data == data1 && cur.next.data == data2){
   
                newNode.next = cur.next;
                cur.next = newNode;
                return;
            }
            
            cur = cur.next;
        }
       
            System.out.println("Data not found!");
    }
    
    public void insertAfterNode(E data, E data1){
        
        SingleNode newNode = new SingleNode(data);
        SingleNode cur = head;
         
        if(empty()){
         
             System.out.println("The list is empty!");
               return;
         }
        
        if(head.data == data1){
        
            newNode.next = head.next;
            head.next = newNode;
            return;
        }
        
        if(tail.data == data1){
        
            insertLast(data);
            return;
        }
        
        while(cur != null){
         
             if(cur.data == data1){
             
                 newNode.next = cur.next;
                 cur.next = newNode;
                 return;
             }
         
             cur = cur.next;
         }
        
         System.out.println("Data not found!");
    }
    
    public void deleteFirst(){
 
        if(empty()){
        
            System.out.println("The list is empty!");
              return;
        }
        
        head = head.next;
    }
    
    public void deleteLast(){
   
        SingleNode cur = head;
    
        if(empty()){
        
             System.out.println("The list is empty!");
               return;
        }
        
        if(head == tail){
        
            deleteFirst();
            return;
        }
        
        while(cur.next != tail){

            cur = cur.next;
        }
        
        tail = cur;
        cur.next = null;
    }
    
    public void deleteNode(E data){
        
        SingleNode cur = head;
        
        if(empty()){
        
             System.out.println("The list is empty!");
               return;
        }
         
        if(head == tail){
         
            deleteFirst();
            return;
         }
         
        if (head.data == data){
         
            deleteFirst();
            return;
         }
         
        if(tail.data == data){
         
            deleteLast();
            return;
         }
        
        while(cur.next != null){
        
            if(cur.next.data == data){
            
                cur.next = cur.next.next;
            }
            
            cur = cur.next;
        }
        
        System.out.println("Data not found!");
    }
    
     
    public void deleteAfterNode(E data){
        
        SingleNode cur = head;
        
        if(empty()){
            
            System.out.println("The list is empty!");
            return;
        }
        
        if(head == tail){
            
            System.out.println("Only one node!");
            return;
        }
        
        while(cur.next != null){
            
            if(cur.data == data){
                
                cur.next = cur.next.next;
            }
            
            cur = cur.next;
        }
    }
    
    public int countNodes(){
    
        int count = 0;
        SingleNode cur = head;
        
        if(empty()){
        
            System.out.println("The list is empty!");
        }
        
        while(cur != null){
        
            count++;
            cur = cur.next;
        }
        
        return count;
    }
    
    public void searchNodes(E data){
    
       int count = 0; 
       SingleNode cur = head;
       
       if(empty()){
       
           System.out.println("The list is empty!");
           return;
       }
       
       while(cur != null){
         
           if(cur.data == data ){
           
               count++;
           }
           
           cur = cur.next;
       }
       
       if(count > 0){
           
            System.out.printf("The value %s was found %d time(s) in the list.\n", data, count);
       }else{
           
            System.out.printf("The value %s was not found in the list.\n", data);
        }
    }
    
    public void displayList(){
    
        int count = 0;
        SingleNode cur = head;
        
               if(empty()){
       
           System.out.println("The list is empty!");
           return;
       }
               
        while(cur !=  null){
        
            System.out.printf("The element number %d is %s \n", count+1 , cur.data);
            count++;
            cur = cur.next;       
        }
    }
    
    public void dispalyFirst(){
    
        if(empty()){
        
            System.out.println("The list is empty");
            return;
        }
        
        System.out.println("The first element is " + head.data);
    }
    
    public void displayLast(){
        
        if(empty()){
       
           System.out.println("The list is empty!");
           return;
       }
              
        System.out.println("The last element is " + tail.data);    
    }
    
    public void displayPreSussNode(E data){
    
        SingleNode cur = head;
        
        if(empty()){
        
            System.out.println("The list is empty!");
            return;
        }
        
        while(cur != null){
        
            if(cur.next != null && cur.next.data == data){
            
                 System.out.println("The predecessor is " + cur.data);
                 
                 if(cur.next.next != null){
                 
                     System.out.println("The successor is " + cur.next.next.data);
                 }else{
                 
                     System.out.println("There is no successor.");
                 }
                 
                 return;
            }else if(cur.data == data){
            
                  System.out.println("There is no predecessor.");
                 
                 if(cur.next != null){
                 
                     System.out.println("The successor is " + cur.next.data);
                 }else{
                 
                     System.out.println("There is no successor.");
                 }
                 
                 return;
            }
            
            cur = cur.next;
        }
        
        System.out.println("Data not found!");
    }
    
    public void displayCount(){
    
        System.out.printf("The number of nodes is %d \n", countNodes());
    }
    
     public void ConvertLinkedListToArray(){
       
        int A[] = new int [countNodes()];
        SingleNode cur = head;
        int i = 0;
   
        while(cur != null){
            
            A[i] = (int) cur.data;
            System.out.printf("Array element number %d is %d\n", i+1, (A[i]));
            i++;
            cur = cur.next;         
        }
    }
}

