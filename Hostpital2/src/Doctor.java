
public class Doctor {

	private Patient patient;

	private DoctorModel doctorModel;

	public Doctor(DoctorModel doctorModel) {
		this.doctorModel = doctorModel;
	}

	public void requestTreatment(Patient patient) {
		this.patient = patient;
		 inquery();
		 treatment();
		 prescription();
	}

	// 환자 병적 조회
	private void inquery() {
		System.out.println(patient.talkMyName() + "님,병적을 조회 해보겠습니다.");
		System.out.println(doctorModel.getComputer() + "에서 환자의 이름을 조회합니다.");
	}

	// 환자 진료
	private void treatment() {
		System.out.println(patient.talkTroubleType() + "..그러시군요 ");
		System.out.println("의사가" + doctorModel.getMedicalAppliance() + "로 의사가 환자를 진료합니다.");
	}

	// 처방전 작성
	private void prescription() {
		System.out.println(patient.talkMyAge() + "살 이시군요. 나이에 맞게 처방전을 써 드리겠습니다.");
		System.out.println("의사가" + doctorModel.getComputer() + "로 환자의 처방전을 작성합니다.");
	}

}
