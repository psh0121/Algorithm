import java.util.Scanner;

public class BaekJoon_11720 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int cnt = scan.nextInt();
		String[] stringNums = scan.next().split("");
		
		int sum = 0;
		
		for(int i = 0; i < cnt; i++)
		{
			sum += Integer.parseInt(stringNums[i]);
		}
		
		System.out.println(sum);
	}

}