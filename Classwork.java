public class Classwork
{
  public static void main(String[] args)
  {
    System.out.println(firstLastN("dictionary", 3));
    System.out.println(delEnd("library", 5));
    System.out.println(comparyLower("framing", "framING"));
    System.out.println(lengthFirst("Down is the new up"));
  }

  public static String firstLastN(String word, int n) {
    
    // word = dictionary
    // n = 3
    // dicary
    
    String output;

    //Getting first n letters
    String firstN = word.substring(0, n);

    //getting last n letters
    int indexOfNToLast = word.length() - n;
    String lastN = word.substring(indexOfNToLast);

    output = firstN + lastN;
    return output;
   }

   public static String delEnd(String word, int n) {
    return word.substring(0, word.length() - n);
   }

   public static int comparyLower(String word1, String word2) {
    word1 = word1.toLowerCase();
    word2 = word2.toLowerCase();

    return word1.compareTo(word2);
   }

   public static int lengthFirst(String sentence) { 
    return sentence.indexOf(" ");
   }

}
