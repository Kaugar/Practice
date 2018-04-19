public class Printer {
  public static void main(String[] args) {
    String one= "First";
    String two= "Second";
    String three = "Third";
    System.out.println(printer(one,two,three));

  }
  private static String printer (String one, String two, String three){
    String sum = one + two + three;
    return sum;
  }
}
//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `printer`
//   which prints the input String parameters
// - It can have any number of parameters

// Examples
// printer("first")
// printer("first", "second")
// printer("first", "second", "third", "fourh")
// ...