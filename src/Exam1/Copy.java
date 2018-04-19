package Exam1;


public class Copy {
  public static void main(String[] args) {
    // This should be the basic replica of the 'cp' command
    // If ran from the command line without arguments
    // It should print out the usage:
    // copy [source] [destination]
    // When just one argument is provided print out
    // No destination provided
    // When both arguments provided and the source is a file
    // Read all contents from it and write it to the destination

    CopyArg argHandler = new CopyArg(args);

    if (argHandler.noArgs()) {
      argHandler.noArgsPrinter();
    } else if (argHandler.isCopy()) {
      copy(args);
    }
  }
  public static void copy (String[] args){

  }
}
