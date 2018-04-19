package Exam1;

public class CopyArg {

  String[] args;

  public CopyArg(String[] args) {
    this.args = args;
  }

  public boolean noArgs() {
    return args.length == 0;
  }

  public boolean isCopy() {
    return args[0].equals("-copy");
  }

  public void noArgsPrinter() {
    System.out.println("copy [source] [destination]");
  }
}
