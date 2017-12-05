import java.util.Scanner;

public class Ch2_10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter kg, t1 and t2 separated by spaces: ");
		double M = input.nextDouble();
		double t1 = input.nextDouble();
		double t2 = input.nextDouble();
		
		double Q = M * (t2 - t1) * 4184;
		
		System.out.println(Q);
		input.close();
	}

}
