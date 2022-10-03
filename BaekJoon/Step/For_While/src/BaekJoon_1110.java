import java.util.Scanner;

public class BaekJoon_1110 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		int num = scan.nextInt();
		scan.close();
		
		int cnt = 0;
		int num2 = num; // 복사후 num과 값을 비교할 예정
		
		while(true)
		{
			num2 = ((num2 % 10) * 10) + (((num2 / 10) + (num2 % 10)) % 10);
			cnt++;
			
			if(num2 == num)
			{
				break;
			}
		}
		
		System.out.println(cnt);
	}

}
