import java.util.Scanner;

public class Stack {

    static int stackSize;
    static int top =-1;
    int stack[];

    Stack(int size){
        this.stackSize =size;
        this.stack =new int[size];
    };


    String push(int value){
         System.out.println(top);
        System.out.println(stack.length-1);
        if(top >=stack.length-1){
            stackSize = stackSize*2;
            int[] newStack = new int[stackSize];
            for(int i=0;i<=stack.length-1;i++){
                newStack[i] = stack[i];
            }
            stack = newStack;
            return  "Stack is overFlow";
        }else{
            stack[++top] =value;
            return  "value pushed";
        }

    }
    String pop(){
        if(top < 0){
            return  "Stack is underFlow";
        }else{
            stack[top] = 0;
            --top;
            return  "value poped";
        }
    }

    void runStack(){
        Scanner userInput = new Scanner(System.in);

        System.out.println(" \n Static stack");
        System.out.println("select operation");
        System.out.println("1 "+" push");
        System.out.println("2 "+" pop");
        System.out.println("3 "+" display index graph");
        System.out.println("4 "+" total size of stack");
        System.out.println("5 "+" exit");
        int userOperstion = userInput.nextInt();

        switch(userOperstion){
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
                for(int i=0; i<=stack.length-1;i++){
                    System.out.print(" " +stack[i]);
                }
            }
            break;
            case 4:{System.out.println("Total Stack Size is " +stack.length);}
            break;
            case 5:{System.exit(0);}
            break;
            default:{System.out.println("Operaton value Exceded Try Again");}
        }
    }

    public static void main(String ak  []){
        System.out.println("enter size of stack");
        Scanner input= new Scanner(System.in);
        int enterSize = input.nextInt();
        Stack obj = new Stack(enterSize);
        while (true){
            obj.runStack();
        }
    }
}
