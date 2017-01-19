import java.util.Scanner;

public class GugudanMain {
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);

		System.out.println("원하시는 구구단 입력(2~9)");
		
		System.out.print("원하는 구구단 :");
		 
		int dan = input.nextInt();
		
		int i = 0;

		while (i < 9) {
			
			i++;
			System.out.println(dan+"x"+i+"="+ (dan*i));

		}

		
	}

}
