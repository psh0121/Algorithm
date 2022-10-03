import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_10818 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cnt = scan.nextInt();
		
		int[] arr = new int[cnt];
		
		for(int i = 0; i < cnt; i++)
		{
			arr[i] = scan.nextInt();
		}
		
		Arrays.sort(arr);
		
		System.out.println(arr[0] + " " + arr[arr.length - 1]);

	}

}
