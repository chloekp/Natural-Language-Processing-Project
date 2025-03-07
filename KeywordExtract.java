import java.util.ArrayList;
import java.util.Scanner;

public class KeywordExtract {

  // ArrayLists storing sentences and sentences that contain the user input
  // String storing the user's input
  
  ArrayList<String> textData = new ArrayList<>();
  ArrayList<String> matches = new ArrayList<>();

  String userInput = "";
  
  /**
   * Student Developed
   * Adds sentences to the ArrayList textData set to be compared with the user input
   */
  public void addTextData() {
    textData.add("Java is a popular programming language.");
    textData.add("Keyword extraction is useful in text analysis.");
    textData.add("Programming in Java can be fun and rewarding.");
    textData.add("Data structures like ArrayLists are very useful.");
    textData.add("String methods help manipulate text effectively.");
}

  /**
   * Starts the app and gets user input
   */
  public void prompt() {
    Scanner input = new Scanner(System.in);

    System.out.println("What word do you want to find?");
    userInput = input.nextLine().toLowerCase();

    input.close();
  }
  
  /** Student Developed
   * For each sentence in the ArrayList textData, this method checks if the sentence contains the text that the user input.
   * If it does, then that sentence is added to an ArrayList of sentences that match the user input.
   * @returns the matches ArrayList with the sentences that contains the user input
   */
  public void KeywordExtraction() {
  for (String sentence : textData) {
            if (sentence.toLowerCase().contains(userInput)) {
                matches.add(sentence);
            }
        }
  }
  
   /** Student Developed
   * For each sentence in the ArrayList matches, this method prints out the sentences containing the string of characters from the user input.
   * Otherwise, prints no matches.
   * @returns sentences containing user input
   */
   public void displayExtraction() {
        if (!matches.isEmpty()) {
            System.out.println("matching sentences:");
            for (String match : matches) {
                System.out.println("- " + match);
            }
        } else {
            System.out.println("no matches found");
        }
        
  }

  /**
   * Prints the summary of my NLP project
   */
  public void printSummary() {
    System.out.println("Our NLP project returns sentences from an ArrayList that contains text that matches the user's input text.");
  }
}
