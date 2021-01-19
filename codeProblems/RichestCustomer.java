

import java.util.*;



public class RichestCustomer { 
  
    static int findRichestCustomer(int[][] vals) 
    {


    	int theOne =0;

    	int overallMaximum = 0;

    	for( int i = 0; i<vals.length; i++)
    	{
    		int runningTotal = 0;
    		for( int j = 0; j<vals[i].length; j++)
    		{

    			runningTotal = runningTotal + vals[i][j];

    		}

    		if(runningTotal >= overallMaximum)
    		{

    			theOne = i;


    		}
    		overallMaximum = Math.max(overallMaximum,runningTotal);


    	}


    	return theOne; 
    }
   

    public static void main(String args[]) 
    { 
        RichestCustomer program = new RichestCustomer(); 

		int[][] twoDArr={{2,8,7},{7,1,3},{1,9,5}};

        int returnval = program.findRichestCustomer(twoDArr);

        System.out.println(returnval);


        // for(int i= 0;i<twoDArr.length;i++ )
        // {
        // 	 System.out.println(twoDArr[i][0]);
        // }

       
    } 
} 