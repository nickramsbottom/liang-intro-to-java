import java.util.Scanner;

public class Ch2_3 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("enter a value in feet ");
    double feet = input.nextDouble();

    double meters = (feet * 0.305);
    
    input.close();

    System.out.println(feet + " feet is " + meters + " meters");
  }
}
