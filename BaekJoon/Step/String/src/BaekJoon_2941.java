import java.util.Scanner;

public class BaekJoon_2941 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] str = scan.next().split("");
		
		String[] croatia = new String[] {"c=", "c-",
										"d-", "lj", "nj", "s=", "z="};
		
		int result = 0;
		int index = 0;
		
		while(index < str.length)
		{
			boolean resultUp = false;
			
			// 인덱스 길이만큼만 값을 확인하도록 한다. 
			if((index + 1) < str.length && (index + 2) < str.length)
			{
				if((str[index] + str[index + 1] + str[index + 2]).equals("dz=")
						== true)
				{
					result++;
					index = index + 3;
					continue;
				}
			}
			
			if((index + 1) < str.length)
			{
				for(int i = 0; i < croatia.length; i++)
				{
					if((str[index] + str[index + 1]).equals(croatia[i]) == true)
					{
						result++;
						index = index + 2;
						resultUp = true;
						break;
					}
				}
			}
			
			if(resultUp == false)
			{
				result++;
				index = index + 1;
			}
		}
		
		System.out.println(result);

	}

}
