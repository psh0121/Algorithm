import java.util.Scanner;

public class BaekJoon_10871 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cnt = scan.nextInt(); // 개수 
		int num = scan.nextInt(); // 비교대상넘버 
		
		int A;
		
		for(int i = 0; i < cnt; i++)
		{
			A = scan.nextInt();
			
			if(A < num)
			{
				System.out.print(A + " ");
			}
		}

	}

}
