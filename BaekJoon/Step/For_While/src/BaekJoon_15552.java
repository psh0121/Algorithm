import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon_15552 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cnt = Integer.parseInt(br.readLine()); //개수
		
		String nums; // 반복문을 통해 입력받아질 숫자들 
		int A;
		int B;
		
		for(int i = 0; i < cnt; i++)
		{
			nums = br.readLine();
			A = Integer.parseInt(nums.split(" ")[0]);
			B = Integer.parseInt(nums.split(" ")[1]);
			
			bw.write(A+B + "\n");
		}
		bw.flush(); // 한번만해주면 됨.
		bw.close();
	}

}
