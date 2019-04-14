import java.util.Scanner;

public class Ch3_8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int first = input.nextInt();
		int second = input.nextInt();
		int third = input.nextInt();
		
		if (second > first) {
			int temp = first;
			first = second;
			second = temp;
		}
		
		if (third > second) {
			int temp = second;
			second = third;
			third = temp;
		}
		
		if (second > first) {
			int temp = first;
			first = second;
			second = temp;
		}
		
		input.close();
		
		System.out.println(first + " " + second + " " + third);
	}

}
