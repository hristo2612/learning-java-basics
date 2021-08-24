import java.util.Scanner;

public class AskingQuestions {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    int age;
    String height;
    double weight;

    System.out.print("How old are you? ");
    age = keyboard.nextInt();

    System.out.print("How tall are you? ");
    height = keyboard.next();

    System.out.print("How much do you weight? ");
    weight = keyboard.nextDouble();

    keyboard.close();

    System.out.println("So you're " + age + "years old, " + height + "cm tall and " + weight + " kg.");
  }
}
