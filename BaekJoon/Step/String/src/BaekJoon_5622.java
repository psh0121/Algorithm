import java.util.Scanner;

public class BaekJoon_5622 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] str = scan.next().split("");
		
		String[][] phone = new String[][] {{},{},{"A","B","C"},
			{"D","E","F"},{"G","H","I"},{"J","K","L"},{"M","N","O"},
			{"P","Q","R","S"},{"T","U","V"},{"W","X","Y","Z"}};
			
		boolean inAlphabet = false;
		
		int result = str.length;		// 각 번호위치에서 +1 
			
		for(int i = 0; i < str.length; i++)
		{
			for(int j = 0; j < phone.length; j++)
			{
				inAlphabet = false;
				
				for(int k = 0; k < phone[j].length; k++)
				{
					if(str[i].equals(phone[j][k]) == true)
					{
						inAlphabet = true;
						break;
					}
				}
				
				if(inAlphabet == true)
				{
					result = result + j;
					break;
				}
			}
		}
		
		System.out.println(result);

	}

}
