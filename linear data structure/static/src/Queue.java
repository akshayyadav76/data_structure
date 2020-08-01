import java.util.Scanner;

public class Queue {

    int stackSize = 12;
    static int start =-1;
    static  int end =-1;
    int queue[] = new int[stackSize];


    String push(int value){

        if(end >=queue.length-1){
            return  "queue is overFlow";
        }else{
            queue[++end] =value;
            return  "value pushed";
        }

    }
    String pop(){
        if(start == end){
            return  "Stack is underFlow";
        }else{
            queue[++start] =0;

            return  "value poped";
        }
    }

    void runQueue(){
        Scanner userInput = new Scanner(System.in);

        System.out.println(" \n Static Queue");
        System.out.println("select operation");
        System.out.println("1 "+" push");
        System.out.println("2 "+" pop");
        System.out.println("3 "+" display index graph");
        System.out.println("4 "+" total size of Queue");
        System.out.println("5 "+" exit");
        int userOperation = userInput.nextInt();

        switch(userOperation){
            case 1:{
                System.out.println("Enter number for Push Operation");
                int enterNumber = userInput.nextInt();
                System.out.println(push(enterNumber));
            }
            break;
            case 2:{
                System.out.println("Enter number for Pop Operation");
                System.out.println(pop());
            }
            break;
            case 3:{
                System.out.print("Stack Graph ");
                for(int i=0; i<=queue.length-1;i++){
                    System.out.print(" " +queue[i]);
                }
            }
            break;
            case 4:{System.out.println("Total Stack Size is " +queue.length);}
            break;
            case 5:{System.exit(0);}
            break;
            default:{System.out.println("Operaton value Exceded Try Again");}
        }
    }

    public static void main(String ak  []){
        Queue obj = new Queue();
        while (true){
            obj.runQueue();
        }
    }
}
