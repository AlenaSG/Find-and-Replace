import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("Enter a word or phrase");
    String originalString = myConsole.readLine();
    System.out.println("Enter a word or phrase you're looking to erase");
    String doesItContain = myConsole.readLine();
    System.out.println("What word or phrase would you like to substitue in its place?");
    String replaceWith = myConsole.readLine();

    //int intUserNumber = Integer.parseInt(stringUserNumber);
    FindAndReplace userPhrase = new FindAndReplace();
    String finalOutput = userPhrase.findAndReplace(originalString, doesItContain, replaceWith);
    System.out.println(finalOutput);
  }
}
