public class Factorio {
  public static void main(String[] args) {
    int fact = 5;
    System.out.println(factorio(fact));
  }
  public static int factorio (int param){
    int fact = 1;
    for (int i = 1; i <= param; i++) {
      fact = fact * i;
    }
    return fact;
  }
}
//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial