import java.util.Scanner;

public class BaekJoon_25304 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int total = scan.nextInt(); // 총금액
		int count = scan.nextInt(); // 개수
		
		int sum = 0; // 계산해본 총금
		
		int price; // 반복문 가격
		int cnt; // 반복문 개
		
		for(int i = 0; i < count; i++)
		{
			price = scan.nextInt();
			cnt = scan.nextInt();
			
			sum = sum + (price * cnt);
		}
		
		if(sum == total)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}

	}

}
