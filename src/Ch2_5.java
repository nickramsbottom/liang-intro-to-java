import java.util.Scanner;

public class Ch2_5 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("enter subtotal in dollars and tip percentage: ");
    double subtotal = input.nextDouble();
    double tipPer = input.nextDouble();

    double tip = subtotal * tipPer / 100;
    double total = subtotal + tip;
    
    input.close();

    System.out.println("Tip is " + tip + " and total is " + total);
  }
}
