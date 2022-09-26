import java.util.Scanner;

public class BaekJoon_2525 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int hour = scan.nextInt();
		int min = scan.nextInt();
		int plusMin = scan.nextInt();
		
		int totalMin = min + plusMin;
		
		if(totalMin >= 60) {
			hour = hour + (totalMin / 60);
			totalMin = totalMin % 60;
			
			if(hour >= 24) {
				hour = hour - 24;
			}
		}
		System.out.println(hour + " " + totalMin);
	}

}
