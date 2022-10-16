import java.util.Scanner;

public class BaekJoon_2908 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] num1 = scan.next().split("");
		String[] num2 = scan.next().split("");
		
		String rNum1 = "";
		String rNum2 = "";
		
		for(int i = 0; i < num1.length; i++)
		{
			rNum1 = rNum1 + num1[num1.length - 1 - i];
		}
		
		for(int i = 0; i < num2.length; i++)
		{
			rNum2 = rNum2 + num2[num2.length - 1 - i];
		}
		
		if(Integer.parseInt(rNum1) > Integer.parseInt(rNum2))
		{
			System.out.println(rNum1);
		}
		else
		{
			System.out.println(rNum2);
		}

	}

}
