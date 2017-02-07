

public class Doctor {

	private String computer ;
	private String medicalAppliance ;  //인스턴스변수는 생성과 동시 값을 가지면 안된다. 생성자를 생성하는게 효율적 
	
	public Doctor(){
		this.computer = "전산시스템";
		this.medicalAppliance = "청진기"; 
	}
	public Doctor(String name, String computer, String medicalappliance){ //값을 초기화할때 생성자 
		System.out.println("Docter 생성자가 호출되었습니다.");
		this.computer = computer;
		this.medicalAppliance  = medicalappliance;
		System.out.println(name+"객체가 생성되었습니다.");
	}

	// 생성자
	public void setComputer(String computer) {
		this.computer = computer;
	}

	public String getComputer() {
		return computer;
	}

	public void setMedicalAppliance(String medicalAppliance) {
		this.medicalAppliance = medicalAppliance;
	}

	public String getMedicalAppliance() {
		return medicalAppliance;
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
		System.out.println("의사가" + computer + "로 환자의 처방전을 작성합니다.");
	}

}
