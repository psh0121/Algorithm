import java.util.Scanner;

public class BaekJoon_2739 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dan = scan.nextInt();
		int mul = 1;
		
		for(int i = 0; i < 9; i++)
		{
			System.out.println(dan + " * " + mul + " = " + (dan*mul));
			mul++;
		}

	}

}
