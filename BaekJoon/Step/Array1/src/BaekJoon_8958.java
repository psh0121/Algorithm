import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_8958 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = Integer.parseInt(br.readLine());
		String[] arr = new String[cnt];
		
		for(int i = 0; i < cnt; i++)
		{
			arr[i] = br.readLine();
		}
		
		String[] box; // 반복문을 통해 ox를 판별하기 위한 임시공간
		int gradeO = 0;
		int sum = 0;
		
		for(int j = 0; j < cnt; j++)
		{
			gradeO = 0;
			sum = 0;
			
			for(int k = 0; k < arr[j].length(); k++)
			{
				if(arr[j].charAt(k) == 'O')
				{
					gradeO++;
					sum = sum + gradeO;
				}
				else {
					gradeO = 0;
				}
			}
			
			System.out.println(sum);
		}

	}

}
