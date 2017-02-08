
public class StringAPI {
	// 인덱스로 할수있는것들

	public void testIndexOf() {

		String password = "Unigen";

		int smallLettersCounts = 0; // 소문자갯수
		int bigLettersCounts = 0; // 대문자개수

		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String bigLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		for (int i = 0; i < password.length(); i++) {
			if (smallLetters.indexOf(password.charAt(i)) > -1) {
				smallLettersCounts++;
			} else if (bigLetters.indexOf(password.charAt(i)) > -1) {
				bigLettersCounts++;
			}

		}
		System.out.println(smallLettersCounts);
		System.out.println(bigLettersCounts);
	}

	public void testSubString() {
		String eclispePath = "C:/Users/owner/Desktop/eclipse/eclipse.exe";
		System.out.println(eclispePath.lastIndexOf("/")); // 마지막 어디에 있는지 안나올때까지 탐색															
		System.out.println(eclispePath.substring(30)); // 어디부터 자를것인가
		System.out.println(eclispePath.substring(eclispePath.lastIndexOf("/") + 1));
		System.out.println(eclispePath.substring(31, 38));
		System.out.println(eclispePath.substring(eclispePath.lastIndexOf("/") + 1) + eclispePath.lastIndexOf("."));
	}

	public void startAndEndValidation() {
		String url = "https://domain.com/images/java.jpg"; // 앞부분과 끝부분 맞은지 확인
		// String url = "https://domain.com/images/java.png"; //앞부분과 끝부분 맞은지 확인

		if (url.startsWith("https://") && url.endsWith(".jpg")) {
			System.out.println(url + "올바른 경로  입니다.");
		} else {
			System.out.println(url + "은 올바른 경로가 아닙니다.");
		}
	}

	public void testTrim() {
		String usersName = " 	홍 길 동 ";
		System.out.println(usersName.length());
		System.out.println(usersName);

		usersName = usersName.trim();
		System.out.println(usersName.length());
		System.out.println(usersName);
	}

	public void tsetReplace() {

		String userName = "홍 길 동";
		System.out.println(userName);

		userName = userName.replaceAll(" ", "");
		System.out.println(userName);

		String content = "안녕하세요. \r\n 저는\r\n홍길동 입니다.\r\n";
		System.out.println(content);

		content = content.replaceAll("\n", "<br/>");
		content = content.replaceAll("\r", "");
		System.out.println(content);

		content = content.replaceAll("<br/>", "\n");
		System.out.println(content);

		String script = "<script>alert('hi';</script>)";
		script = script.replaceAll("<", "&lt");
		script = script.replaceAll(">", "&gt");
		System.out.println(script);

	}

	public static void main(String[] args) {
		StringAPI stringAPI = new StringAPI();
		stringAPI.tsetReplace();
	}

}
