import java.util.HashMap;
import java.util.Scanner;


public class CountWordsInString {


    public static void main(String[] args) {
        // String str = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. 
        //Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown 
        //printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum";

        System.out.println("Enter a sentence to find the count of indiviual word occurances in the sentence");

        //use the scanner object to get input from the command line
        Scanner in = new Scanner(System.in);

        //we hold the string using the nextline method and 
        //assign it to the myString variable
        String myString = in.nextLine();


        //we will hold each individual string in an array 
        //we seperate each word with the split method by an empty space
        String[] split = myString.split(" ");


        //create a hashmap to map each word to the amount of times it shows up in our String
        HashMap<String,Integer> map = new HashMap<String,Integer>();    

        //loop through the array we created
        for (int i=0; i<split.length; i++) {

            // if (map.containsKey(split[i])) {
            //     int count = map.get(split[i]);
            //     map.put(split[i], count+1);
            // }
            // else {
            //     map.put(split[i], 1);
            // }


            //we check to see if the word is in our hashmap if not we set it to zero as the 
            //default then we add one or if it already exists we just increment the count by one 
            map.put(split[i],map.getOrDefault(split[i],0)+1);
        }

        System.out.println(map);
    }

 
}