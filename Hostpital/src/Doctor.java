
public class Doctor {

	private DoctorModel doctorModel;

	public Doctor(DoctorModel doctorModel) {
		this.doctorModel = doctorModel;
	}

	// 환자 병적 조회
	public void inquery() {
		System.out.println(doctorModel.getComputer() + "에서 환자의 이름을 조회합니다.");
	}

	// 환자 진료
	public void treatment() {
		System.out.println("의사가" + doctorModel.getMedicalAppliance() + "로 의사가 환자를 진료합니다.");
	}

	// 처방전 작성
	public void prescription() {
		System.out.println("의사가" + doctorModel.getComputer() + "로 환자의 처방전을 작성합니다.");
	}

}
