
public class Hostpital {

	public static void main(String[] args) {

		PatientModel patientModel = new PatientModel("아모개",10, "갑자기"+Doctor.SHOULDER+"가 아픕니다.");
		Patient amoga = new Patient(patientModel);
		
		DoctorModel kimsbujang = new DoctorModel("아이패드", "내시경");
		Doctor mjk = new Doctor(kimsbujang);
		mjk.requestTreatment(amoga);
		
		
		

	}

}
