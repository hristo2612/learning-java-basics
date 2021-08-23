public class LetterToYourself {
  public static void main(String[] args) {
    String letterTopAndBottomBorder = "+" + repeat("-", 60) + "+";
    System.out.println(letterTopAndBottomBorder);
    System.out.println("|" + repeat(" ", 55) + "####" + " |");
    System.out.println("|" + repeat(" ", 55) + "####" + " |");
    System.out.println("|" + repeat(" ", 55) + "####" + " |");
    System.out.println("|" + repeat(" ", 60) + "|");
    System.out.println("|" + repeat(" ", 60) + "|");
    System.out.println("|" + repeat(" ", 32) + "Hristo Bogoev" + repeat(" ", 15) + "|");
    System.out.println("|" + repeat(" ", 32) + "Sofia, Bulgaria" + repeat(" ", 13) + "|");
    System.out.println("|" + repeat(" ", 32) + "Ul. Rezbarska, 7" + repeat(" ", 12) + "|");
    System.out.println("|" + repeat(" ", 60) + "|");
    System.out.println(letterTopAndBottomBorder);
  }

  private static String repeat(String s, int n) {
    return s.repeat(n);
  }
}
