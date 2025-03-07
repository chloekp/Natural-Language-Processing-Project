import java.util.ArrayList;

public class NLPRunner {
  public static void main(String[] args) {

    // Instantiate a MyNLP object ("student-developed class")
    
    KeywordExtract nlp = new KeywordExtract();
    
    nlp.addTextData();
    nlp.prompt();
    nlp.KeywordExtraction();
    nlp.displayExtraction();
    nlp.printSummary();
    
  }
}
