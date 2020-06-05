import java.util.Scanner;


public class Bst
{


    public class Node
    {
        public int value;
        public Node left;
        public Node right;

        public Node(int incoming_value)
        {

            this.value = incoming_value;
        }

         public int getValue()
        {
            return this.value;
        }

    }
    public class BinarySearchTree
    {
        public Node root;
        
        public BinarySearchTree(Node incoming_root)
        {
            this.root = incoming_root;
           
        }

        public BinarySearchTree insert(int value)
        {

            Node newNode = new Node(value);

            if(this.root == null)
            {
                this.root = newNode;
                return this;
            }

            Node currentNode = this.root;

            while(true)
            {

                if(value == currentNode.value)
                {
                    return this;
                }
                if(value < currentNode.value)
                {

                    if(currentNode.left == null)
                    {
                        currentNode.left = newNode;
                        return this;

                    }

                    currentNode = currentNode.left;

                }else
                {
                    if(currentNode.right == null)
                    {
                        currentNode.right = newNode;
                        return this;
                    }

                    currentNode = currentNode.right;


                }

            }


        }


        public Node find(int value)
        {

            if(this.root == null)
            {
                return false;
            }

            Node currentNode = this.root;
            boolean found = false;

            while(currentNode.value != null && found == false)
            {
                if( value < currentNode.value)
                {
                    currentNode = currentNode.left;
                }else if(value > currentNode.value)
                {
                    currentNode = currentNode.right;
                }else
                {
                    found = true ;
                }
            }

            if( found == false)
            {
                return this;
            }

            System.out.println(currentNode.getValue());
            return currentNode;


        }

      


}

    public void start() {

        // Node rootNode = new Node(42);

        BinarySearchTree myBst = new BinarySearchTree(null);

        myBst.insert(44);
        myBst.insert(34);
        myBst.insert(2);
        myBst.insert(45);
        myBst.insert(67);
        myBst.insert(23);
        myBst.insert(15);
        myBst.insert(9);
        myBst.insert(65);

        myBst.find(23);

        System.out.println("lets see");


        }

         public static void main(String[] args)
         {

            Bst programm = new Bst();
            programm.start();

         }




}











