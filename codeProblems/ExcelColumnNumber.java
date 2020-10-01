




import java.util.*;

// Given a column title as appear in an Excel sheet, return its corresponding column number.

// For example:

//     A -> 1
//     B -> 2
//     C -> 3
//     ...
//     Z -> 26
//     AA -> 27
//     AB -> 28 
//     ...
// Example 1:

// Input: "A"
// Output: 1
// Example 2:

// Input: "AB"
// Output: 28
// Example 3:

// Input: "ZY"
// Output: 701




class ExcelColumnNumber { 
  
   
    public int titleToNumber(String s) 
    {
       
        //our accumulator for our return value
        int num = 0;

        // a variable for tracking the power
        int j = 0;

        //loop from the rear forwards because the last
        //character is the one where we have to worry about the absolute value 
        // without any power influence from j 
        for(int i = s.length()-1; i >= 0; i--)
        {

            System.out.println(s.charAt(i) - 64);
            System.out.println(j+" power");

            System.out.println("            ");

            
            num += Math.pow(26,j)*(s.charAt(i)-64);

            
            j++;
        }

        return num;



    
	}

    public static void main(String args[]) 
    { 

        ExcelColumnNumber program = new ExcelColumnNumber();


        int result = program.titleToNumber("ZY");

        System.out.println(result);
       
    } 
} 