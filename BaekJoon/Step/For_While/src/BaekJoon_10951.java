import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_10951 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String nums;
		int A;
		int B;
		
		while((nums = br.readLine()) != null)
		{	
			A = Integer.parseInt(nums.split(" ")[0]);
			B = Integer.parseInt(nums.split(" ")[1]);
			
			System.out.println(A + B);
		}
	}

}
