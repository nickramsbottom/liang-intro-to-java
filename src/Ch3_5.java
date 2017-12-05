import java.util.Scanner;

public class Ch3_5 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter today's day: ");
    int today = input.nextInt() % 7;
    
    System.out.print("Enter the number of days elapsed since today: ");
    int elapsed = input.nextInt();
    
    int now = (today + elapsed) % 7;
    
    String[] days = {
        "Sunday",
        "Monday",
        "Tuesday",
        "Wednesday",
        "Thursday",
        "Friday",
        "Saturday"
    };
    
    System.out.print("Today is " + days[today] + " and the future day is " + days[now]);
    
    input.close();
  }

}
