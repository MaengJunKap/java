
public class Hostpital {

	public static void main(String[] args) {

		PatientModel patientModel = new PatientModel("아모개",38, "마음이 아파요");
		Patient 아모개 = new Patient(patientModel);
		
		DoctorModel 김사부의장비 = new DoctorModel("아이패드1", "내시경1");
		Doctor 김사부 = new Doctor(김사부의장비);
		김사부.requestTreatment(아모개);
		//김사부.inquery();
		

	}

}
