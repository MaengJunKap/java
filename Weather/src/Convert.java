import java.util.Scanner;

public class Convert {

	public static void main(String[] args) {

		// 입력 받기위해 Scanner클래스를 생성

		Scanner input = new Scanner(System.in);

		// 메뉴를 입력하라는 안내문 출력
		System.out.println("메뉴");
		System.out.println("1:섭씨를 화씨로 바꾸기. 2: 화씨를 섭씨로 바꾸끼");

		// 메뉴를 입력받는다.
		int menu = input.nextInt();

		// 만일 1을 입력하면 섭씨를 화씨로 계산한 결과 출력
		if (menu == 1) {
			System.out.println("섭씨를 입력하세요!");
			double cel = input.nextDouble();
			double fah = (cel * 1.8) + 32;
			String message = String.format("섭씨 %.1f도는 화씨 %.1f도 입니다.", cel, fah); 
			System.out.println(message); 


		}
		// 만일 2을 입력하면 화씨를 섭씨로 계산한 결과 출력

		else if (menu == 2) {
			System.out.println("화씨를 입력하세요!");
			double fah = input.nextDouble();
			double cel = (fah - 32) / 1.8;

			String message = String.format("섭씨 %.1f도는 화씨 %.1f도 입니다.", fah, cel);
			System.out.println(message);

		}
	}

}
