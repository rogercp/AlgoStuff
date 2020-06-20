import java.util.Scanner;


public class Queue
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
    public class RealQueue
    {
        public Node first;
        public Node last;
        public int size;

        public RealQueue(Node incoming_first, Node incoming_last,int incoming_size){
            this.first = incoming_first;
            this.last  = incoming_last;
            this.size = incoming_size;
        }

        public int get_num()
        {
            return this.last.getNum();
        }

        public int get_size()
            {
                return this.size;
            }

        public int enqueue(int val){
        
            Node newNode = new Node(val);

            if(this.first == null){
                this.first = newNode;
                this.last = newNode;
            }else {
            this.last.next = newNode;
            this.last = newNode;
            }
            return ++this.size;
        }

        public int dequeue(){

             Node temp = this.first;
             if(this.first == this.last) {
            this.last = null;
            }
            this.first = this.first.next;
            this.size--;
            return temp.value;

    }


}

    public void start() {

        Node node1 = new Node(1);
        Node node2 = new Node(2);

         RealQueue myQueue = new RealQueue(node1,node2,2);

            myQueue.enqueue(3);
            myQueue.enqueue(4);
            myQueue.enqueue(5);
            System.out.println(myQueue.get_size());
            myQueue.dequeue();
            System.out.println(myQueue.get_size());


        }

         public static void main(String[] args)
         {

            Queue programm = new Queue();
            programm.start();

         }




}











