import java.util.Scanner;

public class BaekJoon_2884 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int hour = scan.nextInt();
		int min = scan.nextInt();
		
		if(min >= 45) {
			System.out.println(hour);
			System.out.println(min-45);
		}
		else {
			if(hour == 0) {
				System.out.println(23);
			}
			else {
				System.out.println(hour - 1);
			}
			
			System.out.println((60+min)-45);
		}

	}

}
