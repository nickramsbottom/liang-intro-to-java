import java.util.Scanner;

public class Ch3_6 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter weight in pounds: ");
    double weight = input.nextDouble();
    
    System.out.print("Enter feet: ");
    int feet = input.nextInt();
    
    System.out.print("Enter inches: ");
    double inches = input.nextDouble();
    
    double height = feet * 12 + inches;
    
    final double KILOGRAMS_PER_POUND = 0.45359237;
    final double METERS_PER_INCH = 0.0254;
    
    double weightInKilograms = weight * KILOGRAMS_PER_POUND;
    double heightInMeters = height * METERS_PER_INCH;
    double bmi = weightInKilograms /(Math.pow(heightInMeters, 2));
    
    System.out.print("Your BMI is: " + bmi);

    input.close();
  }

}
