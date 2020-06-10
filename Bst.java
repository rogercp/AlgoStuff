import java.util.Scanner;
import java.util.ArrayList;

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


        public boolean find(int value)
        {

        
            Node currentNode = this.root;
            boolean found = false;

            while(found == false)
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

            return found;

        }



        public ArrayList<Node> Breath_First_Search()
        {

            Node currentNode = this.root;

            ArrayList<Node> data=new ArrayList<Node>();
            ArrayList<Node> queue=new ArrayList<Node>();

            queue.add(currentNode);

            while(queue.size() > 0)
            {
                Node node = queue.remove(0);
                data.add(node);
                if(node.left != null)
                {
                    queue.add(node.left);
                }

                if(node.right != null)
                {
                    queue.add(node.right);
                } 
            }

            for (Node n : data)
            {
                System.out.println(n.value);
            }

            return data;
        }

        // for all dfs's below
        ArrayList<Node> data=new ArrayList<Node>();

        public ArrayList<Node> DFSPreOrder()
        {
                
                traverse1(this.root);

                 for (Node n : data)
                    {
                        System.out.println(n.value);
                    }

                return data;
        }

         public void traverse1(Node node)
                {

                    data.add(node);
                    if(node.left != null)
                    {
                        traverse1(node.left);
                    }
                    if(node.right != null)
                    {
                        traverse1(node.right);
                    } 


                }


        public ArrayList<Node> DFSInOrder()
        {            
                 
                traverse2(this.root);

                 for (Node n : data)
                    {
                        System.out.println(n.value);
                    }
                    
                return data;

        }
         public void traverse2(Node node)
                {
                    if(node.left != null) 
                    {
                        traverse2(node.left);
                    }
                    data.add(node);
                    if(node.right != null)
                    {
                        traverse2(node.right);
                    } 

                }

        public ArrayList<Node> DFSPostOrder()
        {            
                 
               
                traverse3(this.root);

                 for (Node n : data)
                    {
                        System.out.println(n.value);
                    }
                    
                return data;

        }
        public void traverse3(Node node)
            {
                    
                if(node.left != null)
                {
                    traverse3(node.left);
                 } 
                if(node.right != null)
                {
                    traverse3(node.right);
                } 
                 data.add(node);


                }

    

}

    public void start() {


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

        boolean myResult = myBst.find(9);
        System.out.println(myResult);

        // myBst.Breath_First_Search();

        myBst.DFSPostOrder();










        }

         public static void main(String[] args)
         {

            Bst programm = new Bst();
            programm.start();

         }




}











