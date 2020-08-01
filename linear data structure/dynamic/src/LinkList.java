


public class LinkList{
    Node head;
    
    static class Node{
        // single Node
        int data;
        Node next;

        Node(int d){
            data =d;
            next = null;
        }
    }

  static LinkList insertNode(LinkList list,int data){
       Node newNode =new Node(data);
       newNode.next = null;
      //when link list is empty
       if(list.head == null){
           System.out.println("one node");
           list.head = newNode;
       }else{
           // when link list is not empty
           System.out.println("next node");
           Node endNode = list.head;
           while(endNode.next !=null){
               endNode = endNode.next;
           }
           endNode.next = newNode;
       }
       return  list;
    }

    static void printLinkList(LinkList list){
        Node currentNode = list.head;
          System.out.println("linkList ");
        while(currentNode !=null){
            System.out.println( currentNode.data + " |");
            currentNode = currentNode.next;
        }
    }


    public static void main(String ak[]){
      LinkList list = new LinkList();
      list =  insertNode(list,1);
      list =  insertNode(list,2);
      list =  insertNode(list,3);
      list =  insertNode(list,4);

      printLinkList(list);
    }

}

