import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon_10952 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String nums;
		int A;
		int B;
		
		while(true)
		{
			nums = br.readLine();
			A = Integer.parseInt(nums.split(" ")[0]);
			B = Integer.parseInt(nums.split(" ")[1]);
			
			if((A == 0) && (B == 0))
			{
				break;
			}
			
			bw.write((A+B) + "\n");
		}
		
		bw.flush();
		bw.close();

	}

}
