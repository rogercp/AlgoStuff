

import java.util.*;


public class Room{ 
  
    static int[] doPattern(String[] list, String[] pads ) 
    { 

         int[] returnArr = new int[pads.length];

         for(int i = 0 ; i< pads.length; i++)
         {

            Map<Character, Integer> mymap  = new HashMap<Character, Integer>() 
            {{
                put('A',0); put('B',0); put('C',0); put('D',0); put('E',0); put('F',0); put('G',0); put('H',0); put('I',0); put('J',0); put('K',0); put('L',0); put('M',0); put('N',0); put('O',0); put('P',0); put('Q',0); put('R',0); put('S',0); put('T',0); put('U',0); put('V',0); put('W',0); put('X',0); put('Y',0); put('Z',0); 
            }};

            int numTimes = 0;

            boolean keyLetterFlag = true;

            for(int j = 0; j<pads[i].length()-1; j++)
            {
                mymap.put(pads[i].charAt(j),mymap.get(pads[i].charAt(j)) + 1);
            }

            for(int q= 0; q<list.length;q++)
            {

                for(int x= 0; x<list[q].length();x++)
                {

                    if((mymap.get(list[q].charAt(x)) ==0 )||( x ==list[q].length() & keyLetterFlag == false ))
                    {
                        break;
                    }
                    else if(list[q].charAt(x) == pads[i].charAt(0))
                    {

                        keyLetterFlag = false;
                    }

                    else if((mymap.get(list[q].charAt(x)) != 0) & (x == list[q].length()-1) )
                    {

                        numTimes = numTimes + 1;
                    }

                    
                }


            }

            returnArr[i] = numTimes;

         }
        

         return returnArr;
    }
   

    public static void main(String args[]) 
    { 
        Room program = new Room(); 

       
        String[] myList = {"APPLE","PLEAS","PLEASE"};

        String[] mypads = {"AELWXYZ","AELPXYZ","AELPSXY","SAELPRT","XAEBKSY"};


        int[] returnVal = program.doPattern(myList,mypads);

        for(int k = 0 ; k<returnVal.length; k++)
        {
            System.out.println(returnVal[k]);
        }
    } 
} 