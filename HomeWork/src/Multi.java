import java.util.Scanner;

/**
 * <pre>
	 *  1을 입력하면 점수 5개  총점,평균을 계산하는 프로그램 
	 *  2을 입력하면 섭씨를 화씨로 변경하는 프로그램
	 *  3을 입력하면 BMI를 계산하는 프로그램 
	 *  4을 입력하면 프로그램이 종료
 * </pre>
 * 
 */
public class Multi {

	public static void main(String[] args) {

		// 입력 받기위해 Scanner클래스를 선언

		Scanner input = new Scanner(System.in);

		// 입력받을걸 선언
		System.out.println("사용하실 프로그램를 골라주세요!번호입력!");
		System.out.println("1 : 점수 5개의 총점,평균을 계산하는 프로그램 ");
		System.out.println("2 : 섭씨를 화씨로 변경하는 프로그램 ");
		System.out.println("3 : BMI를 계산하는 프로그램  ");
		System.out.println("4 : 프로그램이 종료 ");

		int ProgramMenu = input.nextInt();
		// 참이면 계속 반복하도록 while문 작성
		while (true) {
			// 1을 입력하면 5개의 총점 과 평균을 계산하는 프로그램이 나오는 조건문
			if (ProgramMenu == 1) {
				System.out.println(" 총점,평균을 계산하는 프로그램 ");
				System.out.println("점수 5 개를 입력해주세요!");
				int number = 0;
				int sum = 0;

				for (int i = 0; i < 5; i++) {

					number = input.nextInt();
					sum += number;

				}
				double average = sum / 5.0;
				String message = String.format("점수 5개의 총점은 %d 이고, 평균은 %,2f 입니다.", sum, average);
				System.out.println(message);

			}
			// 2을 입력하면 섭씨를 화씨로 변경하는 프로그램이 나오는 조건문
			if (ProgramMenu == 2) {
				System.out.println("섭씨를 화씨로 변경하는 프로그램");
				System.out.println("섭씨를 입력하세요!");
				double cel = input.nextDouble();
				double fah = (cel * 1.8) + 32;
				String message = String.format("섭씨 %.1f도는 화씨 %.1f도 입니다.", cel, fah);
				System.out.println(message);

			}
			// 3을 입력하면 BMI를 계산하는 프로그램이 나오는 조건문
			if (ProgramMenu == 3) {
				
				System.out.println("BMI를 계산하는 프로그램");
				
				System.out.println("몸무게를 입력해주세요(kg단위)");
				double weihgt = input.nextDouble();
				System.out.println("신장를 입력해주세요(m단위)");
				double height = input.nextDouble(); 
				//BMI를 계산 
				//몸무게(kg) / (신장(m) x 신장(m))
				 double bmi = weihgt/height*height;
				 String bimResult =  String.format("몸무게는 %.2f 이고, 신장은 %.23f 이므로 %.2f 입니다.", weihgt,height,bmi);
				 System.out.println(bimResult);
			}
			
			if(ProgramMenu==4){
				
				System.out.println("시스템을 종료");
				break;
			}
		}

		
		// 4을 입력하면 종료가 되도록 조건문 선언

	}

}
