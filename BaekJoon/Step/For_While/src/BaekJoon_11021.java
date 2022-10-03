import java.util.Scanner;

public class BaekJoon_11021 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int cnt = scan.nextInt();
		
		int sNum = 1; // case시작넘버 
		
		int A;
		int B;
		
		for(int i = 0; i < cnt; i++)
		{
			A = scan.nextInt();
			B = scan.nextInt();
			
			System.out.println("Case #" + sNum + ": " + (A+B));
			sNum++;
		}

	}

}
