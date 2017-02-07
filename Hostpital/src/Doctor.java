
public class Doctor {

	private String computer = "전산시스템";
	private String medicalAppliance = "청진기";

	// 생성자
	public void setComputer(String computer) {
		this.computer = computer;
	}

	public void setMedicalAppliance(String medicalAppliance) {
		this.medicalAppliance = medicalAppliance;
	}

	// 환자 병적 조회
	public void inquery() {
		System.out.println(computer + "에서 환자의 이름을 조회합니다.");
	}

	// 환자 진료
	public void treatment() {
		System.out.println("의사가" + medicalAppliance + "로 의사가 환자를 진료합니다.");
	}

	// 처방전 작성
	public void prescription() {
		System.out.println("의사가" + medicalAppliance + "로 환자의 처방전을 작성합니다.");
	}

}
