
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

	// ȯ�� ���� ��ȸ
	private void inquery() {
		System.out.println(patient.talkMyName() + "��,������ ��ȸ �غ��ڽ��ϴ�.");
		System.out.println(doctorModel.getComputer() + "���� ȯ���� �̸��� ��ȸ�մϴ�.");
	}

	// ȯ�� ����
	private void treatment() {
		System.out.println(patient.talkTroubleType() + "..�׷��ñ��� ");
		System.out.println("�ǻ簡" + doctorModel.getMedicalAppliance() + "�� �ǻ簡 ȯ�ڸ� �����մϴ�.");
	}

	// ó���� �ۼ�
	private void prescription() {
		System.out.println(patient.talkMyAge() + "�� �̽ñ���. ���̿� �°� ó������ �� �帮�ڽ��ϴ�.");
		System.out.println("�ǻ簡" + doctorModel.getComputer() + "�� ȯ���� ó������ �ۼ��մϴ�.");
	}

}
