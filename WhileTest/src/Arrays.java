
public class Arrays {

	public static void main(String[] args) {

		// 배열안의 있는 모든 원소를 출력한다.

		// 1. 배열을 정의하고 값을 할당한다.

		String[] names = { "사과", "배", "바나나" };

		// 2. 배열의 원소 개수를 변수에 담아 보관한다.

		int nameCount = names.length;

		// 3. 배열의 원소 개수만큼 반복하며, 각 원소를 출력한다.
		// 3-1. 반복값을 정의하고 , 0으로 초기화한다.
		int i = 0; // 배열이라 0부터 시작
		// 3-2. while문을 이용 조건은 반복값이 nameCount 보다 작을 떄까지만으로 한다.
		while (i < nameCount) {

			// 3-3 반복 구분 : names 배열의 원소를 꺼내 출력한다.

			// names(0) , names(1) ,names(2)
			System.out.println(names[i]);

			// 3-4. 반복값을 증가시킨다.

			i++; // 0부터 출력해야 해서 마지막 입력
		}

		// 10개 점수의 총점을 구하는 프로그램.

		// 1. 점수10개를 배열에 선언하고 초기화

		int[] scores = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

		// 2. 배열의 원소 개수를 변수에 담아 보관
		int scoreCount = scores.length;

		// 3. 반복에 사용할 증가 값을 선언하고 0으로 초기화
		int j = 0;

		// 4. 총점을 계산해 담을 변수를 선언하고 0으로 초기화
		int sum = 0;

		// 5. 반복을 수행하며 원소를 모두 더한다.

		while (j < scoreCount) {
			sum += scores[j];
			j++;

		}

		// 6.총점 변수를 출력

		System.out.println("총점은" + sum + "점입니다.");

	}
}
