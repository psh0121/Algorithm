import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaekJoon_3052 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[10];
		
		// 배열안에 값 받아오기 
		for(int i = 0; i < 10; i++)
		{
			arr[i] = scan.nextInt();
		}
		
		List<Integer> nanugi = new ArrayList<Integer>();
		
		int cnt = 0;
		
		for(int j = 0; j < 10; j++)
		{
			if(!nanugi.contains(arr[j] % 42))
			{
				nanugi.add(arr[j] % 42);
				cnt++;
			}
		}
		
		System.out.println(cnt);

	}

}
