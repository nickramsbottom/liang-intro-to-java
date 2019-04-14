import java.util.Scanner;

public class Ch2_4 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("enter a number in lbs ");
    double lbs = input.nextDouble();

    double kgs = (lbs * 0.454);
    
    input.close();
    
    System.out.println(lbs + " lbs is " + kgs + " kgs");
  }
}
