import java.util.Scanner;

public class BaekJoon_1316 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String[] str;
		
		int result = 0;
		
		for(int i = 0; i < num; i++)
		{
			str = scan.next().split("");
			String checker = "";			// 이미 한번 거친 문자 넣는 변수
			String beforeStr = null;		// 이전 문자 확인
			
			boolean groupFlag = true;		// 그룹문자가 맞는지 확인 
			
			for(int j = 0; j < str.length; j++)
			{
				// 처음 시작단계라면 
				if(beforeStr == null)
				{
					checker = checker + str[j];
					beforeStr = str[j];
				}
				
				//현재 특정문자가 반복중인 상태가 확인된다면
				else if(checker.contains(str[j]) == true && beforeStr.equals(str[j]) == true )
				{
					continue;
				}
				
				// 이전에 한번 반복된적 있는 문자라면
				else if(checker.contains(str[j]) == true && beforeStr.equals(str[j]) == false)
				{
					groupFlag = false;
					break;
				}
				
				// 이전에 반복된적 없는 새로운 문자라면
				else if(checker.contains(str[j]) == false && beforeStr.equals(str[j]) == false)
				{
					checker = checker + str[j];
					beforeStr = str[j];
				}
			}
			
			if(groupFlag == true)
			{
				result++;
			}
		}
		
		System.out.println(result);

	}

}
