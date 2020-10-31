import java.util.*;


// There are m by n bars h is a list of horizontal bars to remove and v is a list of vertical bars to remove 
// what is the max amount of area you can get when removing these bars

public class Prison
{


  
public static long prison(int n, int m, List<Integer> h, List<Integer> v) 
    {
        
        long endResult;
        
        
        for(int j =0 ;j< v.size();j++)
        {
            System.out.println(v.get(j));
        }

        
        int[] horizontal = new int[m+1];
        
        int[] vertical = new int[n+1];
        
///////////////////////////////////////////
          
        for(int i =0 ;i<= m;i++)
        {
            horizontal[i] = 1;   
        }
        
        for(int j =0 ;j<= n;j++)
        {
            vertical[j] = 1;
        }
        
        
      
        
        for( int u = 0 ;u < h.size(); u++)
        {      
            vertical[h.get(u)] = 0;             
        } 
          
        for( int p = 0 ;p < v.size(); p++)
        {  
            horizontal[v.get(p)] = 0;    
        }
        


 ////////////////////////////////////////////////////
        int horizontalMult = 1;
        int horizontalRunning = 1;
        
        
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
        
        
        int verticalMult = 1;
        int verticalRunning = 1;
           
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
        
         endResult = horizontalMult * verticalMult;
     
        
        return endResult;

    }





    public static void main(String[] args)
    {

        Prison program = new Prison();
    
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











