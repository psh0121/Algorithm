import java.util.Scanner;

public class BaekJoon_1065 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String[] value = Integer.toString(num).split("");
		
		// 길이가 2이하이면 무조건 다 한수
		if(value.length <= 2)
		{
			System.out.println(num);
			return;
		}
		
		int hanNumCnt = 99; // 3자리수 이면 일단 2자리수는 무조건 한수로보고 시작 
		
		int gap = 0; // 공차 입
		String[] nums; // 숫자를 문자형 배열화해서 공차 확인할 예정 
		
		boolean hansu = true;
		
		for(int i = 100; i <= num; i++)
		{
			hansu = true;
			
			nums = Integer.toString(i).split("");
			
			// 반복문 돌리기전 미리 공차 선언해주기
			gap = Integer.parseInt(nums[0]) - Integer.parseInt(nums[1]);	 
			
			// 옆에있는 값과 공차확인후 hanNumCnt 개수 올리기 
			for(int j = 1; j < nums.length - 1; j++)
			{
				// 공차가 다른 순간 끝내버리기 
				if((Integer.parseInt(nums[j]) - Integer.parseInt(nums[j + 1])) != gap)
				{
					hansu = false;
					break;
				}
					
			}
			
			if(hansu == true)
				hanNumCnt++;
			
		}

		System.out.println(hanNumCnt);
	}

}
