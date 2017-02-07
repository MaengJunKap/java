
public class Hostpital {

	public static void main(String[] args) {
		//가로있는건 메소드 생성자 가로안에서 값을 변경가능
		Doctor 김사부 = new Doctor("김사부","아이패드","체온계"); //생성자에 있는 타입에 맞게 값을 넣는다. 
	   //김사부.setComputer("MRI");
		김사부.inquery();
		김사부.treatment();
		
		String computer = 김사부.getComputer();
		String meString = 김사부.getMedicalAppliance();
		System.out.println("김사부의 컴퓨터는" + computer + "입니다.");
		System.out.println("김사부의 진료도구는 " + meString + "입니다.");

		Doctor 봉달희 = new Doctor();
		봉달희.treatment();
		봉달희.prescription();

	}

}
