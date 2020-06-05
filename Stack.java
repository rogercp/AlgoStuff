import java.util.Scanner;


public class Stack
{


    public class Node
    {
        public int value;
        public Node next;

        public Node(int incoming_value){

            this.value = incoming_value;
        }

         public int getNum()
        {
            return this.value;
        }

    }
    public class RealStack
    {
        public Node first;
        public Node last;
        public int size;

        public RealStack(Node incoming_first, Node incoming_last,int incoming_size){
            this.first = incoming_first;
            this.last  = incoming_last;
            this.size = incoming_size;
        }

        public int get_num()
        {
            return this.first.getNum();
        }

        public int get_size()
            {
                return this.size;
            }

        public int push(int val){
        
            Node newNode = new Node(val);

            if(this.first == null){
                this.first = newNode;
                this.last = newNode;
            }else {
            newNode.next = this.first;
            this.first = newNode;
            }
            return ++this.size;
        }

        public int pop(){

             Node nodeToRemovce = this.first;
            this.first = this.first.next;
            this.size--;
            return nodeToRemovce.value;

    }

}

    public void start() {

        Node node1 = new Node(1);
        Node node2 = new Node(2);

         RealStack myStack = new RealStack(node1,node2,2);

            myStack.push(3);
            myStack.push(4);
            myStack.push(7);
            System.out.println(myStack.get_num());
            myStack.pop();
            System.out.println(myStack.get_num());


        }

         public static void main(String[] args)
         {

            Stack programm = new Stack();
            programm.start();

         }




}











