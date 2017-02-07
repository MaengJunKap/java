/**
 * 데이터베이스의 값들을 바인딩 함..
 * 
 * @author owner
 *
 */
public class DoctorModel {

	private String computer;
	private String medicalAppliance;
	
	public DoctorModel() {
		
	}

	public DoctorModel(String computer, String medicalAppliance) {
		this.computer = computer;
		this.medicalAppliance = medicalAppliance;
	}

	public String getComputer() {
		return computer;
	}

	public void setComputer(String computer) {
		this.computer = computer;
	}

	public String getMedicalAppliance() {
		return medicalAppliance;
	}

	public void setMedicalAppliance(String medicalAppliance) {
		this.medicalAppliance = medicalAppliance;
	}

}
