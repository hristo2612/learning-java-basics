import java.text.DecimalFormat;
import java.util.Scanner;

public class BmiCalculator {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    double height, weight;

    System.out.print("Your height in CM? ");
    height = keyboard.nextDouble();

    System.out.print("Your weight in KG? ");
    weight = keyboard.nextDouble();

    keyboard.close();

    double heightInMeters = height / 100;
    // To calcualte BMI you must divide the user's weight by the square of the users height in meters
    double bmiCalculation = weight / (Math.pow(heightInMeters, 2));

    System.out.println("Your BMI is: " + new DecimalFormat("#.##").format(bmiCalculation));

  }
}
