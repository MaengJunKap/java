package ifTest2;

public class IfTest4 {

	public static void main(String[] args) {

		// 과목점수 4개

		int a =  70;

		int b = 60;

		int c = 50;

		int d = 60;

		// 총점
		int sum = a + b + c + d;

		// 평균
		double average = sum / 4.0;

		// 평균이 90점이 넘는다면 "참 잘했어요 를 출력"
		
		
		if (average>= 90) {

			System.out.println("참 잘했어요");

		}
		else{
			 System.out.println("노력하세요!");
			
		}
		
		//평균이 90점을 넘기지 못한다면 "노력하세요!를"를 출력한다
		//위 조건(average>=90의 결과가 false라면 "노력하세요!"를 붙인다.)
		
	}

}
