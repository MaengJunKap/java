package ifTest2;

import java.util.Scanner;

public class IfTest5 {

	public static void main(String[] args) {
		/*
		 * 국어 ,영어,수학,과학 점수를 총점과 평균을 구한다.
		 * 
		 * 평균이 90점이상이면 "참 잘했어요!를 출력하고
		 * 
		 * 그게아니면 "노력하세요!를 출력한다." "
		 * 
		 * 
		 */
		// 점수를 입력받기 위한 Scanner클래스 생성
		Scanner input = new Scanner(System.in);
		// 메뉴를 입력 받을거선언

		// 총점 계산
		System.out.println("국어점수:");
		int kor = input.nextInt();
		System.out.println("영어점수:");
		int eng = input.nextInt();
		System.out.println("수학점수:");
		int num = input.nextInt();
		System.out.println("과학점수:");
		int s = input.nextInt();

		int sum = kor + eng + num + s;

		// 평균계산
		double average = sum / 4.0;
	

		// 평균 90점이상이면 참 잘했어요 출력 조건문
		if (average >= 90) {
			System.out.println("참 잘했어요!");

		}

		// 평균 90점이 아니면 노력하세요!출력 조건문
		else {
			System.out.println("노력하세요!");

		}
		String message = String.format("총점은 %d, 평균은 %.2f입니다.", sum, average);
		System.out.println(message);
	}

}
