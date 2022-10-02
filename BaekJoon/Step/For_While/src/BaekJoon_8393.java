import java.util.Scanner;

public class BaekJoon_8393 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		int sum = 0;
		int sNum = 1;
		
		for(int i = 0; i < num; i++)
		{
			sum = sum + sNum;
			sNum++;
		}
		
		System.out.println(sum);
	}

}
