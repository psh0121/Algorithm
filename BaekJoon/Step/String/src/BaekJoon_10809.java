import java.util.Scanner;

public class BaekJoon_10809 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] words = scan.next().split("");
		
		String[] alphabet = "abcdefghijklmnopqrstuvwxyz".split("");
		
		int[] result = new int[26];
		
		for(int i = 0; i < result.length; i++)
		{
			result[i] = -1;
		}
		
		// 알파벳 하나하나 순회하면서 값 대입하기 
		for(int i = 0; i < words.length; i++)
		{
			for(int j = 0; j < alphabet.length; j++)
			{
				if(words[i].equals(alphabet[j]) == true)
				{
					if(result[j] == -1) {		// 처음만나는 알파벳이라면 
						result[j] = i;
					}
					break;
				}
			}
		}
		
		for(int i = 0; i < result.length; i++)
		{
			System.out.print(result[i] + " ");
		}
		

	}

}
