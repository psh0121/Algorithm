import java.util.ArrayList;

public class BaekJoon_4673 {
	
	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<String>();
		
		// 데이터 값 넣기 
		int sNum = 1;
		
		for(int i = 0; i < 10000; i++)
		{
			arr.add(Integer.toString(sNum));
			sNum++;
		}
		
		
		// 셀프 넘버 빼주기 
		for(int i = 0; i < 10000; i++)
		{
			sNum = i + 1;
			
			if(arr.contains(Integer.toString(sNum)) == false)
				continue;
			
			// 문자열로 받은 값 하나씩 쪼개주기 
			String[] value = Integer.toString(sNum).split("");
			
			int sum = sNum;
			
			while(sNum < 10000)
			{
				// 셀프넘버 구하기 	
				for(int j = 0; j < value.length; j++)
				{
					sum = sum + Integer.parseInt(value[j]);
				}
				
				if(arr.contains(Integer.toString(sum)) == false)
					break;
				
				arr.remove(Integer.toString(sum));
				sNum = sum;
				value = Integer.toString(sNum).split("");
			}
		}
		
		// 출력하기
		for(int i = 0; i < arr.size(); i++)
		{
			System.out.println(Integer.parseInt(arr.get(i)));
		}
		
	}

}