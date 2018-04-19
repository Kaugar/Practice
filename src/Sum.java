public class Sum {
  public static void main(String[] args) {
    int i = 5;
    System.out.println(sum(i));
  }
  public static int sum (int num){
    int num2= 0;
    for (int i = 0; i < num; i++) {
      num2 = num2 + i;
    }
    return num2;
  }
}

//  Create the usual class wrapper
//  and main method on your own.

// - Write a function called `sum` that sum all the numbers
//   until the given parameter and returns with an integer