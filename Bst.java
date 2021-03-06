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

        ArrayList<Node> data1=new ArrayList<Node>();

        public ArrayList<Node> DFSPreOrder()
        {
                
                traverse1(this.root);

                 for (Node n : data1)
                    {
                        System.out.println(n.value);
                    }

                return data1;
        }

         public void traverse1(Node node)
                {

                    data1.add(node);
                    if(node.left != null)
                    {
                        traverse1(node.left);
                    }
                    if(node.right != null)
                    {
                        traverse1(node.right);
                    } 


                }

        ArrayList<Node> data2=new ArrayList<Node>();

        public ArrayList<Node> DFSInOrder()
        {            
                 
                traverse2(this.root);

                 for (Node n : data2)
                    {
                        System.out.println(n.value);
                    }
                    
                return data2;

        }
         public void traverse2(Node node)
                {
                    if(node.left != null) 
                    {
                        traverse2(node.left);
                    }
                    data2.add(node);
                    if(node.right != null)
                    {
                        traverse2(node.right);
                    } 

                }

        ArrayList<Node> data3=new ArrayList<Node>();

        public ArrayList<Node> DFSPostOrder()
        {            
                 
               
                traverse3(this.root);

                 for (Node n : data3)
                    {
                        System.out.println(n.value);
                    }
                    
                return data3;

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
                 data3.add(node);


                }




        // public boolean checkValidity()
        // {


        //     boolean trueorfalse = traverse(this.root);

        //     System.out.println(trueorfalse + "true or dalse");

        //     return trueorfalse;

        // }


        // public boolean traverse(Node node)
        //     {

        //       if(node.left.value < node.value)
        //       {
        //          traverse(node.left);
        //       }
               
        //       else if (node.left.value >= node.value)
        //       {
        //         return false;

        //       }
        //       if(node.right.value > node.value)
        //       {
        //         traverse(node.right);  

        //       }
        //       else if (node.left.value <= node.value)
        //       {
        //         return false;
        //       } 
              
        //       return true ;

        //  }



    

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

        System.out.println("-------------------");

        myBst.Breath_First_Search();

        System.out.println("-------------------");

        myBst.DFSPreOrder(); 

        System.out.println("-------------------");

        myBst.DFSInOrder();

        System.out.println("-------------------");

        myBst.DFSPostOrder();

        // System.out.println(myBst.checkValidity());


        }

         public static void main(String[] args)
         {

            Bst programm = new Bst();
            programm.start();

         }




}











