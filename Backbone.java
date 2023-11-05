package Activity1Dastruct;


import java.util.*;
public class Backbone {

   static Scanner scan = new Scanner(System.in);
   
   int size;
   int arr[];
   int choose;
   static int queue = -1;
   static int front = 0;
   static int rear = -1;
   static int capacity;


    public Backbone(int size){

        front = rear = 0;
        capacity  = size;
        arr = new int[capacity];


    }

    public void menu() {
    
        while (true) {
            System.out.println();
            System.out.println("********* MENU ********");
            System.out.println();
            System.out.println("* Type [1] - Enqueue  *");
            System.out.println("* Type [2] - Dequeue  *");
            System.out.println("* Type [3] - Front    *");
            System.out.println("* Type [4] - Rear     *");
            System.out.println("* Type [5] - Print    *");
            System.out.println();
            System.out.println("***********************");
            System.out.println();
            System.out.print("Type your number of choice: ");
            int choose = scan.nextInt();
            Choose(choose);
        }

    }

    public void Choose(int choose){
    
        Scanner input = new Scanner(System.in);
        
        if(choose ==1){
            elementenqueue();
        }else if(choose == 2){
            dequeue();
        }else if(choose == 3) {
            System.out.println();
            System.out.println("Front Element Is: "+front());
            System.out.println();
        }

        else if(choose ==4){
            System.out.println();
            System.out.println("Rear Element Is "+rear());
            System.out.println();
        }
        else if(choose == 5){
            print();
        }
    }

    public void enqueue(int info){
    
        queue++;
        arr[queue] = info;
        System.out.println();
        System.out.println("Elements of an Array: "+info);
        System.out.println();


    }

    public void elementenqueue(){

        if(queue == arr.length-1){
            System.out.println();
            System.out.println("Queue is FULL!");
            System.out.println();
        }else {
            try{
                System.out.println();
                System.out.print("Enter An Element: ");
                int element  = scan.nextInt();
                System.out.println();
                
                enqueue(element);
            }catch (InputMismatchException e){
                
                System.out.println("Invalid!");
                scan.nextInt();
            }
        }
    }

    public void dequeue() {
    
        if (queue == -1) {
            System.out.println();
            System.out.println("Queue is Empty!");
            System.out.println();
        } else {
            arr[queue--] = 0;

        }
    }

    public int  front(){
    
        if(queue < 0 ){
            System.out.println();
            System.out.println("Queue is Empty!");
            System.out.println();
            return -1;
        }
        return arr[0];
        
    }

    public int rear(){
    
      if(queue < 0){
          
          System.out.println();
          System.out.println("Queue is empty!");
          System.out.println();
          return -1;
          
      }
      
      int rear = arr[queue];
      return rear;
      
    }
    
    public void print(){
    
        System.out.println();
        
        System.out.print("Printed Element(s) of an Array: ");
        for(int i = 0; i <=queue; i++){
            System.out.print(arr[i]+" ");
            

        }
        System.out.println();
    }



}