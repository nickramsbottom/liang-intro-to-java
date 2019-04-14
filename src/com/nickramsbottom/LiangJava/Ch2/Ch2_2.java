import java.util.Scanner;

public class Ch2_2 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("enter a radius and height separated by a space: ");
    double radius = input.nextDouble();
    double height = input.nextDouble();

    double area = (Math.PI * radius * radius);
    double volume = area * height;
    
    input.close();

    System.out.println("Area: " + area);
    System.out.println("Volume: " + volume);
  }
}
