import java.util.Scanner;

public class BaekJoon_10950 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int cnt = scan.nextInt();
		int[] arr = new int[cnt];
		
		for(int i = 0; i < cnt; i++)
		{
			int n1 = scan.nextInt();
			int n2 = scan.nextInt();
			
			arr[i] = n1 + n2;
		}
		
		for(int j = 0; j < cnt; j++) {
			System.out.println(arr[j]);
		}

	}

}
