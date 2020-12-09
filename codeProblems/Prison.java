import java.util.*;


// There are m by n bars h is a list of horizontal bars to remove and v is a list of vertical bars to remove 
// what is the max amount of area you can get when removing these bars

public class Prison
{


  
public static long prison(int n, int m, List<Integer> h, List<Integer> v) 
    {
        

        //create a long for the end mult result 
        //create a horizontal integer var and a 
        //vertical integer var
        long endResult;
        int horizontalMult = 1;
        int verticalMult = 1;

        

        //some checks here for the arguments  h,m,m,n
        if(m > 100000 || n > 100000 || m <=0 || n<=0 )
        {
            throw new IllegalArgumentException("INVALID Arguments");

        }
        
        if(v.size() >m || h.size() >n ||v.size() <= 0 || h.size() <=0 )
        {
            throw new IllegalArgumentException("INVALID Arguments");

        }
      
       
        //create a horizontal and vertical array from the parameters m and n
        int[] horizontal = new int[m+1];
        
        int[] vertical = new int[n+1];
        
///////////////////////////////////////////
          
        //fill both arrats with values of 1
        //we will set these to 0 later if need be
        for(int i =0 ;i<= m;i++)
        {
            horizontal[i] = 1;   
        }
        
        for(int j =0 ;j<= n;j++)
        {
            vertical[j] = 1;
        }
        
        
      
        //check the incoming arraylists and 
        //switch the values of 1 to a value of zero 
        for( int u = 0 ;u < h.size(); u++)
        {      
            if(h.get(u) > n)
            {
                 throw new IllegalArgumentException("INVALID");
            }
            vertical[h.get(u)] = 0;             
        } 
          
        for( int p = 0 ;p < v.size(); p++)
        {  
             if(v.get(p) > m)
            {
                 throw new IllegalArgumentException("INVALID");
            }
            horizontal[v.get(p)] = 0;    
        }
        
 

 ////////////////////////////////////////////////////
        //running total for horizontal
        int horizontalRunning = 1;
        
        //go through the array and check to see if there are any 
        //0's if there are you add it to the running total
        for(int k = 0; k<horizontal.length;k++)
        {

            
            if(horizontal[k] == 0)
            {
                horizontalRunning++;
                horizontalMult = Math.max(horizontalMult,horizontalRunning);

            }
            else
            {
                horizontalMult = Math.max(horizontalMult,horizontalRunning);
                horizontalRunning = 1;
            }
                      
            

        }
        
        
        //running total for vertical
        int verticalRunning = 1;
           
          //go through the array and check to see if there are any 
        //0's if there are you add it to the running total
        for(int s = 0; s<vertical.length;s++)
        {
            if(vertical[s] == 0)
            {
                verticalRunning++;
                verticalMult = Math.max(verticalMult,verticalRunning);

            }
            else
            {
                verticalMult = Math.max(verticalMult,verticalRunning);
                verticalRunning = 1;

            }
            

        }
        
 
//////////////////////////////////////////
        //convert the integers to longs and return the multiplication endresult
         endResult = (long)horizontalMult * (long)verticalMult;
     
        
        return endResult;


    }





    public static void main(String[] args)
    {

        Prison program = new Prison();


        List<Integer> listOne = new ArrayList<Integer>();
        List<Integer> listtwo = new ArrayList<Integer>();

        listOne.add(2);
        listtwo.add(2);

        Long returnVal = program.prison(3,3,listOne,listtwo);

        System.out.println(returnVal);



        
    
/*        STDIN    Function
-----    --------
3    →   n = 3
3    →   m = 3
1    →   h[] size x = 1 
2    →   h = [2]
1    →   v[] size y = 1 
2    →   v = [2]
*/



// STDIN    Function
// -----    --------
// 3    →   n = 3
// 2    →   m = 2
// 3    →   h[] size x = 3
// 1    →   h = [1, 2, 3]
// 2
// 3
// 2    →   v[] size y = 3
// 1    →   v = [1, 2]
// 2

    }



}











