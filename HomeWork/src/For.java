
public class For {

	public static void main(String[] args) {
		// %가 순서대로 하나씩 증가되어서 정렬
		for (int i = 0; i < 5; i++) {
			for (int j = i; j < 5; j++)

				System.out.print("%");

			System.out.println();
		}

	}

}
