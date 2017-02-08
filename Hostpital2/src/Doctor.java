
public class Doctor {
	
	public static final String  SHOULDER = "shoulder"; //객체에 점근하기위해 상수앞에 static
	public static final String ARMS = "arms";

	private int state;

	private Patient patient;

	private DoctorModel doctorModel;

	public Doctor(DoctorModel doctorModel) {
		this.doctorModel = doctorModel;
		state = 1;
	}

	public void requestTreatment(Patient patient) {
		this.patient = patient;

		/*
		 * switch(state){ 
		 * case 1: inquery(); state++; 
		 * case 2: treatment();
		 * state++; 
		 * break; 
		 * case 3: prescription(); 
		 * }
		 * 
		 */

		inquery();
		treatment();
		prescription();
	}

	// 환자 병적조회
	private void inquery() {
		System.out.println(patient.talkMyName() + "님 아프시네요");
		System.out.println(doctorModel.getComputer() + "로 병적조회");
	}

	// 환자진료
	private void treatment() {
		System.out.println(patient.talkTroubleType() + " 아프시군요");
		System.out.println("의사가" + doctorModel.getMedicalAppliance() + "로 환자를 진찰");
	}

	// 처방전 작성
	private void prescription() {
		if (patient.talkMyAge() >= 20) {

			System.out.println(patient.talkMyAge() + "살이시군요.강한약처방");
		} else {
			System.out.println(patient.talkMyAge() + "살이시군요.약한약");
		}
		System.out.println("의사가" + doctorModel.getComputer() + "처방");
			// 대소문자를 구분하지 않는 equalsIgnoreCase
		if (patient.talkTroubleType().equalsIgnoreCase(SHOULDER)) {
			System.out.println("우울증 약을 드릴께요");
		} else if (patient.talkTroubleType().toLowerCase().equals(ARMS.toLowerCase())) {
			//patient.toUpperCase().equals("arms".toUpperCase);
			System.out.println("파스를 드릴께요!");
		} else {
			System.out.println("방법이 없습니다.");
		}
		//System.out.println(patient.talkTroubleType().indexOf("HJK")); //없으면 무조건 -1 0이라해도 데이터가 있다고 판단
		
		if(patient.talkTroubleType().indexOf(ARMS)>-1){ //몇번째 어떠한 글자가 있는지 확인 글자가 있냐 없냐 확인때 사용 ,글자를 자를때도 사용
			System.out.println("파스를 드릴께요!");
		}
		else if(patient.talkTroubleType().indexOf(SHOULDER)>-1){
			System.out.println("파스 3장을 드릴께요");
		}
	}

}
