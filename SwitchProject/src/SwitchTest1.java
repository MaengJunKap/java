
public class SwitchTest1 {

	public static void main(String[] args) {

		/*
		 * switch(){
		 * 
		 * case 1: //상태에 따른 진행 로직
		 * 
		 * case 2:
		 * 
		 * case 3: default:// 마무리작업
		 * 
		 * }
		 */
		// 라면 끓이기 프로세스

		final int READY = 1;
		// 냄비에 물을 넣는다.
		final int WATER = 2;

		// 가스불에 냄비를 올린다.

		final int FIRE = 3;

		// 물을 끊인다.
		final int BOIL = 4;
		// 면과 소스를 넣는다.
		final int INJECT = 5;
		// 가스불을 끈다.
		final int OFF = 6;
		// 먹는다.
		final int EAT = 7;

		// 현재의 상태를 저장할 숫자 변수를 만들고 1을 할당한다.

		int nowSate = READY; // 그전거는 생략하고 적은것부터 시작

		switch (nowSate) {
		case READY:
			System.out.println("냄비를 꺼낸다.");
		case WATER:
			System.out.println("냄비에 물을 넣는다.");
		case FIRE:
			System.out.println("가스불에 냄비를 올린다.");
		case BOIL:
			System.out.println("물을 끊인다.");
			break; // swtich를 종료한다.
		case INJECT:
			System.out.println("소스와 면을 넣는다.");
		case OFF:
			System.out.println("불을 끈다.");
		case EAT:
			System.out.println("라면을 먹는다.");
		default:
			System.out.println("설거지를 한다.");

		}
	}

}
