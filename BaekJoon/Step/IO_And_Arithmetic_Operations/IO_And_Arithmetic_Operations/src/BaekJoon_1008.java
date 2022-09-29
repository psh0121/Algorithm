import java.util.Scanner;

public class BaekJoon_1008 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		double result = (double) A / B;
		System.out.printf("%.9f", result);
	}

}