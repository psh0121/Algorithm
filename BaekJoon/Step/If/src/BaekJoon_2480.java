import java.util.Scanner;

public class BaekJoon_2480 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		
		int value = 0;
		
		if((A == B) && (A == C) && (B == C)) { // 다맞을 경
			value = 10000 + (A * 1000);
		}
		else if((A == B) || (A == C)){ // 두개맞을 경우 
			value = 1000 + (A * 100);
		}
		else if(B == C){ // 두개맞을 경우 
			value = 1000 + (B * 100);
		}
		else { // 다 안맞을 경우 
			if(A > B) {
				if(A > C) {
					value = A * 100;
				}
				else {
					value = C * 100;
				}
			}
			else {
				if(B > C) {
					value = B * 100;
				}
				else {
					value = C * 100;
				}
			}
		}
		
		System.out.println(value);

	}

}
