import java.util.Scanner;

public class BaekJoon_4344 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cnt = scan.nextInt();
		
		int total; // 한반 학생수
		int[] grade = null; // 한번 점수들 
		int sum = 0;
		double avg = 0;
		int studentCnt = 0; // 평균 넘는 학생 수 
		
		for(int i = 0; i < cnt; i++) // 배열에 채워넣기 + 반 평균구하기 
		{
			sum = 0;
			studentCnt = 0;
			
			total = scan.nextInt();
			grade = new int[total];
			for(int j = 0; j < total; j++)
			{
				grade[j] = scan.nextInt();
				sum = sum + grade[j];
			}
			
			avg = sum / total;
			
			for(int k = 0; k < grade.length; k++)
			{
				if(grade[k] > avg)
				{
					studentCnt++;
				}
			}
			
			double result = (double) studentCnt / total * 100;
			
			System.out.printf("%.3f", result);
			System.out.print("%");
			System.out.println("");
		}

	}

}
