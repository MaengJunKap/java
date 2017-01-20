package ifTest2;

public class IfTestSub1 {

	public static void main(String[] args) {
		
		
		// 1부터 100사이에 존재하는 모든 짝수를 출력하기 
		
		// 1.1부터 100까지 반복 한다.
		
		for(int i = 1; i<101; i++){
			
			// 2. i값이 짝수인지 확인한다.
			
			//3. i값이 짝수라면 출력한다.
			if( i%2==0){
				System.out.println(i);
			}
			
			
		}

	}

}
