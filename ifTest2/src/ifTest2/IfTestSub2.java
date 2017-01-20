package ifTest2;

public class IfTestSub2 {

	public static void main(String[] args) {

		// 1부터 100사이에 존재하는 모든 홀수를 출력하기

		// 1.1부터 100까지 반복 한다.

		for (int i = 1; i < 101; i++) {

			// 2. 홀수인지 확인한다.

			if (i % 2 == 1) {

				// i값이 홀수라면 반복을 건너뛴다.
				continue; // for, while에만 사용가능.

			}
			System.out.println(i);

		}

	}

}
