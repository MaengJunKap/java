import java.util.Scanner;

/**
 * 
 * 일기예보 프로그램
 *
 */
public class Weather {

	public static void main(String[] args) {

		// 입력받기 위해 Scanner클래스를 생성

		Scanner input = new Scanner(System.in);
		
		while(true){
			System.out.println("오늘 날씨 어떤가요?");
			System.out.println("1.비가오네요. 2.비가 안오네요 3.종료");

			// 입력받을거 선언

			int menu = input.nextInt();

			// 1을 입력하면 "우산 가지고 가세요!"를 출력
			if (menu == 1) {
				System.out.println("우산 가지고 오세요!");
			}
			 // 2을 입력하면 "우산 가지고 가지 않으셔도 되요!"를 출력
			if (menu == 2) {
				System.out.println("우산 놓고 오세요!");
			}
			
			// 사용자가 3을 입력하면 반복 종료
			
			else if(menu==3){
				
				break;  // while문,for문 반복 즉시 종료 
				
			}
		}
		
			

	}

}
