import java.util.Scanner;

public class BaekJoon_2675 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cnt = scan.nextInt();
		
		int[] num = new int[cnt];			// 반복 횟수 
		String[] words = new String[cnt];	// 단어 
		
		// Scanner로 데이터 받기 
		for(int i = 0; i < cnt; i++)
		{
			num[i] = scan.nextInt();
			words[i] = scan.next();
		}
		
		String result = null;
		
		for(int i = 0; i < cnt; i++)
		{
			result = "";
			
			for(int j = 0; j < words[i].length(); j++)
			{
				// words[i]에 있는 값의 j번째에 있는 값을 num[i]만큼 반복해서 result안에 넣어줘 
				result = result + Character.toString(words[i].charAt(j)).repeat(num[i]);
			}
			
			System.out.println(result);
		}
		
	}

}
