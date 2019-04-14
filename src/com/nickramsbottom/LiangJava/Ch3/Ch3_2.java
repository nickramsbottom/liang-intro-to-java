import java.util.Scanner;

public class Ch3_2 {

  public static void main(String[] args) {
    int number1 = (int)(Math.random() * 10);
    int number2 = (int)(Math.random() * 10);
    int number3 = (int)(Math.random() * 10);
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("What is " + number1 + " + " +
        number2 + " + " + number3 + "?");
    
    int number = input.nextInt();
    int sum = number1 + number2 + number3;
    
    System.out.println(number1 + " + " +
        number2 + " + " + number3 + " is " + number + "? " + (sum == number));
    
    input.close();
  }

}
