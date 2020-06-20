import java.lang.Math;
import java.util.ArrayList;

public class SearchingAlgos
{



    public int binarySearch(int list[], int val)
    {

        int start = 0;
        int end = list.length-1;
        int middle = (int) Math.floor((start + end) / 2);


        while (list[middle] != val && start <= end)
        {

            if(val < list[middle])
            {
                end = middle - 1;
            }
            else
            {
                start = middle + 1;
            }

            middle = (int) Math.floor((start + end) / 2);

        }
        if(list[middle] == val)
        {
            System.out.println(middle);
            return middle;
        }
        return middle;


    } 

    
     public int stringSearch(String grander, String lesser)
     {

        int count = 0 ;


        for(char i = 0; i < grander.length() ;i++)
        {
            for(char j = 0; j < lesser.length() ;j++)
            {
                if(  lesser.charAt(j) != grander.charAt(i + j ) )
                {
                    break;
                }
                if(j == lesser.length()-1)
                {
                    count ++;
                }

            }

        }

        System.out.println(count);
        return count;

     }








    public static void main(String[] args)
    {

        SearchingAlgos program = new SearchingAlgos();
    
         int list[] = { 2, 3, 4, 10, 40 , 45,67,345,2344,34547,463263,13523235 }; 


        program.binarySearch(list,13523235);

        program.stringSearch("lorie loled","lo");

            


    }



}











