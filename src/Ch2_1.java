import java.util.Scanner;

public class Ch2_1 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("enter a degree in celcius: ");
    double celcius = input.nextDouble();

    double fahrenheit = ((9.0 / 5) * celcius + 32);
    System.out.println(fahrenheit + " Fahrenheit");
    
    input.close();
  }
}