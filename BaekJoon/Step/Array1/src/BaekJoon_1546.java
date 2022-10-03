import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_1546 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cnt = scan.nextInt(); // 개수
		double[] arr = new double[cnt];
		
		for(int i = 0; i < cnt; i++)
		{
			arr[i] = scan.nextDouble();
		}
		
		double max = Arrays.stream(arr).max().getAsDouble(); // 최댓값 
		
		double sum = 0;
		
		for(int j = 0; j < cnt; j++)
		{
			sum = sum + (arr[j] / max * 100);
		}
		
		System.out.printf("%.10f", sum / cnt);

	}

}
