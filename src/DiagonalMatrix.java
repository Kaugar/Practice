public class DiagonalMatrix {
  public static void main(String[] args) {
    int matrix[][] = new int[4][4];
    for (int row = 0; row < matrix.length; row++) {
      for (int col = 0; col < matrix[row].length; col++) {
        if (row == col) {
          System.out.print("1 ");
        } else {
          System.out.print("0 ");
        }
      }
      System.out.println();
    }
  }
}
// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output