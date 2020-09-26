import java.util.*;

// Users on longer flights like to start a second movie right when their first one ends, but they complain that the plane usually lands before they can see the ending. 
// So you're building a feature for choosing two movies whose total runtimes will equal the exact flight length.

// Write a function that takes an integer flight_length (in minutes) and a list of integers movie_lengths (in minutes) and returns a boolean indicating whether there 
// are two numbers in movie_lengths whose sum equals flight_length.

// When building your function:

// Assume your users will watch exactly two movies
// Don't make your users watch the same movie twice
// Optimize for runtime over memory

public class FlightFiller
{


    public boolean can_two_movies_fill_flight(int movie_lengths[], int flight_length)
    {
      //create a set to hold out current movies 
       Set<Integer> movie_lengths_seen = new HashSet<>();

       //loop through the movie lengths
       for(int i =0 ; i < movie_lengths.length;i++)
       {

        //create a variable of the difference between the flight length 
        //and the current movie; that is the length of time we need from another movie
        int matching_second_movie_length = flight_length - movie_lengths[i];

        //we check our set to see if we have the movie with the same length as our variable
        // if its there that means that there are in fact two movies do equal the flight length 
        //so we return true 
        if (movie_lengths_seen.contains(matching_second_movie_length))
        {
            return true;
        }

        //if there above if statement doesnt run then we just add the movie to our set
        movie_lengths_seen.add(movie_lengths[i]);
       }

       //if we get throught the whole loop without finding two movies that equal the 
       //flight length then we return false 
       return false;

    }





    public static void main(String[] args)
    {

        FlightFiller program = new FlightFiller();
    
        int movietimes[]= {23,456,100,23423,130,34,465};

        System.out.println(program.can_two_movies_fill_flight(movietimes,230));




    }



}











