
public class Doctor {

	private DoctorModel doctorModel;

	public Doctor(DoctorModel doctorModel) {
		this.doctorModel = doctorModel;
	}

	// ȯ�� ���� ��ȸ
	public void inquery() {
		System.out.println(doctorModel.getComputer() + "���� ȯ���� �̸��� ��ȸ�մϴ�.");
	}

	// ȯ�� ����
	public void treatment() {
		System.out.println("�ǻ簡" + doctorModel.getMedicalAppliance() + "�� �ǻ簡 ȯ�ڸ� �����մϴ�.");
	}

	// ó���� �ۼ�
	public void prescription() {
		System.out.println("�ǻ簡" + doctorModel.getComputer() + "�� ȯ���� ó������ �ۼ��մϴ�.");
	}

}
