

import java.util.*;


// You decide to test if your oddly-mathematical heating company is fulfilling its All-Time Max, Min, Mean and Mode Temperature Guarantee™.

// Write a class TempTracker with these methods:

// insert()—records a new temperature
// getMax()—returns the highest temp we've seen so far
// getMin()—returns the lowest temp we've seen so far
// getMean()—returns the mean ↴ of all temps we've seen so far
// getMode()—returns a mode ↴ of all temps we've seen so far
// Optimize for space and time. Favor speeding up the getter methods getMax(), getMin(), getMean(), and getMode() over speeding up the insert() method.

// getMean() should return a double, but the rest of the getter methods can return integers. Temperatures will all be inserted as integers. We'll record our temperatures in Fahrenheit, so we can assume they'll all be in the range 0..1100..110.

// If there is more than one mode, return any of the modes.

public class TempTracker { 
  
   
   


    private int[] occurrences = new int[111];  
    private int maxOccurrences;
    private int mode;

 
    private int numberOfReadings;
    private long totalSum;
    private double mean;

    private int minTemp = Integer.MAX_VALUE;
    private int maxTemp = Integer.MIN_VALUE;

    public void insert(int temperature) {

       
        occurrences[temperature]++;
        if (occurrences[temperature] > maxOccurrences) {
            mode = temperature;
            maxOccurrences = occurrences[temperature];
        }

        numberOfReadings++;
        totalSum += temperature;
        mean = (double) totalSum / numberOfReadings;

        minTemp = Math.min(minTemp, temperature);
        maxTemp = Math.max(maxTemp, temperature);
    }

    public int getMax() {
        return maxTemp;
    }

    public int getMin() {
        return minTemp;
    }

    public double getMean() {
        return mean;
    }

    public int getMode() {
        return mode;
    }




    public static void main(String args[]) 
    { 
        TempTracker program = new TempTracker(); 



       
    } 
} 