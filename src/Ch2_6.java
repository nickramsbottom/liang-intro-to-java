import java.util.Scanner;

public class Ch2_6 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a whole number between 0 and 1000: ");
    int number = input.nextInt();

    int first = number % 10;
    int rest = number / 10;
    int second = rest % 10;
    rest = rest /10;
    int third = rest % 10;

    int sum = first + second + third;
    
    input.close();
    
    System.out.println(sum);
  }
}
