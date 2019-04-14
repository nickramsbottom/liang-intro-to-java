import java.util.Scanner;

public class Ch3_1 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter a, b, c: ");
    double a = input.nextDouble();
    double b = input.nextDouble();
    double c = input.nextDouble();
    
    double discriminant = Math.pow(b, 2) - 4 * a * c;
    
    if (discriminant == 0) {
      double x = -b / (2 * a);
      
      System.out.println("One root: " + x);
    } else if (discriminant > 0) {
      double x1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
      double x2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);
      
      System.out.println("Two roots: " + x1 + " and " + x2);
    } else {
      System.out.println("No real roots.");
    }
    
    input.close();
  }

}
