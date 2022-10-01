import java.util.Scanner;

public class BaekJoon_2588 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		String B = scan.next();
		
		scan.close(); // next()를 사용하려면 close()로 닫아주
		
		String[] arr =B.split("");
		
		int n3 = A * (Integer.parseInt(arr[2]));
		int n4 = A * (Integer.parseInt(arr[1]));
		int n5 = A * (Integer.parseInt(arr[0]));
		int n6 = n3 + (n4 * 10) + (n5 * 100);
		
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(n5);
		System.out.println(n6);
	}

}
