
public class Hostpital {

	public static void main(String[] args) {
		
		DoctorModel ���������  = new DoctorModel("�����е�1","���ð�1");
		DoctorModel �����������  = new DoctorModel("�����е�2","���ð�2");
		DoctorModel �����������  = new DoctorModel("�����е�3","���ð�3");
		

		
		Doctor[] doctors = new Doctor[3];
		doctors[0] = new Doctor(���������);
		doctors[1] = new Doctor(�����������);
		doctors[2] = new Doctor(�����������);
		

		
		for(int i =0; i< doctors.length; i++){
			doctors[i].inquery();
			doctors[i].treatment();
			doctors[i].prescription();
		}
		System.out.println("==================================");
		for(Doctor �ǻ�: doctors){
			�ǻ�.inquery();
			�ǻ�.treatment();
			�ǻ�.prescription();
		}
		
	}

}
