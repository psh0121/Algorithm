import java.util.Scanner;

public class BaekJoon_1157 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] word = scan.next().toUpperCase().split("");
		
		String[] alpha = "abcdefghijklmnopqrstuvwxyz".toUpperCase().split("");
		int[] cnt = new int[26];
		
		// 데이터에 배열 alpha 인덱스에 맞춰서 cnt 값 넣기 
		for(int i = 0; i < word.length; i++)
		{
			for(int j = 0; j < alpha.length; j++)
			{
				if(alpha[j].equals(word[i]))
				{
					cnt[j]++;
				}
			}
		}
		
		int maxCnt = 0;			// 가장 많은 개수 
		int maxIndex = 0;		// 가장 많이 나온 값의 인덱스값 
		int sameCnt = 0;		// 같은 개수가 나온 값의 개수 
		
		for(int i = 0; i < alpha.length; i++)
		{
			if(cnt[i] > maxCnt)
			{
				maxCnt = cnt[i];
				maxIndex = i;
				sameCnt = 0;
			}
			else if(cnt[i] == maxCnt)
			{
				sameCnt++;
			}
		}
		
		if(sameCnt > 0)
		{
			System.out.println("?");
		}
		else {
			System.out.println(alpha[maxIndex]);
		}
		
		
	}

}
