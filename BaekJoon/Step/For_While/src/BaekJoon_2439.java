import java.util.Scanner;

public class BaekJoon_2439 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		int starCnt = 1;
		String star = "*";
		
		for(int i = 0; i < num; i++)
		{
			for(int j = 0; j < (num - starCnt); j++)
			{
				System.out.print(" ");
			}
			
			for(int k = 0; k < starCnt; k++)
			{
				System.out.print(star);
			}
			
			System.out.println("");
			starCnt++;
		}

	}

}
