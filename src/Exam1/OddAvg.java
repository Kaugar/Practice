package Exam1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddAvg {
  public static void main(String[] args) {
    // Create a function called `oddAverage` that takes a list of numbers as parameter
    // and returns the average value of the odd numbers in the list
    // Create basic unit tests for it with at least 3 different test cases
    ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
    System.out.println(oddAverage(input));


  }
  public static double oddAverage (List<Integer> input){
    double sumOfOdds = 0;
    int counter = 0;
    for (int i = 0; i < input.size(); i++) {
      if(input.get(i) % 2 == 1){
        sumOfOdds += input.get(i);
        counter++;
      }
    }
    return sumOfOdds/counter;
  }
}
